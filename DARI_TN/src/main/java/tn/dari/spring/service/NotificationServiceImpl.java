package tn.dari.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import tn.dari.spring.repository.NotificationRepository;

public class NotificationServiceImpl  implements INotificationService {
	
	@Autowired
	NotificationRepository nr;

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

}
