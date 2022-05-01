package com.sonhal.simpleaccountantprogram.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "invoice")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer invoiceId;

    @Column
    private Type invoiceType;

    @Column
    private Integer price;

    @Column
    private Date dateOfInvoice;

    @Column
    private Date dateOfCreate;

    @ManyToOne
    private Account account;

    public enum Type {
        INCOME,
        OUTCOME
    }
}





