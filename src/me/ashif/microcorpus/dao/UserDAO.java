package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.User;

/**
 * Created by almukthar on 26/7/16.
 */
public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
}
