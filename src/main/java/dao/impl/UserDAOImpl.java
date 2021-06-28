package dao.impl;

import dao.UserDAO;
import entiti.User;

import java.io.*;

import static connection.Connection.getNumberOfRecords;
import static connection.Connection.writeToFileOneLine;
import static parser.csv.ParserUser.parseUser;

public class UserDAOImpl implements UserDAO{
    String ROOT_DIR = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +File.separator + "resources";
    String USER_FILE_PATH = ROOT_DIR + File.separator+ "user.csv";


    public void addUser(User user){
        String contactLine = parseUser(user);
        long id = getNumberOfRecords(USER_FILE_PATH) + 1;
        contactLine = String.valueOf(id) + contactLine;
        writeToFileOneLine(USER_FILE_PATH, contactLine);
    }

    public void dellUser() {

    }


    public void searchUser() {

    }

    @Override
    public void viewAllUsers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(USER_FILE_PATH));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
