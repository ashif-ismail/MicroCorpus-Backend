package me.ashif.microcorpus.serviceImpl;

import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CustomerDAO;
import me.ashif.microcorpus.service.CustomerService;
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

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    @Transactional
    public void addCustomer(Customer customer) {
        this.customerDAO.addCustomer(customer);
    }

    @Override
    public List<Customer> getCustomerByID(int id) {
        return this.customerDAO.getCustomerByID(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return this.customerDAO.getAllCustomers();
    }

    @Override
    public boolean customerLogin(String username, String password) {
        return this.customerDAO.customerLogin(username, password);
    }
}