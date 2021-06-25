package controller.impl;

import controller.BookController;
import entiti.Book;
import service.BookService;

public class BookControllerImpl implements BookController {
    private BookService bookService;

    public void addBook(Book book){
    bookService.addBook(book);
    }
    public void dellBook(){

    }

    public void searchBook(String name) {

    }

}
