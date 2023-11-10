package com.parkauto.parkauto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.parkauto.parkauto.entity.Agence;
 
import com.parkauto.parkauto.repository.IAgenceRepository;
 
@Service
public class AgenceService {
	@Autowired
	IAgenceRepository agenceRepository;
	 
	//liste des agence
	public List<Agence> getAgences(){
		return agenceRepository.findAll();
		}
	//save
		public Agence saveAgence(Agence agence){
			return agenceRepository.save(agence);
		}
		// get a agence	
		public Agence getAgenceById(Long idAgence) {
			return agenceRepository.findById(idAgence).get();
		}
		// Delete un agence
		public void deleteAgence(Agence agence) {
			agenceRepository.delete(agence);
		}
	
}
