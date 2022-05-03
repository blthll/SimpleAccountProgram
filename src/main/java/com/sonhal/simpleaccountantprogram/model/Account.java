package com.sonhal.simpleaccountantprogram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "account")
@EqualsAndHashCode(callSuper = true)
public class Account extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private Float balance;

    @Column
    private String address;

    @Column
    private String currency;

}





