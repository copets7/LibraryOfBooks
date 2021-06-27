package service.impl;

import controller.UserController;
import dao.DAOFactory;
import dao.UserDAO;
import entiti.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(){this.userDAO = DAOFactory.getInstance().getUserDAO(); }

    public void addUser(User user){
        userDAO.addUser(user);
    }
}
