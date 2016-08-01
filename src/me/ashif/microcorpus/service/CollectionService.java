package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Collection;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */
public interface CollectionService {
    List<Collection> getAllCollection();
    void addCollection(Collection collection);
}
