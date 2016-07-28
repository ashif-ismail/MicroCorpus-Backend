package me.ashif.microcorpus.daoImpl;

import me.ashif.microcorpus.beans.Connection;
import me.ashif.microcorpus.beans.Customer;
import me.ashif.microcorpus.dao.ConnectionDAO;
import me.ashif.microcorpus.methods.utilMethods;
import org.springframework.stereotype.Repository;

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
}
