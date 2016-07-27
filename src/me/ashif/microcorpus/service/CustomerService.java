package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CustomerDAO;
import org.springframework.stereotype.Service;

/**
 * Created by almukthar on 26/7/16.
 */
public interface CustomerService {
    void addCustomer(Customer customer);
    Customer viewCustomer(int id);
}