package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CustomerDAO;
import me.ashif.microcorpus.methods.utilMethods;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public void addCustomer(Customer customer) {
        utilMethods.getSessionandSave(customer);
    }

    @Override
    public List<Customer> getCustomerByID(int id) {
        return utilMethods.getCustomerById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return utilMethods.getAllCustomer();
    }

    @Override
    public boolean customerLogin(String username, String password) {
        return utilMethods.loginCustomer(username, password);
    }
}
