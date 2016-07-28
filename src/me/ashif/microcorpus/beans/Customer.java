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
@Table(name = "Customer_Details")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int customerID;
    private String customerType;
    private String customerName;
    private String customerFatherName;
    private String doc;
    private Long mobileNo;
    private String createdBy;
    private String address;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerFatherName() {
        return customerFatherName;
    }

    public void setCustomerFatherName(String customerFatherName) {
        this.customerFatherName = customerFatherName;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
