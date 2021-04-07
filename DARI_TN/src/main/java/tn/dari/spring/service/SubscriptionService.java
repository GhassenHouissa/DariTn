package tn.dari.spring.service;

import java.util.List;


import tn.dari.spring.entity.Subscription;

public interface  SubscriptionService {


	public Subscription addSubscription(Subscription s);
	public List<Subscription> retrieveSubscriptions();
	public void deleteSubscription(Long id);
	List<Subscription> retrieveAllSubscriptions();
	Subscription updateSubscription(Subscription subscription);
	
	

}
