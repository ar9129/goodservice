package com.aditya.goodservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class good {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long goodId ;
    @Column(name = "PRODUCT_NAME")
    private String goodName ;
    @Column(name = "PRICE")
    private long price ;
    @Column(name = "QUANTITY")
    private long quantity ;
}





