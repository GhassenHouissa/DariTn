package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Visit;

public class VisitService {
	
	public List<Visit> getAllVisit() { 
		return getAllVisit();
	}
	
	public Visit getVisit(String id) {
		return getAllVisit().stream().filter(t ->t.getIdVisit().equals(id)).findFirst().get();
	}

	public void addVisit(Visit visit) {
		visit.addVisit(visit);;
	}

	public void updateVisit(String id, Visit visit) {
		for (int i=0; i < getAllVisit().size(); i++) {
			Visit t = getAllVisit().get(i);
			if(t.getIdVisit().equals(id)) {
				getAllVisit().set(i, visit);
				return;
			}
		}
		
	}

	public void deletetVisit(String id) {
		getAllVisit().removeIf(t -> t.getVisit().equals(id));
	}

}



