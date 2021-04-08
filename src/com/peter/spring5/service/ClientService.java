package com.peter.spring5.service;

public class ClientService implements IBaseService {
    private static ClientService service = new ClientService();

    private ClientService(){

    }

    public static ClientService getInstance(){
        System.out.println("Client Service getInstance");
        return service;
    }

    @Override
    public void serve() {
        System.out.println("Client Service Serve!");
    }
}
