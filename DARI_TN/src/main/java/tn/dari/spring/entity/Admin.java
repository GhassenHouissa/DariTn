package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_ADMIN")
public class Admin extends User {
	
	public static final long serialVersionUID = 1L;
	
	/*@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;*/	
	private String logadmin;
	private String psswd;
	@Enumerated(EnumType.STRING)
	private Role role;
	/*public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}*/
	public String getLogadmin() {
		return logadmin;
	}
	public void setLogadmin(String logadmin) {
		this.logadmin = logadmin;
	}
	public String getPsswd() {
		return psswd;
	}
	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
	

	

}
