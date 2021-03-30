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
@Table(name="T_User")

public class User implements Serializable {
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column(name="ID_User")
		private Long Id_User;
		private String firstName ;
		private String LastName ;
		@Column(name="Type_User")
		private String Type_User;
		@Temporal (TemporalType.DATE)
		private Date date;

		@OneToOne
		private Subscription Subscription;

}
