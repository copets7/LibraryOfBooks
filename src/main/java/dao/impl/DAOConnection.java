package dao.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

public class DAOConnection {
    Connection connection;

    public void getConnection(String propertyName) {
        String driverClass;
        String url;
        String user;
        String password;

        try {
            String rootPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
            String path = rootPath + propertyName + ".properties";

            Properties dbProperties = new Properties();
            dbProperties.load(new FileInputStream(path));
            driverClass = dbProperties.getProperty("connection.driver_class");
            url = dbProperties.getProperty("connection.url");
            user = dbProperties.getProperty("connection.username");
            password = dbProperties.getProperty("connection.password");
            Class.forName(driverClass);
            connection = DriverManager.getConnection(url, user, password);
        } catch ( SQLException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
