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
	private int idOrder ;
	
	private int numberOrder ;
	private float price ;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int idOrder, int numberOrder, float price) {
		super();
		this.idOrder = idOrder;
		this.numberOrder = numberOrder;
		this.price = price;
	}
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public int getNumberOrder() {
		return numberOrder;
	}
	public void setNumberOrder(int numberOrder) {
		this.numberOrder = numberOrder;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@ManyToOne
	Customer customerorder;
	
	

}
