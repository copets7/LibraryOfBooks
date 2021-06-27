package entiti;

public class Book {
    private String bookName;
    private String bookGenre;
    private String bookAuthor;

    public Book(String bookName, String bookGenre, String bookAuthor) {
        this.bookName = bookName;
        this.bookGenre = bookGenre;
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
