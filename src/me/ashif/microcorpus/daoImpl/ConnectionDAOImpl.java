package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.Connection;
import me.ashif.microcorpus.dao.ConnectionDAO;
import me.ashif.microcorpus.methods.utilMethods;
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
public class ConnectionDAOImpl implements ConnectionDAO {
    @Override
    public void addConnection(Connection conn) {
        utilMethods.getSessionandSave(conn);
    }

    @Override
    public List<Connection> getAllConnection() {
        return utilMethods.getAllConnection();
    }

    @Override
    public List<Connection> getConnectionByID(int id) {
        return utilMethods.getConnectionById(id);
    }

    @Override
    public boolean customerLogin(String username, String password) {
        return utilMethods.loginCustomer(username, password);
    }
}
