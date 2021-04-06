package tn.dari.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Notification;
import tn.dari.spring.repository.NotificationRepository;

@Service
public class NotificationServiceImpl  implements INotificationService {
	
	@Autowired
	NotificationRepository nr;
	
	private static final Logger l = LogManager.getLogger(NotificationServiceImpl.class);

	@Override
	public boolean deleteNotification(long id) {
		if(nr.existsById(id)){
			nr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public List<Notification> retrieveAllNotifications() {
		List<Notification> notifications = (List<Notification>) nr.findAll();
		for(Notification notification : notifications){
			l.info("notification :" + notification);
		}
		return notifications;
		
	}

	@Override
	public Notification addNotification(Notification n) {
		return nr.save(n);
	}

	@Override
	public Notification retrieveNotification(long id) {
		return nr.findById(id).get();
	}

	@Override
	public Notification updateNotification(Notification n) {
		Notification exist =nr.findById(n.getId()).orElse(null);
		
		nr.findById(n.getId());
		
		exist.setDate(n.getDate());   
	  
	
		return nr.save(exist) ; 
	}

}
