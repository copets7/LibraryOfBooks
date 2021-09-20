package controller;

import entity.Book;

public interface BookController {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
    void viewAllBook();
}
