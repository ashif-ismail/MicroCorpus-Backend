package me.ashif.microcorpus.beans;

import javax.persistence.*;

@Entity
@Table(name = "Collection_Details")
public class Collection {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String customerID;
    private int collectionAmount;
    private String collectedBy;
    private String dateOfCollection;

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

    public int getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(int collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public String getCollectedBy() {
        return collectedBy;
    }

    public void setCollectedBy(String collectedBy) {
        this.collectedBy = collectedBy;
    }

    public String getDateOfCollection() {
        return dateOfCollection;
    }

    public void setDateOfCollection(String dateOfCollection) {
        this.dateOfCollection = dateOfCollection;
    }
}
