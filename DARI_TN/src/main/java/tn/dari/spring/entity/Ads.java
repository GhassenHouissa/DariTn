package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@CrossOrigin("*")

@Entity
@Table(name="ADS2")
@Data  @NoArgsConstructor @ToString
public class Ads implements Serializable {
	
	private static final long serialVersionUID = 17778512121548L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id4;
	//@Size(min=5, max=60 )
//	@NotBlank(message="please enter title before is required please enter")
	@Column(name="TITLE" , nullable=true)
	private String title4;	
	@Column(name="DESCRIPTION" , nullable=true)
	private String description4;	
	@Column(name="CATEGORY" , nullable=true)
	@Enumerated(EnumType.STRING)
	private Category category4;	
	@Column(name="TRANSACTION" , nullable=true)
	@Enumerated(EnumType.STRING)
	private Transaction transaction4 ;	
	@Column(name="ROOM" , nullable=true)
	//@PositiveOrZero
	private int nbRoom4;
	@Column(name="KITCHEN" , nullable=true)
	//@PositiveOrZero
	private int nbKitchen4;	
	@Column(name="BATHROOM" , nullable=true)
	//@PositiveOrZero
	private int nbBathRoom4;	
	@Column(name="FLOOR" , nullable=true)
	//@PositiveOrZero
	private int nbFloor4;
	@Column(name="AREA" , nullable=true)
	//@PositiveOrZero
	private int area4;	
	@Column(name="MEDIA" , nullable=true)
	private String media;
//	@NotNull(message="nott egale 0")
	@Column(name="PRICE" , nullable=true)
	private Double price4=null;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE" , nullable=true)
	private Date datePubl;
	@PrePersist
	private void onCreate() {
		datePubl = new Date();
	}
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Favorites> favorites;

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Visit> visits;

public Ads(Long id4,
		@Size(min = 5, max = 60) @NotBlank(message = "please enter title before is required please enter") String title4,
		String description4, Category category4, Transaction transaction4, @PositiveOrZero int nbRoom4,
		@PositiveOrZero int nbKitchen4, @PositiveOrZero int nbBathRoom4, @PositiveOrZero int nbFloor4,
		@PositiveOrZero int area4, String media, @NotNull(message = "nott egale 0") Double price4, Date datePubl) {
	super();
	this.id4 = id4;
	this.title4 = title4;
	this.description4 = description4;
	this.category4 = category4;
	this.transaction4 = transaction4;
	this.nbRoom4 = nbRoom4;
	this.nbKitchen4 = nbKitchen4;
	this.nbBathRoom4 = nbBathRoom4;
	this.nbFloor4 = nbFloor4;
	this.area4 = area4;
	this.media = media;
	this.price4 = price4;
	this.datePubl = datePubl;
}




}
