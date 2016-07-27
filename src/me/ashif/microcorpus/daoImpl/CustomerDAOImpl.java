package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CustomerDAO;
import me.ashif.microcorpus.methods.utilMethods;
import org.springframework.stereotype.Repository;

/**
 * Created by almukthar on 26/7/16.
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public void addCustomer(Customer customer) {
        utilMethods.getSessionandSave(customer);
    }

    @Override
    public Customer viewCustomer(int id) {
        return null;
    }
}
