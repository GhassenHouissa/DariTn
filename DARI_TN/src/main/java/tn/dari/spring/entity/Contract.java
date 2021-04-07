package tn.dari.spring.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Contract")
public class Contract implements Serializable {
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract(Long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="Contract_Id")
	private Long id; 

	@Column(name="Contract_Type")
	private String type; 

	@OneToOne
	private Subscription Subscription ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Subscription getSubscription() {
		return Subscription;
	}

	public void setSubscription(Subscription subscription) {
		Subscription = subscription;
	}



}
