package tn.dari.spring.service;

import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.repository.Ads_interface;

public class AdsServiceImp implements Ads_service{
	@Autowired
	Ads_interface repository;
	
@Override
public Ads addAds(Ads a) {
	return repository.save(a);
}
}
