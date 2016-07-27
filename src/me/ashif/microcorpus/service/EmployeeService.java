package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.dao.EmployeeDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;

import java.util.logging.Logger;

/**
 * Created by almukthar on 26/7/16.
 */
public class EmployeeService implements EmployeeDAO{


    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addEmployee(Employee e) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(e);
    }

    @Override
    public void removeEmployee(int id) {

    }

    @Override
    public void updateEmployee(Employee e) {

    }

    @Override
    public Employee viewEmployeeById(int id) {
        return null;
    }
}
