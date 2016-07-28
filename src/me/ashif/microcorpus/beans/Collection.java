package me.ashif.microcorpus.beans;

import javax.persistence.*;

@Entity
@Table(name = "Collection_Details")
public class Collection {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
    private int collectionID;
    private int connectionID;
    private int collectionAmount;
    private String collectedBy;
    private String dateOfCollection;

    public int getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(int collectionID) {
        this.collectionID = collectionID;
    }

    public int getConnectionID() {
        return connectionID;
    }

    public void setConnectionID(int connectionID) {
        this.connectionID = connectionID;
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
