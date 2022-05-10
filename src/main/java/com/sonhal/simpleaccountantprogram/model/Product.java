package com.sonhal.simpleaccountantprogram.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Getter
    @Setter
    private Integer productId;
    @Column
    @Getter
    @Setter
    private String productName;
    @Column
    @Getter
    @Setter
    private String description;
    @Column
    @Getter
    @Setter
    private String dimension;
    @Column
    @Getter
    @Setter
    private String image;
    @Column
    @Getter
    @Setter
    private Integer weight;
    @Column
    @Getter
    @Setter
    private Integer productQuantity;
    @ManyToOne
    @Getter
    @Setter
    private Account account;
    @ManyToOne
    @Getter
    @Setter
    private Category category;
    @Column
    @Getter
    @Setter
    private Integer price;
    @Column
    @Getter
    @Setter
    private Date dateOfCreate;
    @Column
    @Getter
    @Setter
    private Date dateOfUpdate;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", dimension='" + dimension + '\'' +
                ", image='" + image + '\'' +
                ", weight=" + weight +
                ", productQuantity=" + productQuantity +
                ", account=" + account +
                ", category=" + category +
                ", price=" + price +
                ", dateOfCreate=" + dateOfCreate +
                ", dateOfUpdate=" + dateOfUpdate +
                '}';
    }
}





