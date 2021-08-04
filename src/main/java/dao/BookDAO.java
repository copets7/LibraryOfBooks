package dao;

import entiti.Book;

import java.nio.file.Path;
import java.sql.SQLException;

public interface BookDAO {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
    void viewAllBook() throws SQLException;
}
