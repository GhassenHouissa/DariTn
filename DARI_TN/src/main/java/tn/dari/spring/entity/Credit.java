package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="Credits")
public class Credit implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Credit()
	{
		super();
	}

	public Credit(CreditFormula creditformula, float initialamount, float monthly) 
	{
		super();

		this.creditformula=creditformula;
		this.initialamount = initialamount;
		this.monthly=monthly;
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id; 
	
	@Column(name="initialamount")
	private float initialamount;
	
	@Column(name="finalamount")
	private float finalamount;
	
	@Column
	private float monthly;

	
	@OneToOne
	private CreditFormula creditformula;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public CreditFormula getCreditformula() {
		return creditformula;
	}

	public void setCreditformula(CreditFormula creditformula) {
		this.creditformula = creditformula;
	}

	public float getMonthly() {
		return monthly;
	}

	public void setMonthly(float monthly) {
		this.monthly = monthly;
	}
	
	public float getInitialamount() {
		return initialamount;
	}

	public void setInitialamount(float initialamount) {
		this.initialamount = initialamount;
	}

	public float getFinalamount() {
		return finalamount;
	}

	public void setFinalamount(float finalamount) {
		this.finalamount = finalamount;
	}

	@Override
	public String toString() {
		return "Credit [id=" + id + ", initialamount=" + initialamount + ", finalamount=" + finalamount + ", monthly="
				+ monthly + creditformula.getId() + ", //creditformula="  + "]";
	}
}
