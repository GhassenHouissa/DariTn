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
private Long idAds;
private String content;
private String location;
private Long area;
private int nbRooms ;
private int roomArea;
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
		Long idAds, 
		String content, 
		String location, 
		Long area, 
		int nbRooms, 
		int roomArea,
		String composition
		) 
{
	super();
	this.idAds = idAds;
	this.content = content;
	this.location = location;
	this.area = area;
	this.nbRooms = nbRooms;
	this.roomArea= roomArea;
	this.composition = composition;
}
//***********************//

//***********Getters & Setters***********//
public Long getIdAds() {
	return idAds;
}
public void setIdAds4(long id_ads) {
	this.idAds = id_ads;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getLocation() {
	return location;
}
public void setLocation4(String location4) {
	this.location= location;
}
public Long getArea() {
	return area;
}
public void setArea(long area) {
	this.area = area;
}
public int getNb_rooms() {
	return nbRooms;
}
public void setNb_rooms4(int nb_rooms) {
	this.nbRooms = nb_rooms;
}
public int getRoom_area() {
	return roomArea;
}
public void setRoom_area(int room_area) {
	this.roomArea = room_area;
}
public String getComposition() {
	return composition;
}
public void setComposition(String composition) {
	this.composition = composition;
}
//****************************************************//
}
