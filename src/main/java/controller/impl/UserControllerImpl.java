package controller.impl;

import controller.UserController;
import entiti.User;
import service.ServiceFactory;
import service.UserService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

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
    public List<User> viewAllUsers() throws IOException, SQLException {
    return userService.viewAllUsers();
    }
}
