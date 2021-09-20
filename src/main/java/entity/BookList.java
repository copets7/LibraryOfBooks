package entity;

public class BookList {
    private int book_id;
    private  int libCode_id;

    public BookList(int book_id, int libCode_id) {
        this.book_id = book_id;
        this.libCode_id = libCode_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getLibCode_id() {
        return libCode_id;
    }

    public void setLibCode_id(int libCode_id) {
        this.libCode_id = libCode_id;
    }
}
