package tn.dari.spring.entity;

import javax.persistence.ManyToOne;

public class Chat {

	@ManyToOne
	private Customer customers;

}
