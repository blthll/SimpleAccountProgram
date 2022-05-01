package com.sonhal.simpleaccountantprogram.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "receipt")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Receipt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer receiptId;

    @Column
    private Type receiptType;

    @ManyToOne
    private Account account;

    @Column
    private Integer price;

    @Column
    private Date dateOfInvoice;

    @Column
    private Date dateOfCreate;

    public enum Type {
        INCOME,
        OUTCOME
    }
}





