package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.User;
import me.ashif.microcorpus.dao.UserDAO;
import me.ashif.microcorpus.methods.utilMethods;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by almukthar on 26/7/16.
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Override
    public void addUser(User user) {
            utilMethods.getSessionandSave(user);
    }

    @Override
    public void updateUser(User user) {
//            utilMethods.getSessionandUpdate(user);
    }

    @Override
    public void removeUserByID(int id) {
            utilMethods.removeUserByID(id);
    }

    @Override
    public List<User> getAllUsers() {
        return utilMethods.getAllUsers();
    }
}
