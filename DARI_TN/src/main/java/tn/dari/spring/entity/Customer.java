package tn.dari.spring.entity;

import java.util.List;

import javax.persistence.OneToMany;

public class Customer extends User {
	
	public static final long serialVersionUID = 1L;
	
	private String log_customer;
	private String psswd_customer;
	private String email_customer;
	
//	private List<Comment> comments;
	
	
	
//	private List<Notification> notifications;
	
//	private List<Orders> ords;
	
//	private List<Chat> chats;
	
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

	



}
