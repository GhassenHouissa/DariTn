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

import tn.dari.spring.entity.Subscription;
import tn.dari.spring.service.SubscriptionService;

@RestController
public class SubscriptionRestControl {
	
	@Autowired
	SubscriptionService ss;
	
	
	
//*****************************************add***************************************
	// http://localhost:8081/DARITN/servlet/add-Subscription     
	            @PostMapping("/add-Subscription")
	            @ResponseBody
				public Subscription addSubscription(@RequestBody Subscription s) {
					Subscription subscription = ss.addSubscription(s);     
				return subscription;
				}
	            
	            
	          
				
	
	
//*************************************************delete************************************
	// http://localhost:8081/DARITN/servlet/remove-subscription/{Subscription_ID}
				@DeleteMapping("/remove-subscription/{Subscription_ID}")
				@ResponseBody
				public void removeSubscription(@PathVariable("Subscription_ID") long id) {
					ss.deleteSubscription(id);         
				}
				
				
//**************************************************update*********************************		
				
      // http://localhost:8081/DARITN/servlet/modify-subscription
				@PutMapping("/modify-subscription")
				@ResponseBody
				public Subscription modifySubscription(@RequestBody Subscription subscription) {
				return ss.updateSubscription(subscription);         
				}
				
//***************************************retrieveAll***********************************
				
				// http://localhost:8081/DARITN/servlet/retrieve-all-subscription
				@GetMapping("/retrieve-all-subscription")
				@ResponseBody
				public List<Subscription> getSubscription() {
				List<Subscription> list = ss.retrieveAllSubscriptiont();           
				return list;
				}
	
//***********************************************retrievebyid**************************************				
				
				
				//http://localhost:8081/DARITN/servlet/retrieve-subscription/{Subscription_ID}
				@GetMapping("/retrieve-subscription/{Subscription_ID}")
				@ResponseBody
				public Subscription retrieveSubscription(@PathVariable("Subscription_ID") Long id) {
				return ss.retrieveSubscription(id);            
				}
	
}
