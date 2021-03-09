package tn.dari.spring.entity;

import java.util.List;

import javax.persistence.OneToMany;

public class Rating {

	@OneToMany
	private List<Historical> historicals;

}
