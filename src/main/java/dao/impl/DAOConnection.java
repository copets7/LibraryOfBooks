package dao.impl;

import com.mysql.cj.jdbc.result.ResultSetImpl;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class DAOConnection {
    public static final String NAME_USER = "root";
    public static final String PASSWORD = "70286CopetS";
    public static final String URL = "jdbc:mysql://localhost:3306/library";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(URL,NAME_USER,PASSWORD);
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
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException | NoSuchMethodException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        statement.execute("INSERT INTO user (user_name) VALUES ('Andrey')");


        ResultSet resultSet = statement.executeQuery("select\n" +
                "    u.user_name\n" +
                "from\n" +
                "    `user` u;");

        while (resultSet.next()){
            System.out.println(resultSet.getString(1));

        }
      connection.close();

      /*  PreparedStatement st = connection.prepareStatement("'Andrey'");
        st.executeUpdate();*/
    }
}
