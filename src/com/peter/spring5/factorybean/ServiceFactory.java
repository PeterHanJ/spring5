package com.peter.spring5.factorybean;

import com.peter.spring5.service.AccountService;
import com.peter.spring5.service.UserService;


/**
 * This is a factory bean to create the service bean
 */
public class ServiceFactory {
    private static UserService userService = new UserService();
    private static AccountService accountService = new AccountService();

    public UserService createUserServiceInstance(){
        System.out.println("Create user service instance");
        return userService;
    }

    public AccountService createAccountServiceInstance(){
        System.out.println("Create account service instance");
        return accountService;
    }
}
