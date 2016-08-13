package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.dao.EmployeeDAO;
import me.ashif.microcorpus.methods.utilMethods;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public void removeEmployeeByID(int id) {
        utilMethods.removeEmployeeByID(id);
    }

    @Override
    public void updateEmployee(int id, String firstName, String lastName, String email, String dateOfJoin, int empID, String username, String password, Long phoneNumber, String Qualification, String Address) {
        utilMethods.updateEmployeeById(id, firstName, lastName, email, dateOfJoin, empID, username, password, phoneNumber, Qualification, Address);
    }

    @Override
    public List<Employee> getEmployeeById(int id)  {
        return utilMethods.getEmployeeById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return utilMethods.getAllEmployees();
    }

    @Override
    public boolean employeeLogin(String username, String password) {
        return utilMethods.loginEmployee(username,password);
    }

    @Override
    public String getEmpID(String username) {
        return utilMethods.getEmpID(username);
    }
}
