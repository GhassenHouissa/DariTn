package tn.dari.spring.service;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Search;
import tn.dari.spring.entity.User;
import tn.dari.spring.repository.SearchRepository;


@Service
public class SearchServiceImpl implements ISearchService {
	
	
    
	@Autowired
	SearchRepository sr;
	
	private static final Logger l = LogManager.getLogger(SearchServiceImpl.class);
	
	@Override
	public Search addSearch(Search s) {
		return sr.save(s);
		
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
	@Override
	public List<Search> retrieveAllSearch() {
		List<Search> search = (List<Search>) sr.findAll();
		for(Search searchs : search){
			l.info("searchs:" + searchs);
		}
		return search;
	}
	@Override
	public Search retrieveSearch(Long id) {
		return sr.findById(id).get();
	}
	
	
	
	//**********************************************************nouvelle méthode********************************
	@Override
	public Search addSearch1(Search rech, User u) {
		//le type introduit :
				String t = rech.getType();
				//la recherche sur ce type :
				Search r = sr.findByTypeAndUser(t, u);
				
				Long a = 1L;
				///si la recherche sur ce type n'existe pas : 
				if(r==null) {
					
					rech.setUser(u);
					rech.setNbr(a);
					sr.save(rech);
				}
				else {
					
					//get nbr from recherche et incrémenter nbr 
					Long count = r.getNbr()+a;
					
					//modifier le recherche et enregistrer
					r.setNbr(count);
					rech=r;
					sr.save(rech);
				}
			return rech;
					
				}

	}


