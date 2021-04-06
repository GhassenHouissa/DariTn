package tn.dari.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="T_VISIT")
public class Visit {
	@Id
	@Column
	private Long idvisit;
	
	@ManyToOne
	User user;
}
