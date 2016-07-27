package me.ashif.microcorpus.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by almukthar on 26/7/16.
 */
@Entity
@Table(name = "Connection_Details")
public class Connection {

    private int connectionID;
    private int personID;
    private String dateOfConn;
    private int initialDue;
    private int dateOfDue;
    private int installmentAmount;
    private String InstallmentType;
    private int outstandingAmount;

    public int getConnID() {
        return connectionID;
    }

    public void setConnID(int connID) {
        this.connectionID = connID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getDateOfConn() {
        return dateOfConn;
    }

    public void setDateOfConn(String dateOfConn) {
        this.dateOfConn = dateOfConn;
    }

    public int getInitialDue() {
        return initialDue;
    }

    public void setInitialDue(int initialDue) {
        this.initialDue = initialDue;
    }

    public int getDateOfDue() {
        return dateOfDue;
    }

    public void setDateOfDue(int dateOfDue) {
        this.dateOfDue = dateOfDue;
    }

    public int getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(int installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getInstallmentType() {
        return InstallmentType;
    }

    public void setInstallmentType(String installmentType) {
        InstallmentType = installmentType;
    }

    public int getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(int outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }
}
