package tn.dari.spring.service;

import java.util.List;

import javax.persistence.GenerationType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.repository.Ads_interface;

@Service
public class AdsServiceImp implements Ads_service{
	
	private static final Logger L = LogManager.getLogger(Ads_service.class);
	
	@Autowired
	Ads_interface repository;
	
@Override
public Ads addAds(Ads a) {
	return repository.save(a);
}

@Override
public List<Ads> showAll() {
	List<Ads> adss =(List<Ads>) repository.findAll();
	for (Ads ads : adss){
		L.info("Ads +++ :" + ads);
	}
	return adss;
}
}
