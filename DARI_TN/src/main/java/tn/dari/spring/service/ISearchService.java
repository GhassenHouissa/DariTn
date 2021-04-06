package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Search;

public interface ISearchService {
	
	Search addSearch(Search s);
	boolean deleteSearch(long id);
	Search updateSearch(Search s);
	List<Search> retrieveAllSearch();
	Search retrieveSearch(Long id);
	

}
