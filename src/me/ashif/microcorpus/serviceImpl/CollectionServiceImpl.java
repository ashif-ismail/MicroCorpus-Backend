package me.ashif.microcorpus.serviceImpl;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CollectionDAO;
import me.ashif.microcorpus.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

@Service("collectionService")
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    private CollectionDAO collectionDAO;

    public CollectionServiceImpl(CollectionDAO collectionDAO) {
        this.collectionDAO = collectionDAO;
    }


    @Override
    public Customer viewCustomer(int id) {
        return null;
    }

    @Override
    @Transactional
    public void addCollection(Collection collection) {
        this.collectionDAO.addCollection(collection);
    }
}
