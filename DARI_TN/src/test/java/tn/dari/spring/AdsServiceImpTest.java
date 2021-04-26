package tn.dari.spring;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.service.AdsService;
import tn.dari.spring.utility.BadWordsException;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdsServiceImpTest {
	private static final Logger L = LogManager.getLogger(AdsServiceImpTest.class);
	@Autowired
	AdsService x1;
	@Test
	public void save() throws BadWordsException {
		Ads a= new Ads();
		a.setTitle4("Maison1");
	//	a=x1.addAds(a);
		
	} 
	
	
	
	
	
	
}
