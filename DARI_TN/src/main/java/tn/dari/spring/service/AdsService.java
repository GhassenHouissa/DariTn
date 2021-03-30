package tn.dari.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Ads;
@Repository
public interface AdsService {
	List<Ads> retrieveAll ();
	Ads addAds(Ads a);
	Ads updateAds(Long id , Ads a);
	void deleteAds (Long id);
	Ads retrieveById(Long id );


}
 