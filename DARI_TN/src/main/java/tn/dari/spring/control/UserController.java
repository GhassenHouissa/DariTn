package tn.dari.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Search;
import tn.dari.spring.entity.User;
import tn.dari.spring.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService us;
	
	
	//http://localhost:8082/DARITN/servlet/retrieve-user/{user-id}
			/////get user by id/////
			@GetMapping("/retrieve-user/{user-id}")
			@ResponseBody
			public User findbyid(@PathVariable("user-id") long userId) {
			return us.findbyid(userId);
			}
			
			
			
			//*******************add*********************************************************
			// http://localhost:8082/DARITN/servlet/add-User
					@PostMapping("add-User")
					@ResponseBody
					public User addSearch(@RequestBody User s) {
						User user = us.addUser(s);     
					return user;
					}

}
