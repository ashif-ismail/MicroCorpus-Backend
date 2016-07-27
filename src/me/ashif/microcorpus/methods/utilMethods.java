package me.ashif.microcorpus.methods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by almukthar on 27/7/16.
 */
public class utilMethods {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static void getSessionandSave(Object object){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();
    }
    public static void getSessionandUpdate(Object object){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.close();
    }
    public static void getSessionandRemove(Object object){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.remove(object);
        session.getTransaction().commit();
        session.close();
    }
}
