package com.sonhal.simpleaccountantprogram.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Receipt")
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





