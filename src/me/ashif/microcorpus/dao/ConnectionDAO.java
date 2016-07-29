package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Connection;
import me.ashif.microcorpus.beans.Customer;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface ConnectionDAO {

    void addConnection(Connection conn);
    List<Connection> getAllConnection();
}
