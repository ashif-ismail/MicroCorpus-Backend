package me.ashif.microcorpus.beans;

import javax.persistence.*;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

@Entity
@Table(name = "Connection_Details")
public class Connection {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int connectionID;
    private int personID;
    private String dateOfConn;
    private String initialDue;
    private String dateOfDue;
    private String installmentAmount;
    private String InstallmentType;
    private String outstandingAmount;

    public int getConnectionID() {
        return connectionID;
    }

    public void setConnectionID(int connectionID) {
        this.connectionID = connectionID;
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

    public String getInitialDue() {
        return initialDue;
    }

    public void setInitialDue(String initialDue) {
        this.initialDue = initialDue;
    }

    public String getDateOfDue() {
        return dateOfDue;
    }

    public void setDateOfDue(String dateOfDue) {
        this.dateOfDue = dateOfDue;
    }

    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getInstallmentType() {
        return InstallmentType;
    }

    public void setInstallmentType(String installmentType) {
        InstallmentType = installmentType;
    }

    public String getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(String outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }
}
