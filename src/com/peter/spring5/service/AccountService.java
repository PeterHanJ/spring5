package com.peter.spring5.service;

public class AccountService implements IBaseService{

    @Override
    public void serve() {
        System.out.println("Account service serve!");
    }
}
