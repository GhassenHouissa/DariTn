package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Payment")

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="Insurance_ID")
	private Long id;
			
	@Column(name="Insurance_date_payment")
	@Temporal (TemporalType.DATE)
	//private Date_payment  date_payment;
			
	@OneToOne
	private Facture Facture ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Facture getFacture() {
		return Facture;
	}

	public void setFacture(Facture facture) {
		Facture = facture;
	}

}
