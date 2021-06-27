package dao.impl;

import dao.UserDAO;
import entiti.User;

import java.io.File;

import static connection.Connection.getNumberOfRecords;
import static connection.Connection.writeToFileOneLine;
import static parser.csv.ParserUser.parseUser;

public class UserDAOImpl implements UserDAO{
    String ROOT_DIR = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +File.separator + "resources";
    String CONTACT_FILE_PATH = ROOT_DIR + File.separator+ "user.csv";


    public void addUser(User user){
        String contactLine = parseUser(user);
        long id = getNumberOfRecords(CONTACT_FILE_PATH) + 1;
        contactLine = String.valueOf(id) + contactLine;
        writeToFileOneLine(CONTACT_FILE_PATH, contactLine);
    }
}
