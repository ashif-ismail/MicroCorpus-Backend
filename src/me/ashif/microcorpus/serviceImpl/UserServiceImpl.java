package me.ashif.microcorpus.serviceImpl;

import me.ashif.microcorpus.beans.User;
import me.ashif.microcorpus.dao.UserDAO;
import me.ashif.microcorpus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by almukthar on 26/7/16.
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
    public void removeUser(int id) {

    }
}
