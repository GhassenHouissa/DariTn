package tn.dari.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="T_SEARCH")
public class Search {
	@Id
	@Column
	private Long idsearch;
	@Column
	private String filtre;
	
	
	
	@ManyToOne
	private User user;

}
