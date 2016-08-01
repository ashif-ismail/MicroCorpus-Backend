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
    private int id;
    private String customerID;
    private String dateOfConn;
    private int initialAmount;
    private String dateOfDue;
    private int installmentAmount;
    private int totalAmount;
    private int customerType;
    private String customerName;
    private String customerGuardian;
    private String doc;
    private String password;
    private Long mobileNo;
    private String connectedBy;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getDateOfConn() {
        return dateOfConn;
    }

    public void setDateOfConn(String dateOfConn) {
        this.dateOfConn = dateOfConn;
    }

    public int getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(int initialAmount) {
        this.initialAmount = initialAmount;
    }

    public String getDateOfDue() {
        return dateOfDue;
    }

    public void setDateOfDue(String dateOfDue) {
        this.dateOfDue = dateOfDue;
    }

    public int getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(int installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGuardian() {
        return customerGuardian;
    }

    public void setCustomerGuardian(String customerGuardian) {
        this.customerGuardian = customerGuardian;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getConnectedBy() {
        return connectedBy;
    }

    public void setConnectedBy(String connectedBy) {
        this.connectedBy = connectedBy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
