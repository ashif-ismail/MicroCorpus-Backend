package me.ashif.microcorpus.serviceImpl;

import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.dao.EmployeeDAO;
import me.ashif.microcorpus.dao.UserDAO;
import me.ashif.microcorpus.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public void addEmployee(Employee e) {
        this.employeeDAO.addEmployee(e);
    }

    @Override
    @Transactional
    public void removeEmployeeByID(int id) {
        this.employeeDAO.removeEmployeeByID(id);
    }

    @Override
    public void updateEmployee(int id, String firstName, String lastName, String email, String dateOfJoin, int empID, String username, String password, Long phoneNumber, String Qualification, String Address) {
        this.employeeDAO.updateEmployee(id, firstName, lastName, email, dateOfJoin, empID, username, password, phoneNumber, Qualification, Address);
    }


    @Override
    @Transactional
    public List<Employee> getEmployeeById(int id){
       return this.employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return this.employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public boolean employeeLogin(String username, String password) {
        return this.employeeDAO.employeeLogin(username, password);
    }
}
