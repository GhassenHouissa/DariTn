package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Notification implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;


	@ManyToOne
	private Customer customer_notif ;


	//constructeur par défaut 
	public Notification() {
		super();
		
	}


	//constructeur parametrés
	public Notification(Long id) {
		super();
		this.id = id;
	}


	//getters&setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
