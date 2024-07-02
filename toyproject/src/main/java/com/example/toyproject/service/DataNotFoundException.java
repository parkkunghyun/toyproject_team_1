package com.example.toyproject.service;

public class DataNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public DataNotFoundException(String s) {
        super(s);
    }
}
