package dao.impl;

import dao.UserDAO;
import entiti.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserDAOImpl extends DAOConnection implements UserDAO {

    @Override
    public User addUser(User user){
        getConnection("database");
        Savepoint savepoint = null;
        List<String> values = Stream.of(user.getUserName(), user.getRole_id()).
                map(String::valueOf).collect(Collectors.toList());
        String query = "INSERT INTO user (user_name, role_id) VALUES ('" + String.join("', '", values) + "')";
        try {
            savepoint = connection.setSavepoint();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            connection.commit();
            ResultSet res = statement.getGeneratedKeys();
            res.next();
            user.setId(res.getInt(1));
            return user;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                connection.rollback(savepoint);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            closeConnection();
        }
        return null;
    }


    public void dellUser() {

    }


    public void searchUser() {

    }

    @Override
    public List<User> viewAllUsers() {
         getConnection("database");
         try {
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM user");
             ResultSet res = statement.executeQuery();
             Map<Integer, User> idToUsers = new HashMap<>();
             while (res.next()) {
                 Integer id = res.getInt("id");
                 if (idToUsers.containsKey(id)) {
                     continue;
                 }
                 User user = new User();
                 user.setId(id);
                 user.setUserName(res.getString("user_name"));
                 user.setRole_id(res.getString("role_id"));
                 idToUsers.put(id, user);
             }
             return new ArrayList<>(idToUsers.values());
         } catch (SQLException throwables){
             throwables.printStackTrace();
         }
        return new ArrayList<>();
    }
}
