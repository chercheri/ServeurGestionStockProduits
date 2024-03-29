package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String reference;
	
	private int quantite;
	
	private float prixUnitaire;
	
	

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit(String reference, int quantite, float prixUnitaire) {
		super();
		this.reference = reference;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public String getReference() {
		return reference;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", reference=" + reference + ", quantite=" + quantite + ", prixUnitaire="
				+ prixUnitaire + "]";
	}

	
}
