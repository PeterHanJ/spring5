package com.peter.spring5.com.peter.spring5.factorybean;

import com.peter.spring5.service.AccountService;
import com.peter.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testServiceFactory {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanFactory.xml");
        AccountService accountService = context.getBean("accountService",AccountService.class);
        UserService userService = context.getBean("userService", UserService.class);

        accountService.serve();
        userService.serve();
    }
}
