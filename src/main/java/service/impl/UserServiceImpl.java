package service.impl;

import dao.DAOFactory;
import dao.UserDAO;
import entity.User;
import service.UserService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(){this.userDAO = DAOFactory.getInstance().getUserDAO(); }

    public void addUser(User user){
        userDAO.addUser(user);
    }

    public void dellUser(int id) {
    userDAO.dellUser(id);
    }

    public void searchUser() {

    }

    @Override
    public List<User> viewAllUsers() throws IOException, SQLException {
            return  userDAO.viewAllUsers();
    }
}
