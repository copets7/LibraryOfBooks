import dao.impl.BookDAOImpl;
import dao.impl.DAOConnection;
import dao.impl.UserDAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Run {

    public static void main(String[] args) throws SQLException {
       /* DAOConnection daoConnection = new DAOConnection();

        String query = "select * from type_genre";

        Statement statement = daoConnection.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("genre_name");
            System.out.println(id + " : " + name);
        }*/
        UserDAOImpl userDAO = new UserDAOImpl();
        System.out.println("Список читателей");
        userDAO.viewAllUsers();
        System.out.println("Список книг");
        BookDAOImpl bookDAO = new BookDAOImpl();
        bookDAO.viewAllBook();
    }
}
