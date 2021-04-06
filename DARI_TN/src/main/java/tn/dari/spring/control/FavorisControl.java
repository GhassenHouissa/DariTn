package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Favorites;
import tn.dari.spring.service.IFavoritesService;

@RestController
public class FavorisControl {
	
	@Autowired
	IFavoritesService favoritesService;
	
	
	//********************************************add****************************************
	
	// http://localhost:8082/DARITN/servlet/add-favorites
	@PostMapping("/add-favorites")
	@ResponseBody
	public Favorites addFavorites(@RequestBody Favorites f) {
		Favorites favorites = favoritesService.addFavorites(f);     
	return favorites;
	}
	
	
	//*********************************delete************************************************
	
	// http://localhost:8082/DARITN/servlet/remove-favorites/{favorites-id}
	@DeleteMapping("/remove-favorites/{favorites-id}")
	@ResponseBody
	public void removeFavorites(@PathVariable("favorites-id") long favoritesId) {
		favoritesService.deleteFavorites(favoritesId);   
	}
	
	
	//********************************update**************************************************
	
	// http://localhost:8082/DARITN/servlet/modify-favorites
	@PutMapping("/modify-favorites")
	@ResponseBody
	public Favorites modifyFavorites(@RequestBody Favorites favorites) {
	return favoritesService.updateFavorites(favorites);             
	}
	
	//***************************************retrieveAll**************************************
	
	// http://localhost:8082/DARITN/servlet/retrieve-all-favorites
	@GetMapping("/retrieve-all-favorites")
	@ResponseBody
	public List<Favorites> getFavorites() {
	List<Favorites> list = favoritesService.retrieveAllFavorites();    
	return list;
	}
	
	//***********************************************retrievebyid**************************************				
	
	
	//http://localhost:8082/DARITN/servlet/retrieve-favorites/{favorites-id}
	@GetMapping("/retrieve-favorites/{favorites-id}")
	@ResponseBody
	public Favorites retrieveFavorites(@PathVariable("favorites-id") Long id) {
	return favoritesService.retrieveFavorites(id);              
	}

}
