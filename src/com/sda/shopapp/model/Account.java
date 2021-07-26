package com.sda.shopapp.model;

import java.util.Date;

public class Account {
    private String id;
    private String billingAddress;
    private boolean isClosed;
    private Date creationDate;
    private Date closeDate;

    public Account(String id, String billingAddress, boolean isClosed, Date creationDate, Date closeDate) {
        this.id = id;
        this.billingAddress = billingAddress;
        this.isClosed = isClosed;
        this.creationDate = creationDate;
        this.closeDate = closeDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", isClosed=" + isClosed +
                ", creationDate=" + creationDate +
                ", closeDate=" + closeDate +
                '}';
    }
}
