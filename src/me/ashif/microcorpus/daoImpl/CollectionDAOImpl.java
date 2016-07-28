package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CollectionDAO;
import me.ashif.microcorpus.methods.utilMethods;
import org.springframework.stereotype.Repository;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

@Repository
public class CollectionDAOImpl implements CollectionDAO {
    @Override
    public Customer viewCustomer(int id) {
        return null;
    }

    @Override
    public void addCollection(Collection collection) {
        utilMethods.getSessionandSave(collection);
    }
}
