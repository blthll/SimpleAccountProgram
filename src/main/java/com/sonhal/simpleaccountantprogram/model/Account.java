package com.sonhal.simpleaccountantprogram.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", address='" + address + '\'' +
                ", dateOfCreate=" + dateOfCreate +
                ", currency='" + currency + '\'' +
                '}';
    }
}





