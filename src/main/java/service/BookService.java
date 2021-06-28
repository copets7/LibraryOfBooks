package service;

import entiti.Book;

import java.nio.file.Path;

public interface BookService {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
    void viewAllBook();
}
