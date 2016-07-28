package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CollectionDAO;
/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */
public interface CollectionService {
    Customer viewCustomer(int id);
    void addCollection(Collection collection);
}
