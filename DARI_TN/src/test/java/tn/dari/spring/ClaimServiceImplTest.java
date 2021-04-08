package tn.dari.spring;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Claim;
import tn.dari.spring.service.ClaimService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClaimServiceImplTest {
	
	private static final Logger L = LogManager.getLogger(ClaimServiceImplTest.class);

	@Autowired
	ClaimService c;
	
	@Test
	public void save(){
		Claim claim = new Claim();
		claim.setDescription_claim("hard to use this application");
		claim.setSubject_claim("bad application");
		claim = c.addClaim(claim);
		System.out.println("New Claim ="+claim.getId_claim());
	}
	
	@Test
	public void save2(){
		Claim claim = new Claim();
		claim.setDescription_claim("zhfjek,k,e");
		claim.setSubject_claim("klekkk");
		claim = c.addClaim(claim);
		System.out.println("New Claim ="+claim.getId_claim());
	}
	
	@Test
	public void delete() {
			Claim claim = new Claim();
		Long id = 2L;
		c.deleteClaim(id);
	}
	
	@Test
	public void findClaimbyid() {
		Claim claim=new Claim();
		Long id =1L;
		claim= c.retrieveclaimbyId(id);
		System.out.println(claim);
	}
}
