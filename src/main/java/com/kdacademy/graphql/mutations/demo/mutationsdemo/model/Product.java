package com.kdacademy.graphql.mutations.demo.mutationsdemo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id ;
    private String title ;
    private Boolean isOnSale ;
    private Float weight ;
    private BigDecimal price ;
    private LocalDateTime dateCreated ;

    public Product(String title, Boolean isOnSale, Float weight, BigDecimal price, LocalDateTime dateCreated) {
        this.title = title;
        this.isOnSale = isOnSale;
        this.weight = weight;
        this.price = price;
        this.dateCreated = dateCreated;
    }

}
