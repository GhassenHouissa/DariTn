package tn.dari.spring.entity;

public class Bank {

	private String name;
	private String bank_id;
	private String interet_rate;
	
	
	public Bank(String name, String bank_id, String interet_rate) {
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
	public String getBank_id() {
		return bank_id;
	}
	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	public String getInteret_rate() {
		return interet_rate;
	}
	public void setInteret_rate(String interet_rate) {
		this.interet_rate = interet_rate;
	}

}
