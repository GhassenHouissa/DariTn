package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;

	
   private String description ;

	
	
	@ManyToOne
	private Ads ads_comment ;
	
	@ManyToOne
	private Customer customer_comment ;

   
	//constructeur par défaut
	public Comment() {
		super();
	
	}


	 //constructeur parametré
	public Comment(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	


	
	public Comment(String description) {
		super();
		this.description = description;
	}


	//getters&setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	} 
	
	
	
	
	
}
