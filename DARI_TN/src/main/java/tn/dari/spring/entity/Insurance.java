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
@Table(name = "Insurance")

public class Insurance implements Serializable {

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Insurance(Long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="Insurance_ID")
private Long id;
		
@Column(name="Insurance_type")
private String type;
		
@OneToOne
private Subscription Subscription;

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

//public Insurance(Subscription subscription, Date creationDate, Date expirationDate, Float price) 
//{
//	super();
//	this.Subscription=subscription;
//	this.creationDate = creationDate;
//	this.expirationDate = expirationDate;
//	this.price = price;
//}
//
//
//@Id
//@GeneratedValue (strategy = GenerationType.IDENTITY)
//@Column(name="ID")
//private int id; 
//
//@Autowired
//@Temporal(TemporalType.DATE)
//private Date creationDate;
//
//@Temporal(TemporalType.DATE)
//private Date expirationDate;
//
//@Column(name="PRICE")
//private float price;
//
//
//@OneToOne
//private Subscription Subscription;
//}

