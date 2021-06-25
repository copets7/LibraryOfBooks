package service.impl;

import dao.UserDAO;
import entiti.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;
    public void addUser(User user){
        userDAO.addUser(user);
    }
}
