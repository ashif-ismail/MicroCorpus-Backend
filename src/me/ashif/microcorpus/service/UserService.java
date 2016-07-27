package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.User;
import me.ashif.microcorpus.dao.UserDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by almukthar on 26/7/16.
 */
public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
}
