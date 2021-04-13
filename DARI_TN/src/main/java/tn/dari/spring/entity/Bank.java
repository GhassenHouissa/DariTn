package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Banks")
public class Bank implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Bank()
	{
		super();
	}
	
	public Bank(String name) 
	{
		super();
		this.name=name;
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id; 
	
	@Column(name="NAME")
	private String name;
	
	@OneToMany(mappedBy="bank", cascade = CascadeType.ALL, orphanRemoval = true)
	List<CreditFormula> creditformulas=new ArrayList<CreditFormula>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addFormula(CreditFormula F) {
        creditformulas.add(F);
        F.setBank(this);
    }
 
    public void removeFormula(CreditFormula F) {
        F.setBank(null);
        this.creditformulas.remove(F);
    }
	
	@JsonManagedReference
	public List<CreditFormula> getCreditformulas() {
		return creditformulas;
	}

	public void setCreditformulas(List<CreditFormula> creditformulas) {
		this.creditformulas = creditformulas;
	}
	
	
}