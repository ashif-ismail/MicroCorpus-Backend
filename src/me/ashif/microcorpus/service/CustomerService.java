package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CustomerDAO;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface CustomerService {
    void addCustomer(Customer customer);
    List<Customer> getCustomerByID(int id);
    List<Customer> getAllCustomers();
}