package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Employee;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface EmployeeService {
    void addEmployee(Employee e);
    void removeEmployeeByID(int id);
    void updateEmployee(int id,String firstName,String lastName,String email,String dateOfJoin,int empID,String username,String password,Long phoneNumber,String Qualification,String Address);
    List<Employee> getEmployeeById(int id);
    List<Employee> getAllEmployees();
    boolean employeeLogin(String username,String password);
}