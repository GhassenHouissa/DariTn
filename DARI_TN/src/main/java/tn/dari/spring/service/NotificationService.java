package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Claim;
import tn.dari.spring.entity.Notification;

public interface NotificationService {

	List<Notification> retrieveAllNotification();

	Notification addNotification(Notification n);

	void deleteNotification(Long id);

	Notification retrievenotificationbyId(Long id);

	Notification retrieveNotification(Long id);
	
	long countNotification();
	
	Notification retrieveNotifByDescription(String DescNotif);

}