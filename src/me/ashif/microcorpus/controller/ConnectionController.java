package me.ashif.microcorpus.controller;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

import me.ashif.microcorpus.beans.Connection;
import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConnectionController {

    private ConnectionService connectionService;

    @Autowired(required = true)
    @Qualifier(value = "connectionService")
    public void setConnectionService(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @RequestMapping(value = "/connection/add", method = RequestMethod.POST)
    public void addConnection(@ModelAttribute("connection") Connection connection) {
        this.connectionService.addConnection(connection);
    }
    @RequestMapping(value = "/connections", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Connection>> getAllConnection(){
        List<Connection> connections = connectionService.getAllConnection();
        if(connections.isEmpty())
        {
            return new ResponseEntity<List<Connection>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Connection>>(connections, HttpStatus.OK);
    }
}
