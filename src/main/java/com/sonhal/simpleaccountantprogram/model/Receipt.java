package com.sonhal.simpleaccountantprogram.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Receipt")
public class Receipt {
    public enum Type{
        INCOME,
        OUTCOME
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer receiptId;
    @Column
    private Type receiptType;
    @Column
    private Account account;
    @Column
    private Integer price;
    @Column
    private Date dateOfInvoice;
    @Column
    private Date dateOfCreate;

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public Type getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(Type receiptType) {
        this.receiptType = receiptType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDateOfInvoice() {
        return dateOfInvoice;
    }

    public void setDateOfInvoice(Date dateOfInvoice) {
        this.dateOfInvoice = dateOfInvoice;
    }

    public Date getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(Date dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptId=" + receiptId +
                ", receiptType=" + receiptType +
                ", account=" + account +
                ", price=" + price +
                ", dateOfInvoice=" + dateOfInvoice +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }
}





