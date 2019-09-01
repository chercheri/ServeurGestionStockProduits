package com.example.demo.entity;

public class Produit {
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
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", quantite=" + quantite + ", prixUnitaire=" + prixUnitaire + "]";
	}
	
}
