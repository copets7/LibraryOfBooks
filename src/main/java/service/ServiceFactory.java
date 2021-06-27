package service;

import service.impl.BookServiceImpl;
import service.impl.UserServiceImpl;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance(){
        if (serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    public UserService getUserService(){
        return new UserServiceImpl();
    }

    public BookService getBookService(){
        return new BookServiceImpl();
    }
}
