package com.sonhal.simpleaccountantprogram.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Account implements Serializable {
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
    private Date dateOfCreate;

    @Column
    private String currency;
}





