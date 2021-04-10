package tn.dari.spring.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Search;
import tn.dari.spring.entity.User;




@Repository
public interface SearchRepository extends CrudRepository<Search,Long> {

	Search findByTypeAndUser(String t, User u);
	

	
	
}
