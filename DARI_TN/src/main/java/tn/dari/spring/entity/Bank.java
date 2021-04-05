package tn.dari.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="bank")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bank_id;
	private String name;
	private String interet_rate;
	
	
	public Bank() {
		
	}
	
	public Bank(String name, Long bank_id, String interet_rate) {
		super();
		this.name = name;
		this.bank_id = bank_id;
		this.interet_rate = interet_rate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getBank_id() {
		return bank_id;
	}
	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}
	public String getInteret_rate() {
		return interet_rate;
	}
	public void setInteret_rate(String interet_rate) {
		this.interet_rate = interet_rate;
	}

}
