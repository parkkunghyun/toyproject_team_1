package com.example.toyproject.service;

import com.example.toyproject.entity.User;
import com.example.toyproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User create(String username, String email, String password){
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        userRepository.save(user);
        return user;
    }

    public User getUser(String username){
        Optional<User> findUser = userRepository.findByUsername(username);
        if(findUser.isPresent()){
            return findUser.get();
        } else {
            throw new DataNotFoundException("user not found");
        }
    }
}
