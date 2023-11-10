
package com.parkauto.parkauto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "COMMANDE")
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDCMD")
	private Long id;
	
	@Column(name = "QTE")
	private int qte;
	
	@Column(name = "DATECMD")
	private String date;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "PRIX")
	private double prix;
	
	@Column(name = "PRIXTOTAL")
	private double prixTotal;	
	
	
	@ManyToOne
	@JoinColumn(name="commande_id")
	private Client client;
	
	
	


	public Commande() {
		super();
	}	
	

	public Commande(Long id, int qte, String date, String description, double prix, double prixTotal, Client client) {
		super();
		this.id = id;
		this.qte = qte;
		this.date = date;
		this.description = description;
		this.prix = prix;
		this.prixTotal = prixTotal;
		this.client = client;
	}


	public Commande(int qte, String date, String description, double prix, double prixTotal, Client client) {
		super();
		this.qte = qte;
		this.date = date;
		this.description = description;
		this.prix = prix;
		this.prixTotal = prixTotal;
		this.client = client;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getQte() {
		return qte;
	}


	public void setQte(int qte) {
		this.qte = qte;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public double getPrixTotal() {
		return prixTotal;
	}


	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
		
	
	
}
