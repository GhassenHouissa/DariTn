package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import tn.dari.spring.service.Ads_service;

@Entity
@Table(name="D_annonce")
public class Ads implements Serializable  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idAds4;
private String content4;
private String location;
private Long area;
private int nbRooms4 ;
private int roomArea4;
private String composition;

//private boolean add=false ;  


@OneToMany(cascade = CascadeType.ALL, mappedBy="ads") 
private Set<Favorites> favorites;

/*@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Visit> visits;*/

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Product> products;

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads_comment")
private Set<Comment> comment;



//constructeur par defaut//
public Ads() {
	super();
}
//***********************//
//constructeur parametré//
public Ads(
		Long idAds4, 
		String content4, 
		String location4, 
		Long area4, 
		int nbRooms4, 
		int roomArea4,
		String composition
		) 
{
	super();
	this.idAds4 = idAds4;
	this.content4 = content4;
	this.location = location4;
	this.area = area4;
	this.nbRooms4 = nbRooms4;
	this.roomArea4 = roomArea4;
	this.composition = composition;
}
//***********************//

//***********Getters & Setters***********//
public Long getIdAds4() {
	return idAds4;
}
public void setIdAds4(long id_ads4) {
	this.idAds4 = id_ads4;
}
public String getContent4() {
	return content4;
}
public void setContent4(String content4) {
	this.content4 = content4;
}
public String getLocation() {
	return location;
}
public void setLocation4(String location4) {
	this.location= location;
}
public Long getArea4() {
	return area;
}
public void setArea4(long area4) {
	this.area = area;
}
public int getNb_rooms4() {
	return nbRooms4;
}
public void setNb_rooms4(int nb_rooms4) {
	this.nbRooms4 = nb_rooms4;
}
public int getRoom_area4() {
	return roomArea4;
}
public void setRoom_area4(int room_area4) {
	this.roomArea4 = room_area4;
}
public String getComposition4() {
	return composition;
}
public void setComposition4(String composition4) {
	this.composition = composition4;
}
//****************************************************//
}
