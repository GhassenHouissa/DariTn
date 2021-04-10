package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Subscription;

public interface  SubscriptionService {

	Subscription addSubscription(Subscription s);

	boolean deleteSubscription(long id);

	Subscription updateSubscription(Subscription s);

	List<Subscription> retrieveAllSubscriptiont();

	Subscription retrieveSubscription(Long id);

	
	

}
