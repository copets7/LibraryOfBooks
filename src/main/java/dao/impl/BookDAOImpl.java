package dao.impl;

import dao.BookDAO;
import entiti.Book;
import entiti.User;

import java.io.*;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static connection.Connection.getNumberOfRecords;
import static connection.Connection.writeToFileOneLine;



public class BookDAOImpl implements BookDAO {
   /* String ROOT_DIR = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +File.separator + "resources";
    String BOOKS_FILE_PATH = ROOT_DIR + File.separator+ "book.csv";*/

    @Override
    public void addBook(Book book) {
      /*  String contactLine = parseBook(book);
        long id = getNumberOfRecords(BOOKS_FILE_PATH) + 1;
        contactLine = String.valueOf(id) + contactLine;
        writeToFileOneLine(BOOKS_FILE_PATH, contactLine);*/
    }

    @Override
    public void dellBook() {

    }

    @Override
    public void searchBook(String name) {

    }

    @Override
    public void viewAllBook() throws SQLException {
        DAOConnection daoConnection = new DAOConnection();

        String query = "select * from book";

        Statement statement = daoConnection.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("bookName");
            String author = resultSet.getString("author");
            String isbn = resultSet.getString("ISBN");
            int genre_id = resultSet.getInt("genre_id");
            System.out.println(id + " : " + name +" : " + author +" : " + isbn + " : " + genre_id);
        }


       /* BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(BOOKS_FILE_PATH));
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
