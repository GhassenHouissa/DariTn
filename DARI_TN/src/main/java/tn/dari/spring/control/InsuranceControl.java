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

public  class InsuranceControl {

	@Autowired
	InsuranceService is;

//
//	@GetMapping("/retrieve-all-insurances")	
//	@ResponseBody
//	public List<Insurance> getInsurance(){
//		List<Insurance> list = is.retrieveInsurances() ;
//		return list; 
//	}
	
	//  http://localhost:8081/SpringMVC/servlet/add-insurance
	@PostMapping("/add-insurance")
	@ResponseBody
	public Insurance addInsurance(@RequestBody Insurance insurance) {
		Insurance i = is.addInsurance(insurance);
	return i;
	}

	 
//	@GetMapping("/retrieve-insurance/{Insurance_ID}")
//	@ResponseBody
//	public Insurance retrieveInsuranceById (@PathVariable("Insurance_ID") Long id) {
//		return is.retrieveUserById(id);
//	}
	
	
	
//	@GetMapping("/retrieve-all-insurance")
//	@ResponseBody
//	public Insurance retrieveInsurance(@PathVariable("Insurance_ID") Long id) {
//		return is.retrieveInsuranceById(id);
//	}
	
	@GetMapping("/Show-All-Insurance")
	@ResponseBody 
	public List<Insurance> RetrieveAllById(){
		return is.retrieveInsurances();
	}
	
   // http://localhost:8081/SpringMVC/servlet/remove-Insurance/5
	@DeleteMapping("/remove-Insurance/{Insurance_ID}")
	@ResponseBody
	public void removeInsurance(@PathVariable("Insurance_ID") Long id) {
	is.deleteInsurance(id);
	}
	
	@PutMapping("/update-Insurance/{Insurance_ID}")
	@ResponseBody
	   public Insurance updateInsurance(@RequestBody Insurance insurance) {
		return is.updateInsurance(insurance);
		}

}