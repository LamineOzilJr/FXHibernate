package sn.isi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Entree implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column
	private double qtite;
	@Column
	private int prix;
	@ManyToOne(cascade = CascadeType.ALL)
	Produit produit = new Produit();
	/**
	 * @param id
	 * @param date
	 * @param qtite
	 * @param prix
	 * @param produit
	 */
	public Entree(int id, Date date, double qtite, int prix, Produit produit) {
		super();
		this.id = id;
		this.date = date;
		this.qtite = qtite;
		this.prix = prix;
		this.produit = produit;
	}
	/**
	 * 
	 */
	public Entree() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getQtite() {
		return qtite;
	}
	public void setQtite(double qtite) {
		this.qtite = qtite;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
}
