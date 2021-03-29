package tn.dari.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Ads;
@Repository
public interface Ads_service {
	List<Ads> findAll ();

	Ads addAds(Ads a);
	Ads updateAds(Ads a);
	void deleteAds (Long id);
	Ads findById(Long id );
	List<Ads> findByTitleContains(String t);
	List<Ads> findByTransaction(String t);

}
 