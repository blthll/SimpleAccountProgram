package com.sonhal.simpleaccountantprogram.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "invoice")
@ToString
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

    @ManyToOne
    @Getter
    @Setter
    private Account account;

    public enum Type {
        INCOME,
        OUTCOME
    }
}





