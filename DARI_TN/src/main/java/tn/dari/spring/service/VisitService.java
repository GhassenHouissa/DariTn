package tn.dari.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Visit;
import tn.dari.spring.repository.VisitRepository;

@Service
public class VisitService {
	
@Autowired
private VisitRepository visitRepository;
	
	public List<Visit> findAllVisits(){
		return visitRepository.findAll();
	}
	
	public Visit addVisit(Visit visit)  {
		return visitRepository.save(visit);
	}
	
	
	public void deleteVisit(Long id) {
		visitRepository.deleteById(id);
	}
	
	public Visit updateVisit(Visit visit) {
		return visitRepository.saveAndFlush(visit);
	}
	
	public Visit findVisitByID(Long id) {
		return visitRepository.getOne(id); 
	}



}



