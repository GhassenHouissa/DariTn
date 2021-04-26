package tn.dari.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_Favorites")
public class Favorites {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
//	User users;

	@ManyToOne
	Ads ads;
	
}
