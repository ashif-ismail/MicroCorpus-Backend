package me.ashif.microcorpus.serviceImpl;

import me.ashif.microcorpus.beans.User;
import me.ashif.microcorpus.dao.UserDAO;
import me.ashif.microcorpus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.userDAO.updateUser(user);
    }

    @Override
    public void removeUserByID(int id) {
        this.userDAO.removeUserByID(id);
    }

    @Override
    public List<User> getAllUsers() {
       return this.userDAO.getAllUsers();
    }

    @Override
    public boolean login(String username, String password) {
        return this.userDAO.login(username,password);
    }
}
