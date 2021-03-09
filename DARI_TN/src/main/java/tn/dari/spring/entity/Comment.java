/*package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComment;
	
	private String description;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getIdComment() {
		return idComment;
	}



	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}



	public Comment(int idComment, String description) {
		super();
		this.idComment = idComment;
		this.description = description;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@ManyToOne
	Customer customerss;
	
	@ManyToOne(cascade = CascadeType.ALL)
	 Ads adds;

	
}*/
