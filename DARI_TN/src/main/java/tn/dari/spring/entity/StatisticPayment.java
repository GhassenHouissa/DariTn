package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StatisticPayment implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	

	public StatisticPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String reference ;
	private String total;
	private String totalMin ;
	private String totalMax ;
	
	private String location;
	private String prix;
	
	
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getTotalMin() {
		return totalMin;
	}
	public void setTotalMin(String totalMin) {
		this.totalMin = totalMin;
	}
	public String getTotalMax() {
		return totalMax;
	}
	public void setTotalMax(String totalMax) {
		this.totalMax = totalMax;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}


	

}
