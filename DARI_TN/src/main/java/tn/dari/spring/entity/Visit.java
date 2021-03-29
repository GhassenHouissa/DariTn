package tn.dari.spring.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.dari.spring.service.BankService;
import tn.dari.spring.service.VisitService;
@Service
@Entity
@Table
public class Visit {
	
	private String visite_date;

	public Visit(String visite_date, Long idVisit, Ads ads) {
		super();
		this.visite_date = visite_date;
		this.idVisit = idVisit;
		this.ads = ads;
	}

	public String getVisite_date() {
		return visite_date;
	}

	public void setVisite_date(String visite_date) {
		this.visite_date = visite_date;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private  Long idVisit;
	
	@ManyToOne
	Ads ads;
	public Long getIdVisit() {
		return idVisit;
	}

	public void setIdVisit(Long idVisit) {
		this.idVisit = idVisit;
	}
	
	private List<Visit> visit = new ArrayList<>(Arrays.asList(
			));
	
	@Autowired 
    private VisitService visitService;

    @RequestMapping("/visit")
    public List<Visit> getAllVisits() {
		return visitService.getAllVisit();
	}
    
    @RequestMapping("/visit/{id}")
    public Visit getVisit(@PathVariable String id) {
    	return visitService.getVisit(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/visit")
    public void addVisit(@RequestBody Visit Visit) {
    	tn.dari.spring.entity.Visit visit = null;
		visitService.addVisit(visit);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/visit/{id}")
    public void updateVisit(@RequestBody Visit visit, @PathVariable String id) {
    	visitService.updateVisit(id, visit);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/visit/{id}")
    public void deleteVisit(@PathVariable String id) {
    	visitService.deletetVisit(id);
    }

	public List<Visit> getVisit() {
		return visit;
	}

	public void setVisit(List<Visit> visit) {
		this.visit = visit;
	}

	
}




