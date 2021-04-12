package tn.dari.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Comment;
import tn.dari.spring.entity.Favorites;
import tn.dari.spring.entity.User;
import tn.dari.spring.repository.FavoritesRepository;
import tn.dari.spring.repository.UserRepository;


@Service
public class FavoritesServiceImpl implements IFavoritesService {
	
	public String msg;

	@Autowired
	FavoritesRepository fr;
	
	@Autowired
	AdsServiceImp as;
	
	@Autowired
	UserRepository ur;
	
	private static final Logger l = LogManager.getLogger(FavoritesServiceImpl.class);
	
	/*@Override
	public Favorites addFavorites(Favorites f) {
			return fr.save(f);
			
		
	}*/
	

	@Override
	public boolean deleteFavorites(long id , long userId) {
		Favorites favorites = fr.findById(id).get();
		if (favorites.getUser().getId()==userId){
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


	@Override
	public String addFavorites(Favorites fav, long user_id, long ads_id) {
		  User u = ur.findById(user_id).get();
			
			Ads s = as.findbyid(ads_id);
			
			fav.setUser(u);
			fav.setAds(s);
			
				 fr.save(fav); 
			 
			 return msg= "add successful ";
			
		}
	}



	

	

