package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Favorites;


public interface IFavoritesService {
	
	Favorites addFavorites(Favorites f);
	boolean deleteFavorites(long id);
	Favorites updateFavorites( Favorites f);
	List<Favorites> retrieveAllFavorites();
	Favorites retrieveFavorites(Long id);

}
