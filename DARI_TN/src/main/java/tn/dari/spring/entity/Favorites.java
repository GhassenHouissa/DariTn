package tn.dari.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="L_Favoris")
public class Favorites {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private  Long idFav;

public Long getIdFav() {
		return idFav;
	}

	public void setIdFav(Long idFav) {
		this.idFav = idFav;
	}

@ManyToOne
Ads ads;
}
