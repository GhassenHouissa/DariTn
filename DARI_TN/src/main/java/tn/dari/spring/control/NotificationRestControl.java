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

import tn.dari.spring.entity.Notification;
import tn.dari.spring.service.INotificationService;


@RestController
public class NotificationRestControl {
	
	@Autowired
	INotificationService notificationService ;
	
	
	//*******************add****************************************************************
		// http://localhost:8082/DARI_TN/servlet/add-Notification
				@PostMapping("add-Notification")
				@ResponseBody
				public Notification addNotification(@RequestBody Notification n) {
					Notification notification = notificationService.addNotification(n);       
				return notification;
				}
				
	
	//**************************delete******************************************************
	
	// http://localhost:8082/DARI_TN/servlet/remove-notification/{notification-id}
				@DeleteMapping("/remove-notification/{notification-id}")
				@ResponseBody
				public void removeNotification(@PathVariable("notification-id") long notificationId) {
					notificationService.deleteNotification(notificationId);            
				}
				
				
	//***************************************retrieveAll**************************************
				
				// http://localhost:8082/DARI_TN/servlet/retrieve-all-notifications
				@GetMapping("/retrieve-all-notifications")
				@ResponseBody
				public List<Notification> getNotifications() {
				List<Notification> list = notificationService.retrieveAllNotifications();     
				return list;
				}
				
				
 //********************************update*****************************************
				
				// http://localhost:8082/DARI_TN/servlet/modify-notifications
				@PutMapping("/modify-notifications")
				@ResponseBody
				public Notification modifyNotifications(@RequestBody Notification notifications) {
				return notificationService.updateNotification(notifications) ;          
				}
//***********************************************retrievebyid**************************************				
				
				
				//http://localhost:8082/DARITN/servlet/retrieve-notifications/{notifications-id}
				@GetMapping("/retrieve-notifications/{notifications-id}")
				@ResponseBody
				public Notification retrieveNotification(@PathVariable("notifications-id") Long id) {
				return notificationService.retrieveNotification(id);           
				}
}
