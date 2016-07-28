package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.User;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    void removeUserByID(int id);
    List<User> getAllUsers();
}
