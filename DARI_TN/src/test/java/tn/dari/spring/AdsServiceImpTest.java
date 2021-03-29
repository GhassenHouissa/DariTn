package tn.dari.spring;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Location;
import tn.dari.spring.service.Ads_service;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdsServiceImpTest {
	private static final Logger L = LogManager.getLogger(AdsServiceImpTest.class);
	@Autowired
	Ads_service x1;
	@Test
	public void save() {
		Ads a= new Ads();
		a.setTitle4("Maison1");
		a.setLocation4(Location.Region);
		a=x1.addAds(a);
		
	} 
	
	
	
	
	
	
}
