package controller.impl;

import controller.UserController;
import entiti.User;
import service.ServiceFactory;
import service.UserService;

import java.io.IOException;

public class UserControllerImpl implements UserController {
    private UserService userService;

    public  UserControllerImpl() {
        this.userService = ServiceFactory.getInstance().getUserService();
    }
    @Override
    public void addUser(User user) {
    userService.addUser(user);
    }

    @Override
    public void dellUser() {

    }

    @Override
    public void searchUser() {

    }

    @Override
    public void viewAllUsers() throws IOException {
    userService.viewAllUsers();
    }
}
