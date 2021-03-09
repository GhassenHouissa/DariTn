/*package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class User implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId ;
	
	private Set<Favorites> favorites ;	
	
	private String name ;
	private String email ;
	
	@OneToMany(mappedBy="user") 
    public Set<Favorites> getFavorites() {
		return favorites;
	}


	public void setFavorites(Set<Favorites> favorites) {
		this.favorites = favorites;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public User(int userId, String name, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	
	
	
	
	

	

}*/
