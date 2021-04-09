package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Search;
import tn.dari.spring.repository.Ads_interface;
import tn.dari.spring.repository.SearchRepository;

@RestController
public class AdsRestController {
	
	@Autowired
	Ads_interface adsInterface;
	
	@Autowired
	SearchRepository repop;
	
	@Autowired
	Ads_interface repo;
	
	//*********************************************
	//   http://localhost:8082/DARITN/servlet/lis/{area}
	
@GetMapping("lis/{area}")

    public List<Ads> searchbyArea(@PathVariable(name="area") String area){
		/*Search search = new Search(area) ;
		repop.save(search);*/
		return repo.findAdsByArea(area) ;
}

//http://localhost:8082/DARITN/servlet/loc/{location}
	
	@GetMapping("loc/{location}")
	 public List<Ads> searchbyLocationOrComposition(@PathVariable(name="location") String location,String composition){
			/*Search search = new Search(location) ;
			repop.save(search);*/
			return repo.findUserByLocationOrComposition(location, composition) ;
	 }


}
