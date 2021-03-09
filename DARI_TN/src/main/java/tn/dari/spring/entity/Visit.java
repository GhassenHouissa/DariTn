package tn.dari.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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



}
