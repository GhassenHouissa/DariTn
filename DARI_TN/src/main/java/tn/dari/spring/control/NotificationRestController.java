package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Notification;
import tn.dari.spring.service.NotificationService;

@RestController
public class NotificationRestController {

		@Autowired
		NotificationService notificationService;
		
		//http://localhost:9090/SpringMVC/servlet/retrieve-all-notification
		@GetMapping("/retrieve-all-notification")	
		@ResponseBody
		public List<Notification> getUsers(){
			List<Notification> list = notificationService.retrieveAllNotification() ;
			return list;
		}
		
		//http://localhost:9090/SpringMVC/servlet/retrieveNotification/1
		@GetMapping("/retrieveNotification/{notification-id}")
		@ResponseBody
		public Notification retrieveNotification(@PathVariable("notification-id") Long notificationId) {
			return notificationService.retrievenotificationbyId(notificationId);
		}
		 
		//http://localhost:9090/SpringMVC/servlet/add-notification
		@PostMapping("/add-notification")
		@ResponseBody
		public Notification addNotification (@RequestBody Notification n) {
			Notification notification = notificationService.addNotification(n);
			return notification;
		}
		
		//http://localhost:9090/SpringMVC/servlet/remove-notification/4
		@DeleteMapping("/remove-notification/{notification-id}")
		@ResponseBody
		public void removeNotification(@PathVariable("notification-id") Long notificationId) {
			notificationService.deleteNotification(notificationId);
		}
		
		//http://localhost:9090/SpringMVC/servlet/numberOfNotification
		@GetMapping("/numberOfNotification")
	    @ResponseBody
	    public Long countNotification() {
	    	Long countNotification= notificationService.countNotification() ;
	    	return countNotification;
	    }
		
		//http://localhost:9090/SpringMVC/servlet/retrieveNotificationByDescription/first ad
		@GetMapping("/retrieveNotificationByDescription/{DescNotif}")
		@ResponseBody
		public Notification retrieveNotifByDescription (@PathVariable("DescNotif") String DescNotif) {
			return notificationService.retrieveNotifByDescription(DescNotif);
	}
	}