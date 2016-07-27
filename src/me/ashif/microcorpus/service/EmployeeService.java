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
public interface EmployeeService {
    void addEmployee(Employee e);
    void removeEmployee(int id);
    void updateEmployee(Employee e);
    Employee viewEmployeeById(int id);
}