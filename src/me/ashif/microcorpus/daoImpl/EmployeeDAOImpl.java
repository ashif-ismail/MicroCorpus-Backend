package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.dao.EmployeeDAO;
import me.ashif.microcorpus.methods.utilMethods;
import org.springframework.stereotype.Repository;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void addEmployee(Employee e) {
        utilMethods.getSessionandSave(e);
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
