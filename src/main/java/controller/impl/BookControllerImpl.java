package controller.impl;

import controller.BookController;
import entity.Book;
import service.BookService;
import service.ServiceFactory;

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
