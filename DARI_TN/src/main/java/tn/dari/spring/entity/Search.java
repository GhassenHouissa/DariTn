package tn.dari.spring.entity;

import javax.persistence.ManyToOne;

public class Search {

	@ManyToOne
	private Customer customers;

}
