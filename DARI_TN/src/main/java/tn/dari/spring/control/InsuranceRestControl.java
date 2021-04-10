package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Insurance;
import tn.dari.spring.service.InsuranceService;

@RestController
public class InsuranceRestControl {
	
	@Autowired
	InsuranceService is;
	
	
	
//*****************************************add***************************************
	// http://localhost:8081/DARITN/servlet/add-Insurance     
	            @PostMapping("/add-Insurance")
	            @ResponseBody
				public Insurance addInsurance(@RequestBody Insurance i) {
					Insurance insurance= is.addInsurance(i);     
				return insurance;
				}
	            
	            
	          
				
	
	
//*************************************************delete************************************
	// http://localhost:8081/DARITN/servlet/remove-insurance/{Insurance_ID}
				@DeleteMapping("/remove-insurance/{Insurance_ID}")
				@ResponseBody
				public void removeInsurance(@PathVariable("Insurance_ID") long id) {
					is.deleteInsurance(id);         
				}
				
				
//**************************************************update*********************************		
				
      // http://localhost:8081/DARITN/servlet/modify-insurance
				@PutMapping("/modify-insurance")
				@ResponseBody
				public Insurance modifyInsurance(@RequestBody Insurance insurance){
				return is.updateInsurance(insurance);         
				}
				
//***************************************retrieveAll***********************************
				
				// http://localhost:8081/DARITN/servlet/retrieve-all-insurance
				@GetMapping("/retrieve-all-insurance")
				@ResponseBody
				public List<Insurance> getInsurance() {
				List<Insurance> list = is.retrieveAllInsurance();           
				return list;
				}
	
//***********************************************retrievebyid**************************************				
				
				
				//http://localhost:8081/DARITN/servlet/retrieve-insurance/{Insurance_ID}
				@GetMapping("/retrieve-insurance/{Insurance_ID}")
				@ResponseBody
				public Insurance retrieveInsurance(@PathVariable("Insurance_ID") Long id) {
				return is.retrieveInsurance(id);            
				}
	
}
