package com.alten.demo.repository;

import com.alten.demo.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository <Produit , Long> {

}
