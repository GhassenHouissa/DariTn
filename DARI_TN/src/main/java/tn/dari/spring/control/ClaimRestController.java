package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Claim;
import tn.dari.spring.service.ClaimService;

@RestController
public class ClaimRestController {

		@Autowired
		ClaimService claimService;
		
		//http://localhost:9090/SpringMVC/servlet/retrieve-all-claims
		@GetMapping("/retrieve-all-claims")	
		@ResponseBody
		public List<Claim> getUsers(){
			List<Claim> list = claimService.retrieveAllClaims() ;
			return list;
		}
		
		//http://localhost:9090/SpringMVC/servlet/retrieveClaim/1
		@GetMapping("/retrieveClaim/{claim-id}")
		@ResponseBody
		public Claim retrieveClaim(@PathVariable("claim-id") Long claimId) {
			return claimService.retrieveclaimbyId(claimId);
		}
		 
		//http://localhost:9090/SpringMVC/servlet/add-claim
		@PostMapping("/add-claim")
		@ResponseBody
		public Claim addClaim (@RequestBody Claim c) {
			Claim claim = claimService.addClaim(c);
			return claim;
		}
		
		//http://localhost:9090/SpringMVC/servlet/remove-claim/4
		@DeleteMapping("/remove-claim/{claim-id}")
		@ResponseBody
		public void removeClaim(@PathVariable("claim-id") Long claimId) {
			claimService.deleteClaim(claimId);
		}
		
		//http://localhost:9090/SpringMVC/servlet/numberOfClaims
		@GetMapping("/numberOfClaims")
	    @ResponseBody
	    public Long countClaim() {
	    	Long countClaim= claimService.countClaim() ;
	    	return countClaim;
	    }
		
		//http://localhost:9090/SpringMVC/servlet/retrieveClaimByDescription/new ad
		@GetMapping("/retrieveClaimByDescription/{description_claim}")
		@ResponseBody
		public Claim retrieveClaimByDescription (@PathVariable("description_claim") String description_claim) {
			return claimService.retrieveClaimByDescription(description_claim);
	}
}