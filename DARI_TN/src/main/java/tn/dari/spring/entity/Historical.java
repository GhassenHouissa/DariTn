package tn.dari.spring.entity;

import javax.persistence.ManyToOne;

public class Historical {

	@ManyToOne
	User users;
	@ManyToOne
	private Rating ratings;

}
