package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="CreditFormulas")
public class CreditFormula implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public CreditFormula() {
		super();
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id; 
	
	@Column
	private int duration;

	@Column
	private double interestRate;

	@ManyToOne
	Bank bank;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@JsonBackReference
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public int getId()
	{
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CreditFormula [id=" + id + ", duration=" + duration + ", interestRate=" + interestRate + ", bank="
				+ bank.getName() + "]";
	}
	
	
}