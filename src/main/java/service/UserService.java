package service;

import entiti.User;

import java.io.IOException;

public interface UserService {
    void addUser(User user);
    void dellUser();
    void searchUser();
    void viewAllUsers() throws IOException;
}
