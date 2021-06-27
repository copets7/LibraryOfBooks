package dao;

import dao.impl.BookDAOImpl;
import dao.impl.UserDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public UserDAO getUserDAO(){
        return new UserDAOImpl();
    }
    public BookDAO getBookDAO(){
        return new BookDAOImpl();
    }
}
