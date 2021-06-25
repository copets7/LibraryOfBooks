package service.impl;

import dao.BookDAO;
import entiti.Book;
import service.BookService;

public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;

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
}
