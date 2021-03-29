package tn.dari.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="ADS")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ads  {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id4;
@Column(name="TITLE", length=25)
private String title4;
@Column(name="DESCRIPTION", length=70)
private String description4;
@Column(name="LOCATION")
@Enumerated(EnumType.STRING)
private Location location4;
@Column(name="CATEGORY")
@Enumerated(EnumType.STRING)
private Category category4;
@Column(name="TRANSACTION")
@Enumerated(EnumType.STRING)
private Transaction transaction4 ;
@Column(name="ROOM")
private int nbRoom4;
@Column(name="KITCHEN")
private int nbKitchen4;
@Column(name="BATHROOM")
private int nbBathRoom4;
@Column(name="FLOOR")
private int nbFloor4;
@Column(name="AREA")
private int area4;
@Column(name="PRICE")
private double price4;

/*@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Favorites> favorites;

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Visit> visits;

@OneToMany(cascade = CascadeType.ALL, mappedBy="ads")
private Set<Product> products;*/


}
