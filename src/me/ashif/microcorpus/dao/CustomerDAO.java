package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.Customer;

/**
 * Created by almukthar on 26/7/16.
 */
public interface CustomerDAO {
    void addCustomer(Customer customer);
    Customer viewCustomer(int id);
}
