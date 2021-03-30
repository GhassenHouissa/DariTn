package tn.dari.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Comment;
import tn.dari.spring.entity.Favorites;
import tn.dari.spring.repository.FavoritesRepository;


@Service
public class FavoritesServiceImpl implements IFavoritesService {

	@Autowired
	FavoritesRepository fr;
	
	@Override
	public void addFavorites(Favorites f) {
			fr.save(f);
			
		
	}
	

	@Override
	public boolean deleteFavorites(long id) {
		if(fr.existsById(id)){
			fr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	/*@Override
	public void addFavorites(Favorites f) {
		if()
		
	}*/

}
