package tn.dari.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.User;
import tn.dari.spring.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	

	
 public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	        User user = userRepository.findUserByLoginOrEmail(userName);
	        
	        if (user == null) {
	            System.out.println("User not found! " + userName);
	            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
	        }
	 
	        System.out.println("Found User: " + user);
	 
	        
	        List<String> roleNames = new ArrayList<>() ;
	 
	        roleNames.add(user.getRole().toString());
	        
	        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
	        if (roleNames != null) {
	            for (String role : roleNames) {
	               
	                GrantedAuthority authority = new SimpleGrantedAuthority(role);
	                grantList.add(authority);
	            }
	        }
	        
	        UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(user.getLogin(),
	        		user.getPassword(), grantList);
	        return userDetails;
	 }
}
