package tn.dari.spring.service;

import tn.dari.spring.entity.Favorites;

public interface IFavoritesService {
	
	void addFavorites(Favorites f);
	boolean deleteFavorites(long id);

}
