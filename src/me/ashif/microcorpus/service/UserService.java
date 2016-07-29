package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.User;
import me.ashif.microcorpus.dao.UserDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void removeUserByID(int id);
    List<User> getAllUsers();
    boolean login(String username,String password);
}
