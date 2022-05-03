package com.sonhal.simpleaccountantprogram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
@Data
@EqualsAndHashCode(callSuper = true)
public class Invoice extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private Type type;

    @Column
    private float price;

    @Column
    private Date dateOfInvoice;

    @ManyToOne
    private Account account;

    public enum Type {
        INCOME,
        OUTCOME
    }

}





