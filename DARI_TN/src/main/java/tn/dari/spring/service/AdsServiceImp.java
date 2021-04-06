package tn.dari.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.repository.AdsRepository;
@Service
public class AdsServiceImp implements AdsService{
	@Autowired
	private	AdsRepository adsInterface;

@Override
public List<Ads> retrieveAll() {

	return (List<Ads>) adsInterface.findAll();
} 

@Override
public Ads addAds(@RequestBody Ads a) {
	return adsInterface.save(a);
}

@Override
public Ads updateAds(@PathVariable(name="id") Long id ,@RequestBody Ads a) {
	a.setId4(id);
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

/*@RequestMapping(path="/test")
public void uploadFile (MultipartFile file) throws IllegalStateException, IOException {
file.transferTo(new File("C:\\Users\\Lenevo\\mediaAds\\"+file.getOriginalFilename()));
}*/

}

