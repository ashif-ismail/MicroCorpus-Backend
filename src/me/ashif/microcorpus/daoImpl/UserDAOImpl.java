package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.User;
import me.ashif.microcorpus.dao.UserDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

/**
 * Created by almukthar on 26/7/16.
 */
@Repository
public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateUser(User user) {

    }
}
