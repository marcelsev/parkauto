package com.parkauto.parkauto.entity;
 
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
 
@Entity
@Table(name="VOITURE")
public class Voiture extends Vehicule{
	
	@Column(name="MEDIA")
	private String media;
	@Column(name="IMMAT")
	private String immatriculation;
	@Column(name="PWFISCALE")
	private String puissanceFiscale;
	@Column(name="CATEGORIE")
	private String categorie;
	@Column(name="NBPORTE")
	private int nbPorte;
	@Column(name="POIDSTOTAL")
	private int poidsTotal;
	
	
	@ManyToMany
	@JoinTable(name="LOCATION_VOITURE")
	private List<Location> locationList;	
	
	
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getInmatriculation() {
		return immatriculation;
	}
	public void setInmatriculation(String inmatriculation) {
		this.immatriculation = inmatriculation;
	}
	public String getPuissanceFiscale() {
		return puissanceFiscale;
	}
	public void setPuissanceFiscale(String puissanceFiscale) {
		this.puissanceFiscale = puissanceFiscale;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getNbPorte() {
		return nbPorte;
	}
	public void setNbPorte(int nbPorte) {
		this.nbPorte = nbPorte;
	}
	public int getPoidsTotal() {
		return poidsTotal;
	}
	public void setPoidsTotal(int poidsTotal) {
		this.poidsTotal = poidsTotal;
	}
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voiture(Long id, int anneeModel, double prix) {
		super(id, anneeModel, prix);
		// TODO Auto-generated constructor stub
	}
	public Voiture(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public List<Location> getLocationList() {
		return locationList;
	}
	public void setLocationList(List<Location> locationList) {
		this.locationList = locationList;
	}
	public Voiture(List<Location> locationList) {
		super();
		this.locationList = locationList;
	}	
	
	
	
}