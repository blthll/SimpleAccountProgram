package com.sonhal.simpleaccountantprogram.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Getter
    @Setter
    private Integer id;

    @Column
    @Getter
    @Setter
    private String name;

    @Column
    @Getter
    @Setter
    private Float balance;

    @Column
    @Getter
    @Setter
    private String address;

    @Column
    @Getter
    @Setter
    private Date dateOfCreate;

    @Column
    @Getter
    @Setter
    private String currency;
}





