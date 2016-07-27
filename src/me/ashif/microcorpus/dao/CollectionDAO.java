package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Customer;

/**
 * Created by almukthar on 26/7/16.
 */
public interface CollectionDAO {
    Customer viewCustomer(int id);
    void addCollection(Collection collection);
}
