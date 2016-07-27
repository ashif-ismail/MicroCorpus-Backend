package me.ashif.microcorpus.serviceImpl;

import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.dao.EmployeeDAO;
import me.ashif.microcorpus.dao.UserDAO;
import me.ashif.microcorpus.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by almukthar on 26/7/16.
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
    public void removeEmployee(int id) {

    }

    @Override
    @Transactional
    public void updateEmployee(Employee e) {
        this.employeeDAO.updateEmployee(e);
    }

    @Override
    public Employee viewEmployeeById(int id) {
        return null;
    }
}
