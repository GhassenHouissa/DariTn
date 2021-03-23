package tn.dari.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Role;

import tn.dari.spring.entity.User;
import tn.dari.spring.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
	
	private static final Logger L = LogManager.getLogger(UserServiceImplTest.class);
	
	@Autowired
	UserService u;
	
	@Test
	public void save() {
		User user = new User();
		user.setFirstName("HOUISSA");
		user.setLastName("Ghassen");
		user.setEmail("ghassen.houissa1@esprit.tn");
		user.setRole(Role.Admin);
		user.setLogin("gaston");
		user.setPassword("azerty");
		user = u.addUser(user);
		System.out.println("NEW User ="+ user.getId());
	}
	
	@Test
	public void findUser() {
		User user = u.retrieveUserByLogin("gaston");
		assertEquals("gaston", user.getLogin());
	}
	

}
