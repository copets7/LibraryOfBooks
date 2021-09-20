package servlets;

import controller.UserController;
import controller.impl.UserControllerImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(
        name = "ListUsers"
)
public class ListUsers extends HttpServlet {
    public ListUsers() {
    }
    UserController userController = new UserControllerImpl();
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = Integer.parseInt(req.getParameter("id"));
//        if(req.getParameter("delete") != null){
//            userController.dellUser(id);
//           resp.sendRedirect("views/list.jsp");
//        }
//    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        if(req.getParameter("delete") != null){
            userController.dellUser(id);
            resp.sendRedirect("views/list.jsp");
        }
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        try {
            req.setAttribute("users", userController.viewAllUsers());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        requestDispatcher.forward(req, resp);
    }
}
