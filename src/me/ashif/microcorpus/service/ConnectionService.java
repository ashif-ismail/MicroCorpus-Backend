package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Connection;
import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.ConnectionDAO;

/**
 * Created by almukthar on 26/7/16.
 */
public interface ConnectionService {
    void addCustomer(Customer c);
    void addConnection(Connection conn);
}
