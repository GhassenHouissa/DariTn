package tn.dari.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name="T_CUSTOMER")
public class Customer extends User {
	
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_customer;
	private String log_customer;
	private String psswd_customer;
	private String email_customer;
	@Temporal(TemporalType.DATE)
	private Date date;
	 
	
	@OneToMany
	private List<Comment> comments;
	
	@OneToMany
	private List<Search> searchs;
}
