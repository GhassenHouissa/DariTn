package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Orders implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int number ;
	private Float price ;

	@ManyToOne
	private Customer customer_orders ;

	

	//constructeur parametrés
	public Orders(Long id, int number, Float price) {
		super();
		this.id = id;
		this.number = number;
		this.price = price;
	}
	
	

	
	public Orders(int number, Float price) {
		super();
		this.number = number;
		this.price = price;
	}




	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}




	//getters&setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	


}
