package com.alten.demo.service;

import com.alten.demo.model.Produit;
import com.alten.demo.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProduitServiceImplements  implements ProduitService{

    private final ProduitRepository produitRepository ;
    @Override
    public Produit create(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> read() {
        return produitRepository.findAll();
    }

    @Override
    public Optional<Produit> getProduitById(Long id) {
       return  produitRepository.findById(id);
    }


    @Override
    public Produit update(Long id, Produit produit) {
        return produitRepository.findById(id)
                .map(p-> {
                    p.setName(produit.getName());
                    p.setDescription(produit.getDescription());
                    p.setPrice(produit.getPrice());
                    p.setQuantity(produit.getQuantity());
                    p.setCategory(produit.getCategory());
                    p.setCode(produit.getCode());
                    p.setPicture(produit.getPicture());
                    p.setInventoryStatus(produit.getInventoryStatus());
                    p.setRating(produit.getRating());

                    return produitRepository.save(p);
                }).orElseThrow(()->new RuntimeException("Produit Indisponible"));

    }

    @Override
    public String delete(Long id) {
        produitRepository.deleteById(id);
        return "Produit supprimé avec succès";
    }
}
