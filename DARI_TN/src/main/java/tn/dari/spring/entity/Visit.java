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
