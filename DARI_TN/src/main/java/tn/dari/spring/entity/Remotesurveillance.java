package tn.dari.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_Remotesurveillance")

public class Remotesurveillance implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="Remotesurveillance_ID")
	private Long RemotesurveillanceId;

	@OneToOne
	private Subscription Subscription  ;

	public Long getRemotesurveillanceId() {
		return RemotesurveillanceId;
	}

	public void setRemotesurveillanceId(Long remotesurveillanceId) {
		RemotesurveillanceId = remotesurveillanceId;
	}

	public Subscription getSubscription() {
		return Subscription;
	}

	public void setSubscription(Subscription subscription) {
		Subscription = subscription;
	}
	
	
	
	
	


}
