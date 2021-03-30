package tn.dari.spring.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Comment;
import tn.dari.spring.entity.Search;
import tn.dari.spring.repository.SearchRepository;
import tn.dari.spring.servicetest.SearchServiceImplTest;

@Service
public class SearchServiceImpl implements ISearchService {
	
	
    
	@Autowired
	SearchRepository sr;
	@Override
	public void addSearch(Search s) {
		sr.save(s);
		
	}
	@Override
	public boolean deleteSearch(long id) {
		
		if(sr.existsById(id)){
			sr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}
	@Override
	public Search updateSearch(Search s) {
		
		
		Search  exist =sr.findById(s.getId()).orElse(null);
		
		sr.findById(s.getId());
		
		exist.setType(s.getType());   
		exist.setLocation(s.getLocation());
		exist.setPrice(s.getPrice());
	  
	
		return sr.save(exist) ;  
	}

}
