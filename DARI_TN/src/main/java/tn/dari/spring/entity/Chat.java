package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Chat")
public class Chat implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_MSG")
	private Long IdMSG ;
	@Column(name="DATE_MSG")
	private String DateMSG;
	@Column (name="SUBJECT_MSG")
	
	private String SubjectMSG;
	public Chat() {
		super();
	}
	
	public Chat(Long idMSG, String dateMSG, String subjectMSG) {
		super();
		IdMSG = idMSG;
		DateMSG = dateMSG;
		SubjectMSG = subjectMSG;
	}

	public Long getIdMSG() {
		return IdMSG;
	}

	public void setIdMSG(Long idMSG) {
		IdMSG = idMSG;
	}

	public String getDateMSG() {
		return DateMSG;
	}

	public void setDateMSG(String dateMSG) {
		DateMSG = dateMSG;
	}

	public String getSubjectMSG() {
		return SubjectMSG;
	}

	public void setSubjectMSG(String subjectMSG) {
		SubjectMSG = subjectMSG;
	}

	@Override
	public String toString() {
		return "Chat [IdMSG=" + IdMSG + ", DateMSG=" + DateMSG + ", SubjectMSG=" + SubjectMSG + "]";
	}
	
	

}
