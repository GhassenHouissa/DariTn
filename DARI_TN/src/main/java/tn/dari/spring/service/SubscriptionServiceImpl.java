package tn.dari.spring.service;

import java.util.List;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Subscription;
import tn.dari.spring.repository.SubscriptionRepository;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{

	@Autowired
	SubscriptionRepository sr;
	
	//private static final Logger l = LogManager.getLogger(CommentServiceImpl.class);
	
	@Override
	public Subscription addSubscription(Subscription s) {
		return sr.save(s);
		
	}

	@Override
	public boolean deleteSubscription(long id) {
		if(sr.existsById(id)){
			sr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}
	

	@Override
	public Subscription updateSubscription(Subscription s) {
	return sr.save(s);
		}
	

//	@Override
//	public List<Subscription> retrieveAllSubscriptiont() {
//		List<Subscription> subscription = (List<Subscription>) sr.findAll();
//		for(Subscription subscriptions: subscription){
//			l.info("subscriptions:" + subscriptions);
//		}
//		return subscription;
//	}

	@Override
	public Subscription retrieveSubscription(Long id) {
		return sr.findById(id).get();
	}

	@Override
	public List<Subscription> retrieveAllSubscriptiont() {
		// TODO Auto-generated method stub
		return null;
	}


}
