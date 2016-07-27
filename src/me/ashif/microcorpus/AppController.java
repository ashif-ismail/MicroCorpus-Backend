package me.ashif.microcorpus;

import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.beans.User;
import me.ashif.microcorpus.service.CustomerService;
import me.ashif.microcorpus.service.EmployeeService;
import me.ashif.microcorpus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by almukthar on 26/7/16.
 */

@Controller
public class AppController {

    private UserService userService;
    private EmployeeService employeeService;
    private CustomerService customerService;

    @Autowired(required = true)
    @Qualifier(value = "customerService")
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Autowired(required = true)
    @Qualifier(value = "userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Autowired(required = true)
    @Qualifier(value = "employeeService")
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public void addUser(@ModelAttribute("user") User user) {
        this.userService.addUser(user);
    }
    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public void updateUser(@ModelAttribute("user") User user) {
        this.userService.updateUser(user);
    }
    @RequestMapping(value = "/employee/add", method = RequestMethod.POST)
    public void addEmployee(@ModelAttribute("employee") Employee employee) {
        this.employeeService.addEmployee(employee);
    }
    @RequestMapping(value = "/customer/add", method = RequestMethod.POST)
    public void addCustomer(@ModelAttribute("customer") Customer customer){
        this.customerService.addCustomer(customer);
    }
}
