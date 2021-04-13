package tn.dari.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Claim;
import tn.dari.spring.entity.Notification;
import tn.dari.spring.repository.NotificationRepository;


@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	
	@Override
	public List<Notification> retrieveAllNotification(){
		List<Notification> notification = (List<Notification>) notificationRepository.findAll();
		return notification;
	}

	@Override
	public Notification addNotification(Notification n) {
		Notification notification =notificationRepository.save(n);
		return notification; 
	}
	

	@Override
	public void deleteNotification(Long id) {
		notificationRepository.deleteById(id);
	}
	
	@Override
	public Notification retrievenotificationbyId(Long id) {
		Optional<Notification> notification=notificationRepository.findById(id);
		if (notification != null ) {
			return notification.get();
		}
		return null;
		
	}

	@Override
	public Notification retrieveNotification(Long id) {
		// TODO Auto-generated method stub
		return notificationRepository.findById(id).get();
	}
	
	public long countNotification() {
		return notificationRepository.count();		
	}
	
	@Override
	public Notification retrieveNotifByDescription(String DescNotif) {
		Notification notification = notificationRepository.findNotifByDescription(DescNotif);
		return notification;
	}
}