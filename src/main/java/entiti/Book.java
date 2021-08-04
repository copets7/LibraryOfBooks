package entiti;

public class Book {
    private int id;
    private String bookName;
    private String bookAuthor;
    private String ISBN;
    private String bookGenre;
    private int genre_id;

    public Book(int id, String bookName, String bookAuthor, String ISBN, String bookGenre, int genre_id) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.bookGenre = bookGenre;
        this.genre_id = genre_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }
}
