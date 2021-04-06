package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Notification;

public interface INotificationService {
	
	boolean deleteNotification(long id);
	List<Notification> retrieveAllNotifications();
	Notification addNotification(Notification n);
	Notification retrieveNotification(long id);
	Notification updateNotification( Notification n);

}
