package me.ashif.microcorpus.methods;

import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.beans.User;
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
        String hqlQuery = "from Employee where empID = :empID";
        Query query = session.createQuery(hqlQuery);
        query.setInteger("empID",id);
        List result = query.list();
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
}
