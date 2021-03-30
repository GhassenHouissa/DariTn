package tn.dari.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.repository.AdsRepository;
@Service
@RestController
public class AdsServiceImp implements AdsService{
	@Autowired
private	AdsRepository adsInterface;
@PostMapping(value="listAds")	
@Override
public Ads addAds(@RequestBody Ads a) {
	return adsInterface.save(a);
}
@GetMapping(value="listAds")
@Override
public List<Ads> retrieveAll() {
		
	return (List<Ads>) adsInterface.findAll();
}
@PutMapping(value="listAds/{id}")
@Override 
public Ads updateAds(@PathVariable(name="id") Long id ,@RequestBody Ads a) {
a.setId4(id);
	return adsInterface.save(a);
}
@DeleteMapping(value="listAds/{id}")
@Override
public void deleteAds(@PathVariable(name="id") Long id) {
	adsInterface.deleteById(id);	
}
@GetMapping(value="listAds/{id}")
@Override
public Ads retrieveById(@PathVariable(name="id") Long id) {
	Ads ads=adsInterface.findById(id).get();
	if(ads!=null)
		return ads;
	return null;
}





}
