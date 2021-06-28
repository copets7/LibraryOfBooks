package controller;

import entiti.Book;

import java.nio.file.Path;

public interface BookController {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
    void viewAllBook();
}
