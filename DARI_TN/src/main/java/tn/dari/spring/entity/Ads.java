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
private boolean reduction;
private String baissePrix;
private boolean augmentation;
private String haussePrix;
private Long area;
private int nbRooms ;
private int roomArea;
private String composition;
private String prix;

//private boolean add=false ;  


@OneToMany(cascade = CascadeType.ALL, mappedBy="ads") 
private Set<Favorites> favorites;

/*@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Visit> visits;*/

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Product> products;

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
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


public Ads(Long idAds, String content, String location, Long area, int nbRooms, int roomArea, String composition,
		String prix) {
	super();
	this.idAds = idAds;
	this.content = content;
	this.location = location;
	this.area = area;
	this.nbRooms = nbRooms;
	this.roomArea = roomArea;
	this.composition = composition;
	this.prix = prix;
}
public Ads(String content, String location, Long area, int nbRooms, int roomArea, String composition, String prix) {
	super();
	this.content = content;
	this.location = location;
	this.area = area;
	this.nbRooms = nbRooms;
	this.roomArea = roomArea;
	this.composition = composition;
	this.prix = prix;
}

public Ads(String content, String location, boolean reduction, String baissePrix, boolean augmentation,
		String haussePrix, Long area, int nbRooms, int roomArea, String composition, String prix) {
	super();
	this.content = content;
	this.location = location;
	this.reduction = reduction;
	this.baissePrix = baissePrix;
	this.augmentation = augmentation;
	this.haussePrix = haussePrix;
	this.area = area;
	this.nbRooms = nbRooms;
	this.roomArea = roomArea;
	this.composition = composition;
	this.prix = prix;
}
//***********************//

//***********Getters & Setters***********//
public Long getIdAds() {
	return idAds;
}
public void setIdAds(long id_ads) {
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
public void setLocation(String location) {
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
public void setNb_rooms(int nb_rooms) {
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
public String getPrix() {
	return prix;
}
public void setPrix(String prix) {
	this.prix = prix;
}
public boolean isReduction() {
	return reduction;
}
public void setReduction(boolean reduction) {
	this.reduction = reduction;
}
public String getBaissePrix() {
	return baissePrix;
}
public void setBaissePrix(String baissePrix) {
	this.baissePrix = baissePrix;
}
public boolean isAugmentation() {
	return augmentation;
}
public void setAugmentation(boolean augmentation) {
	this.augmentation = augmentation;
}
public String getHaussePrix() {
	return haussePrix;
}
public void setHaussePrix(String haussePrix) {
	this.haussePrix = haussePrix;
}




//****************************************************//
}
