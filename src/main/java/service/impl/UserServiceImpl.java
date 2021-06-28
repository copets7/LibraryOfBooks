package service.impl;

import controller.UserController;
import dao.DAOFactory;
import dao.UserDAO;
import entiti.User;
import service.UserService;

import java.io.IOException;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(){this.userDAO = DAOFactory.getInstance().getUserDAO(); }

    public void addUser(User user){
        userDAO.addUser(user);
    }

    public void dellUser() {

    }

    public void searchUser() {

    }

    @Override
    public void viewAllUsers() throws IOException {
    userDAO.viewAllUsers();
    }
}
