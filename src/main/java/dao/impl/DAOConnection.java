package dao.impl;

import com.mysql.cj.jdbc.result.ResultSetImpl;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class DAOConnection {
    public static final String NAME_USER = "root";
    public static final String PASSWORD = "70286CopetS";
    public static final String URL = "jdbc:mysql://localhost:3306/myLibrary";
    public static Connection connection;
    public static Statement statement;

    public static Connection getConnection() {
        return connection;
    }
    static {
        try {
            connection = DriverManager.getConnection(URL,NAME_USER,PASSWORD);
            System.out.println("Подключено");
        }catch (SQLException throwables){
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }
    static {
        try {
            statement = connection.createStatement();
        }catch (SQLException throwables){
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

}
