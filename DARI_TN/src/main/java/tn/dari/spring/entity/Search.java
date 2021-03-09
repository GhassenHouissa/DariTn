/*package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Search implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSearch;
	

	private String type;
	private String location ;
	private String price ;
	
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Search(int idSearch, String type, String location, String price) {
		super();
		this.idSearch = idSearch;
		this.type = type;
		this.location = location;
		this.price = price;
	}

	public int getIdSearch() {
		return idSearch;
	}

	public void setIdSearch(int idSearch) {
		this.idSearch = idSearch;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	@ManyToOne
	Customer customer;
}*/
