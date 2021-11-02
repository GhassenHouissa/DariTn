package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Notif")
public class Notification implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_NOTIF")
	private Long IdNotif ;
	@Column(name="DESCRIPTION_NOTIF")
	private String DescNotif;
	@Column (name="SUBJECT_NOTIF")
	private String SubjectNotif;
	
	
	public Notification() {
		super();
	}
	
	public Notification(Long idNotif, String descNotif, String subjectNotif) {
		super();
		IdNotif = idNotif;
		DescNotif = descNotif;
		SubjectNotif = subjectNotif;
	}
	public Long getIdNotif() {
		return IdNotif;
	}
	public void setIdNotif(Long idNotif) {
		IdNotif = idNotif;
	}
	public String getDescNotif() {
		return DescNotif;
	}
	public void setDescNotif(String descNotif) {
		DescNotif = descNotif;
	}
	public String getSubjectNotif() {
		return SubjectNotif;
	}
	public void setSubjectNotif(String subjectNotif) {
		SubjectNotif = subjectNotif;
	}
	@Override
	public String toString() {
		return "Notification [IdNotif=" + IdNotif + ", DescNotif=" + DescNotif + ", SubjectNotif=" + SubjectNotif + "]";
	}
}

	

