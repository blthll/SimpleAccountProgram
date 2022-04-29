package com.sonhal.simpleaccountantprogram.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Invoice")
public class Invoice implements Serializable {
    public enum Type{
        INCOME,
        OUTCOME
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer invoiceId;
    @Column
    private Type invoiceType;


    @ManyToOne
    private Account account;
    @Column
    private Integer price;
    @Column
    private Date dateOfInvoice;
    @Column
    private Date dateOfCreate;

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Type getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Type invoiceType) {
        this.invoiceType = invoiceType;
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
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", invoiceType=" + invoiceType +
                ", account=" + account +
                ", price=" + price +
                ", dateOfInvoice=" + dateOfInvoice +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }
}





