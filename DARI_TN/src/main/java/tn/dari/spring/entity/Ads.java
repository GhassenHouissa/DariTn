package tn.dari.spring.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ads implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAds;
	
	
	private String content ;
	private String emplacement ;
	private String surface ;
	private String composition ;
	private int rooms ;
	
	public Ads() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdAds() {
		return idAds;
	}
	public void setIdAds(int idAds) {
		this.idAds = idAds;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public Ads(int idAds, String content, String emplacement, String surface, String composition, int rooms) {
		super();
		this.idAds = idAds;
		this.content = content;
		this.emplacement = emplacement;
		this.surface = surface;
		this.composition = composition;
		this.rooms = rooms;
	}
	
	
	
	
	
	}
	
	
	
	
	
	


