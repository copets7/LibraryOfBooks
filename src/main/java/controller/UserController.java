package controller;

import entiti.User;

import java.io.IOException;

public interface UserController {
    void addUser(User user);
    void dellUser();
    void searchUser();
    void viewAllUsers() throws IOException;
}
