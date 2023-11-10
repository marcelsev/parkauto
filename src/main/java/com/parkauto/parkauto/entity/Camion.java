package com.parkauto.parkauto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "CAMION")
public class Camion extends Vehicule{	
	
	@Override
	public String demarrer() {
		return "BRRRRRRRRRR";
	}
	
	
	@Override
	public String accelerer() {
		return "BROUMMMMM";
	}


	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Camion(Long id, int anneeModel, double prix) {
		super(id, anneeModel, prix);
		// TODO Auto-generated constructor stub
	}


	public Camion(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

