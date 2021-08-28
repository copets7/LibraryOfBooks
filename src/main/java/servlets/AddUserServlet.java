package servlets;

import controller.UserController;
import controller.impl.UserControllerImpl;
import entiti.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "AddUserServlet"
)
public class AddUserServlet extends HttpServlet {
    public AddUserServlet() {
    }

    private UserController userController = new UserControllerImpl();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userNAme = req.getParameter("user_name");
        String role = req.getParameter("role_id");
        User user = new User(userNAme, role);
        userController.addUser(user);
        req.setAttribute("user", user);
        doGet(req,resp);
    }
}