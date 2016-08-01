package me.ashif.microcorpus.serviceImpl;

import me.ashif.microcorpus.beans.Connection;
import me.ashif.microcorpus.dao.ConnectionDAO;
import me.ashif.microcorpus.service.ConnectionService;
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

@Service("connectionService")
public class ConnectionServiceImpl implements ConnectionService {

    @Autowired
    private ConnectionDAO connectionDAO;

    public ConnectionServiceImpl(ConnectionDAO connectionDAO) {
        this.connectionDAO = connectionDAO;
    }

    @Override
    @Transactional
    public void addConnection(Connection conn) {
        this.connectionDAO.addConnection(conn);
    }

    @Override
    public List<Connection> getAllConnection() {
        return this.connectionDAO.getAllConnection();
    }

    @Override
    public List<Connection> getConnectionByID(int id) {
        return this.connectionDAO.getConnectionByID(id);
    }

    @Override
    public boolean customerLogin(String username, String password) {
        return this.connectionDAO.customerLogin(username,password);
    }
}
