package tn.dari.spring.service;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.PrePersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Category;
import tn.dari.spring.entity.Transaction;
import tn.dari.spring.repository.AdsRepository;
import tn.dari.spring.utility.BadWordsAds;
import tn.dari.spring.utility.BadWordsException;
@CrossOrigin("*")

@Service
public class AdsServiceImp implements AdsService{
	@Autowired
	private	AdsRepository adsInterface;

@Override
public List<Ads> retrieveAll() {

	return (List<Ads>) adsInterface.findAll();
} 


@Override
public Ads addAds(@RequestBody Ads a) throws BadWordsException {
BadWordsAds.loadConfigs();	
a.setTitle4(BadWordsAds.filterText(a.getTitle4()));
a.setDescription4(BadWordsAds.filterText(a.getDescription4()));

return adsInterface.save(a);
}


@Override 
public Ads updateAds(@RequestBody Ads a) throws BadWordsException {
	//a.setId4(id);
	BadWordsAds.loadConfigs();	
	a.setTitle4(BadWordsAds.filterText(a.getTitle4()));
	a.setDescription4(BadWordsAds.filterText(a.getDescription4()));
	return adsInterface.save(a);
}
	

@Override
public void deleteAds(@PathVariable(name="id") Long id) {
	adsInterface.deleteById(id);	
}

@Override
public Ads retrieveById(@PathVariable(name="id") Long id) {
	Ads ads=adsInterface.findById(id).get();
	if(ads!=null)
		return ads;
	return null;
}
//@Scheduled(cron = "0 0 */9 * * *")
/* public void deleteNotSubscriberAds() {
	 List<Ads> ads =ads.forEach(entity->adsInterface.delete(entity));
 }*/

@Override
public Long countAds() {
    return adsInterface.count();

}

@Override
public int findAdsByCategory(Category category) {
	 List<Ads>listAdsByCategory =  adsInterface.findAdsByCategory(category);
	 int countAdsByCategory =  listAdsByCategory.size();
	return countAdsByCategory;
}


@Override
public int findAdsByTransaction(Transaction transaction) {
	 List<Ads>listAdsByTransaction =  adsInterface.findAdsByTransaction(transaction);
	 int countAdsByTransaction =  listAdsByTransaction.size();
	return countAdsByTransaction;
}




}

