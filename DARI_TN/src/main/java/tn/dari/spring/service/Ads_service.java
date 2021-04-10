package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Ads;

public interface Ads_service {
	
	Ads addAds(Ads a);
	
	public List<Ads> showAll();
	
	 Ads findbyid(long id);
}
