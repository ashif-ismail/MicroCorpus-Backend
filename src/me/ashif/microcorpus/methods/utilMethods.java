package me.ashif.microcorpus.methods;

import me.ashif.microcorpus.beans.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
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
    public static void removeEmployeeByID(int id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = (Employee) session.load(Employee.class,new Integer(id));
        if(null != employee){
            session.remove(employee);
        }
        session.getTransaction().commit();
        session.close();
    }
    public static void updateEmployeeById(int id,Object object) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = (Employee) session.load(Employee.class,new Integer(id));
        employee = (Employee) object;
        session.update(employee);
        session.getTransaction().commit();
        session.close();
    }
    public static List<Employee> getAllEmployees(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Employee> employeeList = session.createQuery("from Employee ").list();
        session.getTransaction().commit();
        session.close();
        return employeeList;
    }
    public static List<Employee> getEmployeeById(int id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String hqlQuery = "from Employee where id = :id";
        Query query = session.createQuery(hqlQuery);
        query.setInteger("id",id);
        List result = query.list();
        session.getTransaction().commit();
        session.close();
        return result;
    }
    public static void removeUserByID(int id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = (User) session.load(User.class,new Integer(id));
        if(null != user){
            session.remove(user);
        }
        session.getTransaction().commit();
        session.close();
    }
    public static List<User> getAllUsers(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<User> userList = session.createQuery("from User ").list();
        session.getTransaction().commit();
        session.close();
        return userList;
    }
    public static List<Customer> getCustomerById(int id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String hqlQuery = "from Customer where customerID = :customerID";
        Query query = session.createQuery(hqlQuery);
        query.setInteger("customerID",id);
        List result = query.list();
        session.getTransaction().commit();
        session.close();
        return result;
    }
    public static List<Customer> getAllCustomer(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Customer> customerList = session.createQuery("from Customer ").list();
        session.getTransaction().commit();
        session.close();
        return customerList;
    }
    public static List<Connection> getAllConnection(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Connection> connectionList = session.createQuery("from Connection ").list();
        session.getTransaction().commit();
        session.close();
        return connectionList;
    }
    public static List<Collection> getAllCollection(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Collection> collectionList = session.createQuery("from Collection ").list();
        session.getTransaction().commit();
        session.close();
        return collectionList;
    }
    public static boolean loginUser(String username,String password){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        boolean validUser = true;
        String hqlQuery = "from User where username =:username and password =:password";
        Query query = session.createQuery(hqlQuery);
        query.setString("username",username);
        query.setString("password",password);
        List result =query.list();
        if (result.isEmpty() || result.size() < 0)
        {
            validUser = false;
        }
        session.getTransaction().commit();
        session.clear();
        return validUser;
    }
    public static boolean loginEmployee(String username,String password){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        boolean validUser = true;
        String hqlQuery = "from Employee where username =:username and password =:password";
        Query query = session.createQuery(hqlQuery);
        query.setString("username",username);
        query.setString("password",password);
        List result =query.list();
        if (result.isEmpty() || result.size() < 0)
        {
            validUser = false;
        }
        session.getTransaction().commit();
        session.clear();
        return validUser;
    }
    public static boolean loginCustomer(String username,String password){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        boolean validUser = true;
        String hqlQuery = "from Customer where username =:username and password =:password";
        Query query = session.createQuery(hqlQuery);
        query.setString("username",username);
        query.setString("password",password);
        List result =query.list();
        if (result.isEmpty() || result.size() < 0)
        {
            validUser = false;
        }
        session.getTransaction().commit();
        session.clear();
        return validUser;
    }
}