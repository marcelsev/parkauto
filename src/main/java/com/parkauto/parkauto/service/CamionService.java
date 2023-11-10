package com.parkauto.parkauto.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.parkauto.parkauto.entity.Camion;
 
import com.parkauto.parkauto.repository.ICamionRepository;
 
@Service //1er
public class CamionService {
@Autowired
ICamionRepository camionRepository;
 
//liste des camion
public List<Camion> getCamions(){
	return camionRepository.findAll();
	}
//save
	public Camion saveCamion(Camion camion){
		return camionRepository.save(camion);
	}
	// get a camion	
	public Camion getCamionById(Long idCami) {
		return camionRepository.findById(idCami).get();
	}
	// Delete un camion
	public void deleteCamion(Camion camion) {
		camionRepository.delete(camion);
	}
 
}