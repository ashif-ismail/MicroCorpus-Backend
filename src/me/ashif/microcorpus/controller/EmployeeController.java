package me.ashif.microcorpus.controller;

import me.ashif.microcorpus.beans.*;
import me.ashif.microcorpus.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired(required = true)
    @Qualifier(value = "employeeService")
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @RequestMapping(value = "/employee/add", method = RequestMethod.POST)
    public void addEmployee(@ModelAttribute("employee") Employee employee) {
        this.employeeService.addEmployee(employee);
    }

    @RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> getEmployeeById(@PathVariable("empId") int id){
        List<Employee> employee = this.employeeService.getEmployeeById(id);
        if(employee == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @RequestMapping(value = "/employees", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employee = employeeService.getAllEmployees();
        if(employee.isEmpty())
        {
            return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
    }
    @RequestMapping(value = "/employee/update/{id}",method = RequestMethod.PUT)
    public void updateEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("email")String email, @RequestParam("dateOfJoin") String dateOfJoin, @RequestParam("empID")int empID, @RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("phoneNumber") Long phoneNumber, @RequestParam("Qualification") String Qualification, @RequestParam("address") String address,@PathVariable("id") int id){
//        List<Employee> employeeList = this.employeeService.getEmployeeById(id);
//        if (employeeList.isEmpty())
//        {
//           new ResponseEntity(HttpStatus.NOT_FOUND);
//        }
        this.employeeService.updateEmployee(id, firstName, lastName, email, dateOfJoin, empID, username, password, phoneNumber, Qualification, address);
    }
    @RequestMapping(value = "/employee/{empID}",method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("empID") int empID){
        this.employeeService.removeEmployeeByID(empID);
    }

    @RequestMapping(value = "employee/login",method = RequestMethod.POST)
    public ResponseEntity checkIfValidEmployee(@RequestParam("username") String username , @RequestParam("password") String password){
        boolean isValid = this.employeeService.employeeLogin(username, password);
        if (isValid)
        {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
