package dao.impl;

import dao.UserDAO;
import entiti.User;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static connection.Connection.getNumberOfRecords;
import static connection.Connection.writeToFileOneLine;
import static dao.impl.DAOConnection.statement;


public class UserDAOImpl implements UserDAO{
   /* String ROOT_DIR = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +File.separator + "resources";
    String USER_FILE_PATH = ROOT_DIR + File.separator+ "user.csv";*/


    public void addUser(User user){
   /*     String contactLine = parseUser(user);
        long id = getNumberOfRecords(USER_FILE_PATH) + 1;
        contactLine = String.valueOf(id) + contactLine;
        writeToFileOneLine(USER_FILE_PATH, contactLine);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя : ");
        String name = scanner.nextLine();
        try {
            statement.execute("INSERT INTO user (user_name) VALUES ("+name+")");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void dellUser() {

    }


    public void searchUser() {

    }

    @Override
    public void viewAllUsers() throws SQLException {

        DAOConnection daoConnection = new DAOConnection();

        String query = "select * from user";

        Statement statement = daoConnection.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("user_name");
            int role_id = resultSet.getInt("role_id");
            System.out.println(id + " : " + name + " : " + role_id);
        }
       /* BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(USER_FILE_PATH));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(line);
        }*/
    }
}
