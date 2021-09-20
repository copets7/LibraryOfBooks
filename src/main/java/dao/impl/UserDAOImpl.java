package dao.impl;

import dao.UserDAO;
import entity.User;
import hibernate.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class UserDAOImpl implements UserDAO {

    @Override
    public void addUser(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }


    public void dellUser(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query=session.createQuery("from User where id=:id");
        query.setInteger("id",id);
        User user = (User) query.uniqueResult();
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }


    public void searchUser() {

    }

    @Override
    public List<User> viewAllUsers() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<User> list=session.createQuery("from User").list();
        session.getTransaction().commit();
        session.close();
        return list;
    }
}
