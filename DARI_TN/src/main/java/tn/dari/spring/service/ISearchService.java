package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Search;
import tn.dari.spring.entity.User;


public interface ISearchService {
	
	boolean deleteSearch(long id);
	Search updateSearch(Search s);
	List<Search> retrieveAllSearch();
	Search retrieveSearch(Long id);
	
	
	Search addSearch1(Search rech,User u);
	String addSearch(Search sear, long user_id);
	

}
