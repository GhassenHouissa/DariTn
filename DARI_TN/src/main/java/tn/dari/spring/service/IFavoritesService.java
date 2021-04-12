package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Comment;
import tn.dari.spring.entity.Favorites;


public interface IFavoritesService {
	
	Favorites updateFavorites( Favorites f);
	List<Favorites> retrieveAllFavorites();
	Favorites retrieveFavorites(Long id);
	
	
	String addFavorites(Favorites fav, long user_id, long ads_id);
	boolean deleteFavorites(long id, long userId);

}
