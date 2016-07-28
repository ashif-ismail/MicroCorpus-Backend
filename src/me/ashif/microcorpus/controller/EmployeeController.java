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

    private ConnectionService connectionService;
    private CollectionService collectionService;

    @Autowired(required = true)
    @Qualifier(value = "collectionService")
    public void setCollectionService(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @Autowired(required = true)
    @Qualifier(value = "connectionService")
    public void setConnectionService(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @Autowired(required = true)
    @Qualifier(value = "employeeService")
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @RequestMapping(value = "/employee/add", method = RequestMethod.POST)
    public void addEmployee(@ModelAttribute("employee") Employee employee) {
        this.employeeService.addEmployee(employee);
    }

    @RequestMapping(value = "/connection/add", method = RequestMethod.POST)
    public void addConnection(@ModelAttribute("connection") Connection connection) {
        this.connectionService.addConnection(connection);
    }

    @RequestMapping(value = "/collection/add", method = RequestMethod.POST)
    public void addCollection(@ModelAttribute("collection") Collection collection) {
        this.collectionService.addCollection(collection);
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
    @RequestMapping(value = "/employee/{empID}",method = RequestMethod.PUT)
    public void updateEmployee(@PathVariable("empID") int empID,@ModelAttribute("employee") Employee employee){
        this.employeeService.updateEmployee(empID,employee);
    }
    @RequestMapping(value = "/employee/{empID}",method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("empID") int empID){
        this.employeeService.removeEmployeeByID(empID);
    }
}
