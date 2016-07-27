package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Connection;
import me.ashif.microcorpus.beans.Customer;

/**
 * Created by almukthar on 26/7/16.
 */
public interface ConnectionDAO {
    void addCustomer(Customer c);
    void addConnection(Connection conn);
}
