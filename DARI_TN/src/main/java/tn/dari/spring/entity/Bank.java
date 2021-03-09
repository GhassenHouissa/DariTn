package tn.dari.spring.entity;

import javax.persistence.ManyToOne;

public class Bank {

	@ManyToOne
	User users;

}
