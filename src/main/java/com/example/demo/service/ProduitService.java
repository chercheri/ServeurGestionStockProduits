package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProduitRepository;
import com.example.demo.entity.Produit;

@Service
@Primary
public class ProduitService implements ICrudService<Produit, Long> {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> getAll() {
		return this.produitRepository.findAll();
	}

	@Override
	public void addOne(Produit produit) {
		this.produitRepository.save(produit);
		
	}

	@Override
	public void updateOne(Produit produit) {
		this.produitRepository.save(produit);
		
	}

	@Override
	public void deleteOne(Long id) {
		Produit p = new Produit();
		p.setId(id);
		this.produitRepository.delete(p);
	}

	


}
