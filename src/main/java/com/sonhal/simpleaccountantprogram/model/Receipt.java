package com.sonhal.simpleaccountantprogram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "receipt")
@Data
@EqualsAndHashCode(callSuper = true)
public class Receipt extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer receiptId;

    @Column
    private Type receiptType;

    @ManyToOne
    private Account account;

    @Column
    private float price;

    @Column
    private Date dateOfInvoice;

    public enum Type {
        INCOME,
        OUTCOME
    }
}





