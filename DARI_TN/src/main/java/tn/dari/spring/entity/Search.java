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
	
	private Long id_client_Search;
	
	private String type ;
	private String location ;
	private Float price ;
	private Long nbr;
	private String word_search;

	
	@ManyToOne
	@JsonIgnore
	private User user ;

    //Constructeur par défaut
	public Search() {
		super();
		
	}
	
 private Ads ads ;
	
	//constructeur parametrés 
	
	
	public Search(Long id, String type, String location, Float price, Long nbr, User user) {
		super();
		this.id = id;
		this.type = type;
		this.location = location;
		this.price = price;
		this.nbr = nbr;
		this.user = user;
	}
	
	

	

	public Search(Long id, Long id_client_Search, String word_search) {
		super();
		this.id = id;
		this.id_client_Search = id_client_Search;
		this.word_search = word_search;
	}



	public Search(Long id, String location) {
		super();
		this.id = id;
		this.location = location;
	}



	
	
	


	public Search(Long id_client_Search, String type, String location, Float price, String word_search, User user,
			Ads ads) {
		super();
		this.id_client_Search = id_client_Search;
		this.type = type;
		this.location = location;
		this.price = price;
		this.word_search = word_search;
		this.user = user;
		this.ads = ads;
	}





	public Search(Long id, Long id_client_Search, String type, String location, Float price, String word_search,
			User user, Ads ads) {
		super();
		this.id = id;
		this.id_client_Search = id_client_Search;
		this.type = type;
		this.location = location;
		this.price = price;
		this.word_search = word_search;
		this.user = user;
		this.ads = ads;
	}





	public Search(String type) {
		super();
		this.type = type;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Long getNbr() {
		return nbr;
	}


	public void setNbr(Long nbr) {
		this.nbr = nbr;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}



	public Long getId_client_Search() {
		return id_client_Search;
	}



	public void setId_client_Search(Long id_client_Search) {
		this.id_client_Search = id_client_Search;
	}



	public String getWord_search() {
		return word_search;
	}



	public void setWord_search(String word_search) {
		this.word_search = word_search;
	}





	public Ads getAds() {
		return ads;
	}





	public void setAds(Ads ads) {
		this.ads = ads;
	}
	
	
	
	
	
	
	
	
}
