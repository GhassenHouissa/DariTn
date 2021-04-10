package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Comment implements Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String mot;

	
	private String description;

	@ManyToOne
	private Ads ads;

	@ManyToOne
	private User user;

	// constructeur par défaut
	public Comment() {
		super();

	}

//	// constructeur parametré


	

	public Comment(Long id, String mot) {
	super();
	this.id = id;
	this.mot = mot;
}

	public Comment(String mot) {
	super();
	this.mot = mot;
}

	public Comment(Long id, String mot, Ads ads, User user) {
		super();
		this.id = id;
		this.mot = mot;
		this.ads = ads;
		this.user = user;
	}

	public Comment(String mot, Ads ads, User user) {
	super();
	this.mot = mot;
	this.ads = ads;
	this.user = user;
}

	/*public Comment(String description) {
		super();
		this.description = description;
	}*/

	// getters&setters
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

	public Ads getAds() {
		return ads;
	}

	public void setAds(Ads ads) {
		this.ads = ads;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}
	
	

}
