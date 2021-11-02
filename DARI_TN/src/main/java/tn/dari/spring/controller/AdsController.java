package tn.dari.spring.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Category;
import tn.dari.spring.entity.Transaction;
import tn.dari.spring.entity.User;
import tn.dari.spring.repository.AdsRepository;
import tn.dari.spring.service.AdsService;
import tn.dari.spring.utility.BadWordsException;
@CrossOrigin("*")
@RestController
public class AdsController  {

	@Autowired 
	AdsService adsService ;
	@Autowired
	AdsRepository adsInterface;
	
	@PostMapping(value="postAds")	
	public Ads addAds(@RequestBody Ads a) throws BadWordsException {
			adsService.addAds(a);
			return a;

	}
	
	@GetMapping(value="getAllAds")
	public List<Ads> retrieveAll() {
		return (List<Ads>) adsService.retrieveAll();
	} 
	
	@PutMapping(value="putAds")	 
	public Ads updateAds(@RequestBody Ads a) throws Exception {
	//	a.setId4(id);
		return adsService.updateAds( a);
	}
		
	@DeleteMapping(value="deleteAds/{id}")
	public void deleteAds(@PathVariable(name="id") Long id) {
		adsService.deleteAds(id);	
	}
	
	@GetMapping(value="/getAdsById/{id}")
	public Ads retrieveById(@PathVariable(name="id") Long id) {
		Ads ads=adsInterface.findById(id).get();
		if(ads!=null)
			return ads;
		return null;
	}

	@GetMapping("/numberOfAds")	
	@ResponseBody
	public Long countAds() {
		Long count= adsService.countAds();
		return count;
	}
	
	@GetMapping("/numberAdsByCategory/{Category}")	
	@ResponseBody
	public int countAdsByCategory(@PathVariable("Category") String category) {
				int countAdsByCategory= adsService.findAdsByCategory(Category.valueOf(category));
		return countAdsByCategory;
	}
	
	@GetMapping("/numberAdsByTransaction/{Transaction}")	
	@ResponseBody
	public int countAdsByTransaction(@PathVariable("Transaction") String transaction) {
				int countAdsByTransaction= adsService.findAdsByTransaction(Transaction.valueOf(transaction));
		return countAdsByTransaction;
	}

}
