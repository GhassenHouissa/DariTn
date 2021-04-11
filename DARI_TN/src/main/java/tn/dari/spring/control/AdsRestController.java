package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Search;
import tn.dari.spring.repository.Ads_interface;
import tn.dari.spring.repository.SearchRepository;
import tn.dari.spring.service.Ads_service;

@RestController
public class AdsRestController {
	
	@Autowired
	Ads_interface adsInterface;
	
	@Autowired
	Ads_service as;
	
	@Autowired
	SearchRepository repop;
	
	@Autowired
	Ads_interface repo;
	
	
	
	
	
	//http://localhost:8082/DARITN/servlet/show-all-ads
		@GetMapping("/show-all-ads")
		@ResponseBody
		public List<Ads> getAllAds(){
			List <Ads> list= as.showAll(); 
			return list;
		}
	
	//*********************************************
	//   http://localhost:8082/DARITN/servlet/lis/{area}
	
@GetMapping("lis/{area}")

    public List<Ads> searchbyArea(@PathVariable(name="area") String area){
		/*Search search = new Search(area) ;
		repop.save(search);*/
		return repo.findAdsByArea(area) ;
}

//http://localhost:8082/DARITN/servlet/con/{content}

@GetMapping("con/{content}")
public List<Ads> searchbyContent(@PathVariable(name="content") String content){
	/*Search search = new Search(content) ;
	repop.save(search);*/
	return repo.findAdsByContent(content) ;
}





//http://localhost:8082/DARITN/servlet/loc/{location}
	
	@GetMapping("loc/{location}")
	 public List<Ads> searchbyLocationOrPrice(@PathVariable(name="location") String location, String composition){
			Search search = new Search(location) ;
			repop.save(search);
			return repo.findAdsByLocationOrComposition(location, composition) ;
	 }
	
	
/*@GetMapping("AddsForclient/{id}")
	
    public List<Ads> searchbyLocationOrComposition(@PathVariable long id  ){
	  
		
		return adsInterface.lespubquiaffichepourceclient(id); 
}*/
	
	
	
	//http://localhost:8082/DARITN/servlet/reduction/{reduction}
	
		@GetMapping("reduction/{reduction}")
		 public List<Ads> alertebyReduction(@PathVariable(name="reduction") Boolean reduction){
				
				return repo.findAdsByReduction(reduction) ;
		 }
		
		
		//http://localhost:8082/DARITN/servlet/augmentation/{augmentation}	
		
		@GetMapping("augmentation/{augmentation}")
		 public List<Ads> alertebyAugmentation(@PathVariable(name="augmentation") Boolean augmentation){
				
				return repo.findAdsByAugmentation(augmentation) ;
		 }
		


}
