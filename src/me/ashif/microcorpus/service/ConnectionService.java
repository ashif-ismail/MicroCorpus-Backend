package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Connection;

import java.util.List;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface ConnectionService {
    void addConnection(Connection conn);
    List<Connection> getAllConnection();
    List<Connection> getConnectionByID(int id);
    boolean customerLogin(String username,String password);
}
