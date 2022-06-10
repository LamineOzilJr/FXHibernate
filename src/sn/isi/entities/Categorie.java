package sn.isi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column(length = 100, nullable = false)
	private String libelle;
	@OneToMany(mappedBy ="categorie")
	public List<Produit> produits = new ArrayList<Produit>();
	
	
	public Categorie() {
		super();
	}
	

	/**
	 * @param id
	 * @param libelle
	 */
	Categorie(int id, String libelle,  List<Produit> produits) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.produits = produits;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	

}
