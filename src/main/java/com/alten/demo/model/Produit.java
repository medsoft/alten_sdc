package com.alten.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "PRODUIT")
@Getter
@Setter
@NoArgsConstructor
public class Produit {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id  ;

    private String code ;
    private String name ;
    private String description ;
    private double price ;
    private int quantity ;
    private String inventoryStatus ;
    private String category ;
    private String picture ;
    private int rating ;

}
