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
public class Receipt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Getter
    @Setter
    private Integer receiptId;

    @Column
    @Getter
    @Setter
    private Type receiptType;

    @ManyToOne
    @Getter
    @Setter
    private Account account;

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
}





