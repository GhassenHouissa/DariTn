package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_CLAIM")
public class Claim implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CLAIM")
	private long id_claim;
	@Column(name="DESCRIPTION_CLAIM")
	private String description_claim;
	@Column (name="SUBJECT_CLAIM")
	private String subject_claim;
	
	
	
	public Claim(long id_claim, String description_claim, String subject_claim, Set<User> user) {
		super();
		this.id_claim = id_claim;
		this.description_claim = description_claim;
		this.subject_claim = subject_claim;
		
	}
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId_claim() {
		return id_claim;
	}
	public void setId_claim(long id_claim) {
		this.id_claim = id_claim;
	}
	public String getDescription_claim() {
		return description_claim;
	}
	public void setDescription_claim(String description_claim) {
		this.description_claim = description_claim;
	}
	public String getSubject_claim() {
		return subject_claim;
	}
	public void setSubject_claim(String subject_claim) {
		this.subject_claim = subject_claim;
	}
	
	
	
@Override
	public String toString() {
		return "Claim [id_claim=" + id_claim + ", description_claim=" + description_claim + ", subject_claim="
				+ subject_claim + ",]";
	}




//@OneToMany(cascade=CascadeType.ALL,mappedBy="Claim")
//private Set <User> user;
}
