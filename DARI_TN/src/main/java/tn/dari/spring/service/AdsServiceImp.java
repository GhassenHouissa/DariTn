package tn.dari.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.repository.Ads_interface;
@Service
public class AdsServiceImp implements Ads_service{
	@Autowired
private	Ads_interface adsInterface;
	
@Override
public Ads addAds(Ads a) {
	Ads ads = adsInterface.save(a);
	return ads;
}

@Override
public List<Ads> findAll() {
	List<Ads> ads = (List<Ads>) adsInterface.findAll();	
	return ads;
}

@Override
public Ads updateAds(Ads a) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteAds(Long id) {
	adsInterface.deleteById(id);	
}

@Override
public Ads findById(Long id) {
	Ads ads=adsInterface.findById(id).get();
	if(ads==null)
		return ads;
	return null;
}

@Override
public List<Ads> findByTitleContains(String t) {
	List<Ads> ads =  adsInterface.findByTitle4Contains(t);
	if(ads==null) {
		return null;}
	return ads;

}

public List<Ads> findByTransaction(String l){
	List<Ads> ads =  adsInterface.findByLocation4Contains(l);
	return ads;
}



}
