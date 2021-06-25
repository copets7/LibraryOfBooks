package controller;

import entiti.Book;

public interface BookController {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
}
