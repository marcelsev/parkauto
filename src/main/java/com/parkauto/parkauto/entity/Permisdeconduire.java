package com.parkauto.parkauto.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "AGENCE")
public class Permisdeconduire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDPERMIS")
	private Long idPermis;
	
	@Column(name = "NUMEROPERMIS")
	private String numeroPermis;
	
	@Column(name = "DATEOBTENTION")
	private String dateObtention;
	
	//@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "PERMIS_CLIENT")
	//private List<Client> clientList;

	public Permisdeconduire(Long idPermis, String numeroPermis, String dateObtention, List<Client> clientList) {
		super();
		this.idPermis = idPermis;
		this.numeroPermis = numeroPermis;
		this.dateObtention = dateObtention;
		//this.clientList = clientList;
	}

	public Permisdeconduire(String numeroPermis, String dateObtention, List<Client> clientList) {
		super();
		this.numeroPermis = numeroPermis;
		this.dateObtention = dateObtention;
		//this.clientList = clientList;
	}

	public Permisdeconduire() {
		super();
	}

	public Long getIdPermis() {
		return idPermis;
	}

	public void setIdPermis(Long idPermis) {
		this.idPermis = idPermis;
	}

	public String getNumeroPermis() {
		return numeroPermis;
	}

	public void setNumeroPermis(String numeroPermis) {
		this.numeroPermis = numeroPermis;
	}

	public String getDateObtention() {
		return dateObtention;
	}

	public void setDateObtention(String dateObtention) {
		this.dateObtention = dateObtention;
	}

	//public List<Client> getClientList() {
		//return clientList;
	//}

	//public void setClientList(List<Client> clientList) {
		//this.clientList = clientList;
	//}
	
	
}
