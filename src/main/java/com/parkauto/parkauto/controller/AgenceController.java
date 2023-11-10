package com.parkauto.parkauto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import com.parkauto.parkauto.entity.Agence;
import com.parkauto.parkauto.entity.Camion;
import com.parkauto.parkauto.service.AgenceService;
import com.parkauto.parkauto.service.CamionService;
 
 
@RestController
@RequestMapping
@CrossOrigin("*")

public class AgenceController {

	@Autowired
	AgenceService agenceService;
	
	@PostMapping("/agence")
	public Agence createAgence(@Validated @RequestBody(required = false)Agence agence) {
		return agenceService.saveAgence(agence);
	}
	
	@GetMapping("/agences")
	public List<Agence> getAllAgence(){
		return agenceService.getAgences();
	}
	
	@GetMapping("/agence/idagence")
	public ResponseEntity findAgenceByid(@PathVariable(name="idAgence") Long idAgence){
		if(idAgence == null) {
			return ResponseEntity.badRequest().body("cannot retreive agence with  null id");
		}
		Agence agence = agenceService.getAgenceById(idAgence);
		
		if(agence == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(agence);
	}
	
	
	
	@DeleteMapping("/agence/idagence")
	public ResponseEntity<Agence> deleteAgence(@Validated @PathVariable(name="idAgence") Long idAgence){
		Agence agence = agenceService.getAgenceById(idAgence);
		if(agence == null) {
			return ResponseEntity.notFound().build();
		}
		agenceService.deleteAgence(agence);
		return ResponseEntity.ok().body(agence);
	}
	
}
