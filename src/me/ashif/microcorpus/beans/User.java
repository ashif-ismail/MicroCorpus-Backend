package me.ashif.microcorpus.beans;

import javax.persistence.*;

/**
 * Created by almukthar on 26/7/16.
 */
@Entity
@Table(name = "User_Details")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int loginID;
    private String username;
    private String password;

    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
