package tn.dari.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Role;
import tn.dari.spring.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User ,Long>  {

	@Query("FROM User u WHERE u.login = :login or u.email = :login")
	User findUserByLoginOrEmail(@Param(value = "login") String login);
	
	@Query("FROM User u WHERE u.id = :id")
	List<User> findUserByID(@Param(value = "id") Long id);

	@Query("FROM User u WHERE u.email = :email")
	User findUserByemail(@Param(value = "email") String email);


	@Query("FROM User u WHERE u.role = :role")
	 List<User> findUserByRole(@Param(value = "role") Role role);
	
}

