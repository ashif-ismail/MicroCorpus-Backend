package me.ashif.microcorpus.controller;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

import me.ashif.microcorpus.beans.User;
import me.ashif.microcorpus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//manager level access
@RestController
public class UserController {

    private UserService userService;

    @Autowired(required = true)
    @Qualifier(value = "userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public void addUser(@ModelAttribute("user") User user) {
        this.userService.addUser(user);
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.PUT)
    public void updateUser(@ModelAttribute("user") User user) {
        this.userService.updateUser(user);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public void deleteUserByID(@PathVariable("id") int id){
        this.userService.removeUserByID(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> user = userService.getAllUsers();
        if(user.isEmpty())
        {
            return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<User>>(user, HttpStatus.OK);
    }
    @RequestMapping(value = "/user/login",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity checkIfValidUser(@RequestParam("username") String username, @RequestParam("password") String password){
        Boolean isValid = userService.login(username, password);
        if (isValid)
        {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
