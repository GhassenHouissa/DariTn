package tn.dari.spring.servicetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Notification;
import tn.dari.spring.service.INotificationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NotificationServiceImplTest {

	private static final Logger l = LogManager.getLogger(NotificationServiceImplTest.class);
	
	@Autowired
	INotificationService ns ;
	
	@Test
	public void deleteNotificationTest(){
		l.info("notification deleted: "+ ns.deleteNotification(2));
		 
		
	}
	
	@Test
	public void addNotificationTest() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-01-7");
		Notification n = new Notification(date);
		ns.addNotification(n);
	}
	
	@Test
	public void testRetrieveAllNotifications(){
		ns.retrieveAllNotifications();;
	}
}

