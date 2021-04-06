package tn.dari.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Favorites;
import tn.dari.spring.repository.FavoritesRepository;


@Service
public class FavoritesServiceImpl implements IFavoritesService {

	@Autowired
	FavoritesRepository fr;
	
	private static final Logger l = LogManager.getLogger(FavoritesServiceImpl.class);
	
	@Override
	public Favorites addFavorites(Favorites f) {
			return fr.save(f);
			
		
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


	@Override
	public Favorites updateFavorites(Favorites f) {
		return fr.save(f); 
	}


	@Override
	public List<Favorites> retrieveAllFavorites() {
		List<Favorites> favorites = (List<Favorites>) fr.findAll();
		for(Favorites favorite : favorites){
			l.info("favorite :" + favorite);
		}
		return favorites;
	}


	@Override
	public Favorites retrieveFavorites(Long id) {
		return fr.findById(id).get();
	}
	

	
}
