package tn.dari.spring.controller;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.repository.AdsRepository;
import tn.dari.spring.service.AdsService;
import tn.dari.spring.service.AdsServiceImp;
@RestController
public class AdsController implements AdsService {
	@Autowired
	AdsServiceImp adsServiceImp;
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
/*	@PostMapping()
public void uploadFile(@RequestParam ("file") MultipartFile file) throws IllegalStateException, IOException {
		
		adsServiceImp.uploadFile(file);
}*/
/*	@GetMapping(value="/mediaAds/{id}",produces=MediaType.IMAGE_PNG_VALUE)
	public byte[] getMedia(@PathVariable("id") Long id) throws Exception {
		Ads a = adsInterface.findById(id).get();
		return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/mediaAds/products"+a.getMedia()));

	}
		//@RestResource(path="/photo")
	@PostMapping(path="/mediaAds/{id}")
	public void uploadPhoto(MultipartFile file, @PathVariable Long id) throws Exception {
	Ads a = adsInterface.findById(id).get();
	a.setMedia(id+".png");
	Files.write(Paths.get(System.getProperty("user.home")+"/mediaAds/products"+a.getMedia()),file.getBytes());
	adsInterface.save(a);
	}*/
	
	
	
	
	
	
}
