package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column(length = 100, nullable = false)
	private String nom; 
	@Column(length = 100, nullable = false)
	private String prenom;
	@Column(length = 100, nullable = false)
	private String email;
	@Column(length = 100, nullable = false)
	private String password;
	@OneToMany(mappedBy ="user")
	public List<Entrees> entrees = new ArrayList<Entrees>();
	@OneToMany(mappedBy ="user")
	public List<Sorties> sorties = new ArrayList<Sorties>();
	
	
	public User() {
		super();
	}
	

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param password
	 */
	User(int id, String nom, String prenom, String email, String password,  List<Entrees> entrees, List<Sorties> sorties) 
	
	{
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.entrees = entrees;
		this.sorties = sorties;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public List<Entrees> getEntrees() {
		return entrees;
	}


	public void setEntrees(List<Entrees> entrees) {
		this.entrees = entrees;
	}


	public List<Sorties> getSorties() {
		return sorties;
	}


	public void setSorties(List<Sorties> sorties) {
		this.sorties = sorties;
	}
	
	
	
}
