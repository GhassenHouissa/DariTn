package tn.dari.spring.entity;

import javax.persistence.ManyToOne;

public class Orders {

	@ManyToOne
	private Customer customers;

}
