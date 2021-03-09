package tn.dari.spring.entity;

import javax.persistence.ManyToOne;

public class Notification {


	@ManyToOne
	private Customer customers;

}
