package tn.dari.spring.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
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
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id_customer;
	private String log_customer;
	private String psswd_customer;
	private String email_customer;
	@Temporal(TemporalType.DATE)
	private Date date;
	 
	
	/*public Long getId_customer() {
		return id_customer;
	}

	public void setId_customer(Long id_customer) {
		this.id_customer = id_customer;
	}*/

	public String getLog_customer() {
		return log_customer;
	}

	public void setLog_customer(String log_customer) {
		this.log_customer = log_customer;
	}

	public String getPsswd_customer() {
		return psswd_customer;
	}

	public void setPsswd_customer(String psswd_customer) {
		this.psswd_customer = psswd_customer;
	}

	public String getEmail_customer() {
		return email_customer;
	}

	public void setEmail_customer(String email_customer) {
		this.email_customer = email_customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="customer_comment")
	private Set<Comment> comment;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="customer_search")
	private Set<Search> search;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="customer_notif")
	private Set<Notification> notification;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="customer_orders")
	private Set<Orders> orders;
	
	@OneToMany
	private List<Chat> chats;

}
