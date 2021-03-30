package tn.dari.spring.servicetest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}

