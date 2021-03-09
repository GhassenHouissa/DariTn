package tn.dari.spring.entity;

import java.io.Serializable;
//import java.util.Set;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCustomer ;
	

	private String logCustomer ;
	private String password ;
	private String adress;
	private String pseudo ;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	public Customer(int idCustomer, String logCustomer, String password, String adress, String pseudo) {
		super();
		this.idCustomer = idCustomer;
		this.logCustomer = logCustomer;
		this.password = password;
		this.adress = adress;
		this.pseudo = pseudo;
	}




	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getLogCustomer() {
		return logCustomer;
	}

	public void setLogCustomer(String logCustomer) {
		this.logCustomer = logCustomer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy="customer")
	private Set<Search> Searchs;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="customers")
	private Set<Notification> Notifications;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="customerss")
	private Set<Comment> Comments;*/
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="customerorder")
	private Set<Orders> orders;
	
	
	
	

}
