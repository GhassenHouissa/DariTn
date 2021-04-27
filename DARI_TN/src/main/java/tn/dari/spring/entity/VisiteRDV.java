package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "t_VisiteRDV")


public class VisiteRDV  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long IdVisiteRDV; 
	@Temporal(TemporalType.DATE)
	private Date dateVisiteRDV;
	private int Visibility;
	private String state;
	private int Heure;
	private String Attendance;

	
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Long getIdVisiteRDV() {
		return IdVisiteRDV;
	}
	public void setIdVisiteRDV(Long idVisiteRDV) {
		IdVisiteRDV = idVisiteRDV;
	}
	public Date getDateVisiteRDV() {
		return dateVisiteRDV;
	}
	public void setDateVisiteRDV(Date dateVisiteRDV) {
		this.dateVisiteRDV = dateVisiteRDV;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	public int getVisibility() {
		return Visibility;
	}
	public void setVisibility(int visibility) {
		Visibility = visibility;
	}
	
	
	
	public int getHeure() {
		return Heure;
	}
	public void setHeure(int heure) {
		Heure = heure;
		
	}
	public String getAttendance() {
		return Attendance;
	}
	public void setAttendance(String attendance) {
		Attendance = attendance;
	}
	
	
	
	
	@Override
	public String toString() {
		return "VisiteRDV [IdVisiteRDV=" + IdVisiteRDV + ", dateVisiteRDV=" + dateVisiteRDV
				+ ", Visibility=" + Visibility + ", state=" + state + ", Heure=" + Heure + ", Attendance=" + Attendance
				+ "]";
	}
	public VisiteRDV() {
		super();
	}
	public VisiteRDV(Long idVisiteRDV, Date dateVisiteRDV, int visibility, String state, int heure,
			String attendance) {
		super();
		IdVisiteRDV = idVisiteRDV;
		this.dateVisiteRDV = dateVisiteRDV;
		Visibility = visibility;
		this.state = state;
		Heure = heure;
		Attendance = attendance;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}