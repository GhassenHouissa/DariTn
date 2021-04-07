package tn.dari.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.User;
import tn.dari.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public List<User> retrieveAllUsers() {
		List<User> useres = (List<User>) userRepository.findAll();
		return useres;
	}

	@Override
	public User addUser(User u) {
		u.setPassword(new BCryptPasswordEncoder().encode(u.getPassword()));
		User user =userRepository.save(u);
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User updateUser(User u) {
		User user=userRepository.save(u);
		return user;
	}

	@Override
	public User retrieveUser(Long id) {
		Optional<User> user=userRepository.findById(id);
		if (user != null ) {
			return user.get();
		}
		return null;
		
	}
	@Override
	public User retrieveUserByLogin(String login) {
		User user = userRepository.findUserByLogin(login);
		return user;
	}
	
	@Override
	public List<User> retrieveUserById(Long id) {
		List<User> users = userRepository.findUserByID(id);
		return users;
	}
	 	@Override
	public User retrieveUserByEmail(String email) {
		User user = userRepository.findUserByemail(email);
		return user;
	}
	
}
