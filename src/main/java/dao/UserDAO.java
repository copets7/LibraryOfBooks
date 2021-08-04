package dao;

import entiti.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface UserDAO {
    void addUser(User user);
    void dellUser();
    void searchUser();
    void viewAllUsers() throws IOException, SQLException;
}
