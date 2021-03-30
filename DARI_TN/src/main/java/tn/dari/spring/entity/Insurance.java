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
