package com.peter.spring5.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClientService {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("staticFactory.xml");
        ClientService clientService = context.getBean("clientService", ClientService.class);

    }
}
