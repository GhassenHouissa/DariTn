package tn.dari.spring.service;

import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Category;
import tn.dari.spring.entity.Transaction;
import tn.dari.spring.utility.BadWordsException;
@CrossOrigin("*")

@Repository
public interface AdsService {

	List<Ads> retrieveAll ();
	Ads addAds(Ads a) throws BadWordsException;

	Ads updateAds( Ads a) throws Exception;

	void deleteAds (Long id);

	Ads retrieveById(Long id );

	Long countAds();

	int findAdsByCategory(Category category);

	int findAdsByTransaction(Transaction transaction);
}
 