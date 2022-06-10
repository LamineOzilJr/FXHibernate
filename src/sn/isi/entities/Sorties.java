package sn.isi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sorties implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;
	
	private int prix;
	private double qte;
	@ManyToOne
	public User user = new User();
	
	
	public Sorties() {
		super();
	}
	

	/**
	 * @param id
	 * @param date
	 * @param prix
	 * @param qte
	 */
	Sorties(int id, Date date, int prix,double qte, User user )
	{
		super();
		this.id = id;
		this.date = date;
		this.prix = prix;
		this.qte = qte;
		this.user = user;
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
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public double getQte() {
		return qte;
	}
	public void setQte(double qte) {
		this.qte = qte;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
