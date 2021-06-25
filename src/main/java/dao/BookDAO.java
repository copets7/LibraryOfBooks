package dao;

import entiti.Book;

public interface BookDAO {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
}
