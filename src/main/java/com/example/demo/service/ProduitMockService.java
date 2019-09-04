package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;

@Service
public class ProduitMockService implements ICrudService<Produit, Long> {

	private List<Produit> produits;
	
	public ProduitMockService() {
		this.produits = new ArrayList<Produit>();
		produits.add(new Produit("Livre" , 50 , 20f));
		produits.add(new Produit("Cahier", 200 , 5.25f));
		produits.add(new Produit("Stylo", 500 , 2.10f));
	}

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addOne(Produit produit) {
		produits.add(produit);

	}

	@Override
	public void updateOne(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void deleteOne(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		produits.remove(produit);
	}

}
