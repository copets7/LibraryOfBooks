package service;

import entiti.Book;

public interface BookService {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
}
