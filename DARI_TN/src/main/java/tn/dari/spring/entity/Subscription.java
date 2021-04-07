package tn.dari.spring.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "Subscription")
public class Subscription implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="Subscription_ID")
	private Long id; 

	
	@Column(name="price")
	private double price;
	@Column(name="descriptionOffer")
    private String descriptionOffer;

	@Enumerated(EnumType.STRING)
	private SubscriptionType subscription_Type ;
	@Temporal(TemporalType.DATE)
	private Date startingDate ;
	@Temporal(TemporalType.DATE)
	private Date ExpirationDate ;
	
//	@OneToOne(mappedBy="Subscription")
//	private User User  ;
	
	public SubscriptionType getSubscription_Type() {
		return subscription_Type;
	}
	public void setSubscription_Type(SubscriptionType subscription_Type) {
		this.subscription_Type = subscription_Type;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	public Date getExpirationDate() {
		return ExpirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		ExpirationDate = expirationDate;
	}
	public double getPrice() {
		return price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescriptionOffer() {
		return descriptionOffer;
	}
	public void setDescriptionOffer(String descriptionOffer) {
		this.descriptionOffer = descriptionOffer;
	}


}
	
	

	