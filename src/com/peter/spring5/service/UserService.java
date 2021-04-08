package com.peter.spring5.service;

public class UserService implements IBaseService {
    @Override
    public void serve() {
        System.out.println("User service serve!");
    }
}
