package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Favorites implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	private int num;
	
	
	@ManyToOne
	private Ads ads ;
	
	@ManyToOne
	private User user ;
	
	
   //constructeur par défaut 
	public Favorites() {
		super();
		
	}
	


    //constructeur parametré
	
	



public Favorites(Date date, int num) {
		super();
		this.date = date;
		this.num=num;
	}



public Favorites(Long id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}



//getters&setters 

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	
	

}
