package com.alten.demo.service;

import com.alten.demo.model.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {

    // interface pour gerer un produit

    Produit create (Produit produit) ;

    List<Produit> read () ;

    Optional<Produit> getProduitById (Long id) ;

    Produit update (Long id  ,  Produit produit) ;

    String delete (Long id);

}
