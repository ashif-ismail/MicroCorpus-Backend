package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Customer;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface CollectionDAO {

    void addCollection(Collection collection);

    List<Collection> getAllCollection();
}
