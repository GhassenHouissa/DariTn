package tn.dari.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
	
		user = new User();
		user.setFirstName("GUEBLI");
		user.setLastName("Mohamed");
		user.setEmail("mohamed.guebli1@esprit.tn");
		user.setRole(Role.Admin);
		user.setLogin("guebli_M");
		user.setPassword("azerty12");
		user = u.addUser(user);
		System.out.println("NEW User ="+ user.getId());

 	user = new User();
	user.setFirstName("AYARI");
	user.setLastName("Achraf");
	user.setEmail("achraf.ayari@esprit.tn");
	user.setRole(Role.Admin);
	user.setLogin("achraf_A");
	user.setPassword("achraf");
	user = u.addUser(user);
	System.out.println("NEW User ="+ user.getId());
    }
	
	@Test
	public void delete() {
		User user = new User();
		Long id = 3L;
		u.deleteUser(id);
		
	}
	@Test
	public void findUserbyid() {
		List<User> user=new ArrayList<>();
		Long id =1L;
		user = u.retrieveUserById(id);
		System.out.println(user);
		
	}
	@Test
	public void findUser() {
		User user = u.retrieveUserByLogin("gaston");
		assertEquals("gaston", user.getLogin());
	}
	

}
