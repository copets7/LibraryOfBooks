package controller.impl;

import controller.BookController;
import entiti.Book;
import service.BookService;
import service.ServiceFactory;

import java.nio.file.Path;

public class BookControllerImpl implements BookController {
    private BookService bookService;

    public BookControllerImpl (){this.bookService = ServiceFactory.getInstance().getBookService();}

    public void addBook(Book book){
    bookService.addBook(book);
    }
    public void dellBook(){

    }

    public void searchBook(String name) {

    }

    @Override
    public void viewAllBook() {
    bookService.viewAllBook();
    }

}
