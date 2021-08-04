package service.impl;

import dao.BookDAO;
import dao.DAOFactory;
import entiti.Book;
import service.BookService;

import java.nio.file.Path;
import java.sql.SQLException;

public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;

    public BookServiceImpl(){this.bookDAO = DAOFactory.getInstance().getBookDAO();
    }

    @Override
    public void addBook(Book book) {
        bookDAO.addBook(book);
    }

    @Override
    public void dellBook() {

    }

    @Override
    public void searchBook(String name) {

    }

    @Override
    public void viewAllBook() {
        try {
            bookDAO.viewAllBook();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
