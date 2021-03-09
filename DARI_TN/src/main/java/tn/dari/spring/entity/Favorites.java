package tn.dari.spring.entity;

import javax.persistence.ManyToOne;

public class Favorites {

	@ManyToOne
	User users;

}
