package com.sonhal.simpleaccountantprogram.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Invoice")
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Getter
    @Setter
    private Integer invoiceId;
    @Column
    @Getter
    @Setter
    private Type invoiceType;
    @ManyToOne
    @Getter
    @Setter
    private Account account;
    @ManyToOne
    @Getter
    @Setter
    private Product product;
    @Column
    @Getter
    @Setter
    private Integer price;
    @Column
    @Getter
    @Setter
    private Date dateOfInvoice;
    @Column
    @Getter
    @Setter
    private Date dateOfCreate;
    public enum Type {
        INCOME,
        OUTCOME
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", invoiceType=" + invoiceType +
                ", account=" + account +
                ", product=" + product +
                ", price=" + price +
                ", dateOfInvoice=" + dateOfInvoice +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }
}





