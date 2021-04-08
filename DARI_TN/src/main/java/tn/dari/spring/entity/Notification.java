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
public class Notification implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	public String text;


	@ManyToOne
	private Customer customer_notif ;


	//constructeur par défaut 
	public Notification() {
		super();
		
	}


	//constructeur parametrés
	public Notification(String text) {
        this.text = text;
    }


	public Notification(Long id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
	
	


	public Notification(Date date) {
		super();
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
	
	
	

}
