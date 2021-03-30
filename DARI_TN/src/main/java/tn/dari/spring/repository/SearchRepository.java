package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import tn.dari.spring.entity.Search;

@Repository
public interface SearchRepository extends CrudRepository<Search,Long> {

	
	
}
