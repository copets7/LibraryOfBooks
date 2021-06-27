import controller.UserController;
import controller.impl.BookControllerImpl;
import controller.impl.UserControllerImpl;
import entiti.Book;
import entiti.User;

public class Run {
    public static void main(String[] args) {
            User user = new User("Andrey","Yarosh");
            Book book = new Book("Философия Java","computer science","Брюс Эккель");
            UserController controller = new UserControllerImpl();
            BookControllerImpl bookController = new BookControllerImpl();
            controller.addUser(user);
            bookController.addBook(book);
        }

}
