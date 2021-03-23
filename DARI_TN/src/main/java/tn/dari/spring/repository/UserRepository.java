package tn.dari.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User ,Long>  {

	@Query("FROM User u WHERE u.login = :login")
	User findUserByLogin(@Param(value = "login") String login);
}
