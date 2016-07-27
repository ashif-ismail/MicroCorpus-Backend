package me.ashif.microcorpus.serviceImpl;

import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.CustomerDAO;
import me.ashif.microcorpus.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by almukthar on 26/7/16.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    @Transactional
    public void addCustomer(Customer customer) {
        this.customerDAO.addCustomer(customer);
    }

    @Override
    public Customer viewCustomer(int id) {
        return null;
    }
}
