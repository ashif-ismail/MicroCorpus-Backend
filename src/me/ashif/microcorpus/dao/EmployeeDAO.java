package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.Employee;

/**
 * Created by almukthar on 26/7/16.
 */
public interface EmployeeDAO {
    void addEmployee(Employee e);
    void removeEmployee(int id);
    void updateEmployee(Employee e);
    Employee viewEmployeeById(int id);
}
