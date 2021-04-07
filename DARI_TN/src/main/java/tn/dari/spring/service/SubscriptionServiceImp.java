package tn.dari.spring.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;


import tn.dari.spring.entity.Subscription;
import tn.dari.spring.repository.SubscriptionRepository;


public class SubscriptionServiceImp implements SubscriptionService {
	
	 @Autowired
    SubscriptionRepository sr;
	 
		@Override
		public List<Subscription> retrieveAllSubscriptions() {
			List<Subscription> subscriptions = (List<Subscription>) sr.findAll();
			return subscriptions;
		}

	 @Override
		public Subscription addSubscription(Subscription s) {
			
			return sr.save(s);
		}
		@Override
		public void deleteSubscription(Long id) {
			  sr.deleteById(id);
		}

		
		@Override
		public Subscription updateSubscription(Subscription subscription ) {
			
			return 	sr.save(subscription);
		}

		
		@Override
		public List<Subscription> retrieveSubscriptions() {
			List<Subscription> subscriptions =(List<Subscription>) sr.findAll();
		return subscriptions;
		}
		
	

		public List<Subscription> listAll() {
			// TODO Auto-generated method stub
			return null;
		}

	


	
		
	
	} 

