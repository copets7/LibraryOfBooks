import controller.UserController;
import controller.impl.UserControllerImpl;
import entiti.User;

public class Run {
    public static void main(String[] args) {

        User user = new User(1,"Andrey","Yarosh");

        UserControllerImpl controller = new UserControllerImpl();
        controller.addUser(user);
    }
}
