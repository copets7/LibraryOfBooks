import controller.UserController;
import controller.impl.BookControllerImpl;
import controller.impl.UserControllerImpl;
import dao.impl.DAOConnection;
import dao.impl.UserDAOImpl;
import entiti.Book;
import entiti.User;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Run {

    public static void main(String[] args) throws IOException, SQLException {
        DAOConnection daoConnection = new DAOConnection();

        String query = "select * from type_genre";

        Statement statement = daoConnection.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("genre_name");
            System.out.println(id + " : " + name);
        }
    }
}
