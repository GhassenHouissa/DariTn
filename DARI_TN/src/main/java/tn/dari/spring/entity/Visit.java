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
import org.springframework.web.bind.annotation.RequestMapping;

import tn.dari.spring.service.VisitService;

@Entity
@Table(name = "visit")
	public class Visit {
	
	private String visite_date;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Long idVisit;

	public Visit() {
		
	}

	public Visit(String visite_date, Long idVisit) {
		super();
		this.visite_date = visite_date;
		this.idVisit = idVisit;
	}

	public String getVisite_date() {
		return visite_date;
	}

	public void setVisite_date(String visite_date) {
		this.visite_date = visite_date;
	}

	public Long getIdVisit() {
		return idVisit;
	}

	public void setIdVisit(Long idVisit) {
		this.idVisit = idVisit;
	}
	

	
//	@ManyToOne
//	Ads ads;
	
	

	
}




