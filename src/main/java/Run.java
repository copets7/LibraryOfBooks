import controller.UserController;
import controller.impl.UserControllerImpl;
import entiti.User;

public class Run {
    public static void main(String[] args) {
            User user = new User("Andrey","Yarosh");
            UserController controller = new UserControllerImpl();
            controller.addUser(user);
        }

}
