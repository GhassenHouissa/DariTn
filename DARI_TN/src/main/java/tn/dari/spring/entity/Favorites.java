package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Favorites implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	
	@ManyToOne
	private Ads ads ;
	
	@ManyToOne
	private User user ;
	
	
   //constructeur par défaut 
	public Favorites() {
		super();
		
	}
	


    //constructeur parametré
	public Favorites(Long id, Ads ads, User user) {
		super();
		this.id = id;
		this.ads = ads;
		this.user = user;
	}
	
	
	
	

   public Favorites(Ads ads, User user) {
		super();
		this.ads = ads;
		this.user = user;
	}



//getters&setters 

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
	
	

}
