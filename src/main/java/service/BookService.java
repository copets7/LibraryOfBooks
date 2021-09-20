package service;

import entity.Book;

public interface BookService {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
    void viewAllBook();
}
