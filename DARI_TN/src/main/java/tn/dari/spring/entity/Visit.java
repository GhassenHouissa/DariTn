package tn.dari.spring.entity;

import javax.persistence.ManyToOne;

public class Visit {

	@ManyToOne
	User users;

}
