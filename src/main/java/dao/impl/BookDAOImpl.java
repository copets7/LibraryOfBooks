package dao.impl;

import dao.BookDAO;
import entiti.Book;
import entiti.User;

import java.io.File;

import static connection.Connection.getNumberOfRecords;
import static connection.Connection.writeToFileOneLine;
import static parser.csv.ParserUser.parseBook;


public class BookDAOImpl implements BookDAO {
    String ROOT_DIR1 = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +File.separator + "resources";
    String CONTACT_FILE_PATH1 = ROOT_DIR1 + File.separator+ "book.csv";

    @Override
    public void addBook(Book book) {
        String contactLine = parseBook(book);
        long id = getNumberOfRecords(CONTACT_FILE_PATH1) + 1;
        contactLine = String.valueOf(id) + contactLine;
        writeToFileOneLine(CONTACT_FILE_PATH1, contactLine);
    }

    @Override
    public void dellBook() {

    }

    @Override
    public void searchBook(String name) {

    }
}
