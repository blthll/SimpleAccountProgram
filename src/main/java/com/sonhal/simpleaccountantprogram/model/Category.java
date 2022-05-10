package com.sonhal.simpleaccountantprogram.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Getter
    @Setter
    private Integer categoryId;
    @Column
    @Getter
    @Setter
    private String categoryName;
    @ManyToOne
    @Getter
    @Setter
    private Account account;
    @Column
    @Getter
    @Setter
    private Date dateOfCreate;

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", account=" + account +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }
}





