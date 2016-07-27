package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CollectionDAO;

/**
 * Created by almukthar on 26/7/16.
 */
public interface CollectionService {
    Customer viewCustomer(int id);
    void addCollection(Collection collection);
}
