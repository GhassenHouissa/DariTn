package tn.dari.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="ADS")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ads implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id4;
	@Size(min=5, max=60 )
//	@NotEmpty(message="le champ title est obligatoire")
	@Column(name="TITLE", nullable=false)
	//@NotBlank(message="enter number of floor")
	private String title4;
	@Column(name="DESCRIPTION", length=70, nullable=true)
	private String description4;
	//@NotEmpty(message="le champ category est obligatoire")
	@Column(name="CATEGORY", nullable=false)
	@Enumerated(EnumType.STRING)
	private Category category4;
	//@NotEmpty(message="le champ transaction est obligatoire")
	@Column(name="TRANSACTION", nullable=false)
	@Enumerated(EnumType.STRING)
	private Transaction transaction4 ;
//	@NotEmpty(message="le champ nbRoom est obligatoire")
	@Column(name="ROOM", nullable=false)
	@PositiveOrZero
	private int nbRoom4;
	@Column(name="KITCHEN", nullable=true)
	@PositiveOrZero
	private int nbKitchen4;
//	@NotEmpty(message="le champ nbBathRoom est obligatoire")
	@Column(name="BATHROOM")
	@PositiveOrZero
	//@NotBlank(message="enter number of floor")
	private int nbBathRoom4;
	@Column(name="FLOOR", nullable=true)
	@PositiveOrZero
	private int nbFloor4;
	//@NotEmpty(message="le champ area est obligatoire")
	@Column(name="AREA", nullable=false)
	@PositiveOrZero
	private int area4;
	//@NotEmpty(message="le champ price est obligatoire")
	@Column(name="PRICE", nullable=false)
	@Positive
	private double price4;
	@Column(name="MEDIA", length = 1200, nullable=true)
	private String media;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE", nullable=false)
	private Date datePubl;
	@PrePersist
	private void onCreate() {
		datePubl = new Date();
	}
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Favorites> favorites;

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Visit> visits;

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Product> products;*/


}
