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
import tn.dari.spring.service.SubscriptionServiceImp;

@RestController

public class SubscriptionControl {



	@Autowired
	SubscriptionServiceImp ss;
	
	
	@PostMapping("/add-subscription")
	@ResponseBody
	public Subscription addSubscription(@RequestBody Subscription subscription) {
	Subscription s = ss.addSubscription(subscription);
	return s;
	}
	
	@DeleteMapping("/remove-subscription/{Subscription_ID}")
	@ResponseBody
	public void removesubscription(@PathVariable("Subscription_ID") Long id) {
	ss.deleteSubscription(id);
	}
	

	
	@PutMapping("/update-Subscription/{Subscription_ID}")
	@ResponseBody
	public Subscription updateSubscription(@RequestBody Subscription subscription) {
		return ss.updateSubscription(subscription);
	
	
	}
	
	@GetMapping("/Show-All-Subscription")
	@ResponseBody 
	public List<Subscription> RetrieveAllById(){
		return ss.retrieveSubscriptions();
	}

}
	


