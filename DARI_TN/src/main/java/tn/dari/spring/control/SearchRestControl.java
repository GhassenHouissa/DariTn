package tn.dari.spring.control;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Search;
import tn.dari.spring.service.ISearchService;

@RestController
public class SearchRestControl {

	@Autowired
	ISearchService searchService;
	
	//*******************add*********************************************************
	// http://localhost:8082/DARITN/servlet/add-Search
			@PostMapping("add-Search")
			@ResponseBody
			public Search addSearch(@RequestBody Search s) {
				Search search = searchService.addSearch(s);     
			return search;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/DARI_TN/servlet/remove-search/{search-id}
			@DeleteMapping("/remove-search/{search-id}")
			@ResponseBody
			public void removeSearch(@PathVariable("search-id") long searchId) {
				searchService.deleteSearch(searchId);       
			}
			
//********************************update*****************************************
			
			// http://localhost:8082/DARITN/servlet/modify-search
			@PutMapping("/modify-search")
			@ResponseBody
			public Search modifySearch(@RequestBody Search search) {
			return searchService.updateSearch(search);     
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/DARITN/servlet/retrieve-all-search
			@GetMapping("/retrieve-all-search")
			@ResponseBody
			public List<Search> getSearch() {
			List<Search> list = searchService.retrieveAllSearch();            
			return list;
			}

//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/DARITN/servlet/retrieve-search/{search-id}
			@GetMapping("/retrieve-search/{search-id}")
			@ResponseBody
			public Search retrieveSearch(@PathVariable("search-id") Long id) {
			return searchService.retrieveSearch(id);           
			}
			
			
			
}
