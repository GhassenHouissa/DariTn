/*package tn.dari.spring.entity;

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
	private int idNotification ;

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notification(int idNotification) {
		super();
		this.idNotification = idNotification;
	}

	public int getIdNotification() {
		return idNotification;
	}

	public void setIdNotification(int idNotification) {
		this.idNotification = idNotification;
	}
	
	@ManyToOne
	Customer customers;
	
}*/
