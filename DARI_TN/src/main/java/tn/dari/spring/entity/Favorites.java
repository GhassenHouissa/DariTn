/*package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Favorites implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int favoritesId ;
	
	private User user;
	private Ads ads ;
	
	

	@ManyToOne 
	@JoinColumn(name="idUser",referencedColumnName="id",insertable=false,updatable=false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	@ManyToOne 
	@JoinColumn(name="idUser",referencedColumnName="id",insertable=false,updatable=false)
	public Ads getAds() {
		return ads;
	}

	public void setAds(Ads ads) {
		this.ads = ads;
	}

	public Favorites() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFavoritesId() {
		return favoritesId;
	}

	public void setFavoritesId(int favoritesId) {
		this.favoritesId = favoritesId;
	}

	public Favorites(int favoritesId) {
		super();
		this.favoritesId = favoritesId;
	}

	
	
	

}*/
