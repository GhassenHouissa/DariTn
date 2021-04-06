package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties
public class Search implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String type ;
	private String location ;
	private Float price ;

	
	@ManyToOne
	@JsonIgnore
	private Customer customer_search ;

    //Constructeur par défaut
	public Search() {
		super();
		
	}

	
	//constructeur parametrés 
	public Search( String type, String location, Float price) {
		super();
		
		this.type = type;
		this.location = location;
		this.price = price;
	}
	
	


	public Search(Long id, String type, String location, Float price) {
		super();
		this.id = id;
		this.type = type;
		this.location = location;
		this.price = price;
	}


	//getters&setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}

	
	
	
}
