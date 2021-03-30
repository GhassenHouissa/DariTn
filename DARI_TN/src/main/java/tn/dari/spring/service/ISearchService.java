package tn.dari.spring.service;

import tn.dari.spring.entity.Comment;
import tn.dari.spring.entity.Search;

public interface ISearchService {
	
	void addSearch(Search s);
	boolean deleteSearch(long id);
	Search updateSearch(Search s);

}
