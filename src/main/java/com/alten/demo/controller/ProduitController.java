package com.alten.demo.controller;

import com.alten.demo.model.Produit;
import com.alten.demo.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {

    // En passant pas l'interfce j'utilise l'inversion de control

    private final  ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit) {
        return produitService.create(produit) ;
    }
    @GetMapping("/read")
    public List<Produit> read(){
        return produitService.read() ;
    }

    @GetMapping("/{id}")
    public Optional<Produit> getProduit (@PathVariable Long id){
        return produitService.getProduitById(id ) ;
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id ,  @RequestBody Produit produit) {
        return produitService.update(id , produit) ;
    }
    @DeleteMapping("/delete/{id}")
    public  String delete  (@PathVariable Long id) {
        return produitService.delete(id) ;
    }

}
