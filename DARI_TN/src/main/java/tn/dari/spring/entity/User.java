package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.OneToMany;


	
	//@OneToMany
	//Visit visit;
	
	//@OneToMany
	//Bank bank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

		


@Entity
@Table(name = "T_USER")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long Id;
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String login;
	@Column(nullable=false)
	private String password;


	@Enumerated(EnumType.STRING)
	private Role role;

	public User( ) {
		
	}
	 
	 
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param login
	 * @param password
	 * @param role
	 */
	public User(Long id, String firstName, String lastName, String email, String login, String password, Role role) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.login = login;
		this.password = password;
		this.role = role;
	}



	public User(String login) {
		this.login = login;
	}



	@OneToMany
	private List<Claim> claims;
	@OneToMany
	private List<VisiteRDV> visits;
//			private List<Favorites> favorites;
	@OneToMany
	private List<Bank> banks;
//			@OneToMany
//			private List<Historical>historicals;
	@OneToMany
	private List<Search> searchs;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public List<Favorites> getFavorites() {
//			return favorites;
//		}
//		public void setFavorites(List<Favorites> favorites) {
//			this.favorites = favorites;
//		}

}
