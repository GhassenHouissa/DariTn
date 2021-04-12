package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.EmailTemplate;
import tn.dari.spring.entity.Search;
import tn.dari.spring.repository.Ads_interface;
import tn.dari.spring.repository.SearchRepository;
import tn.dari.spring.service.Ads_service;
import tn.dari.spring.service.EmailService;

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
	
	@Autowired
	private EmailService emailService;
	
	EmailTemplate emailTemplate = new EmailTemplate("roua.mbarki1@esprit.tn","DARI.TN : Réduction des prix ", "BONJOUR , Consulter notre site daritn pour profiter des offres de réductions pour quelques annonces ");
	
	EmailTemplate emailTemplatee = new EmailTemplate("roua.mbarki1@esprit.tn","DARI.TN : Augmentation des prix", "BONJOUR , Consulter notre site daritn pour voir les changement des offres d'augmentation  pour quelques annonces ");
	
	
	
	
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
	 public List<Ads> searchbyLocationOrComposition(@PathVariable(name="location") String location, String composition){
			Search search = new Search(location) ;
			repop.save(search);
			return repo.findAdsByLocationOrComposition(location, composition) ;
	 }
	
	
	
	
	//http://localhost:8082/DARITN/servlet/AdsForclient/{idAds}
	
@GetMapping("AdsForclient/{idAds}")
	
    public List<Ads> searchbyLocationOrComposition(@PathVariable long idAds  ){
	  
		
		return adsInterface.lespubquiaffichepourceclient(idAds); 
}




	
	
	
	//http://localhost:8082/DARITN/servlet/reduction/{reduction}
	
		@GetMapping("reduction/{reduction}")
		 public List<Ads> alertebyReduction(@PathVariable(name="reduction") Boolean reduction){
				List<Ads> listAds=null ;
				listAds = repo.findAdsByReduction(reduction);
				try {
					//log.info("Sending Simple Text Email....");
					emailService.sendTextEmail(emailTemplate);
					
				} catch (Exception ex) {
					
				}
				return listAds ;
		 }
		
		
		//http://localhost:8082/DARITN/servlet/augmentation/{augmentation}	
		
		@GetMapping("augmentation/{augmentation}")
		 public List<Ads> alertebyAugmentation(@PathVariable(name="augmentation") Boolean augmentation){
			List<Ads> listAdss=null ;
			listAdss = repo.findAdsByAugmentation(augmentation);
			
			try {
				//log.info("Sending Simple Text Email....");
				emailService.sendTextEmail(emailTemplatee);
				
			} catch (Exception ex) {
				
			}
				
				return listAdss ;
		 }
		


}
