package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.Customer;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface CustomerDAO {
    void addCustomer(Customer customer);
    List<Customer> getCustomerByID(int id);
    List<Customer> getAllCustomers();
    boolean customerLogin(String username,String password);
}
