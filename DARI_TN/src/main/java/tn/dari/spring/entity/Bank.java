package tn.dari.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_BANK")
public class Bank {
	@Id
	@Column
	private Long idBank; 

	@ManyToOne
	User users;

}
