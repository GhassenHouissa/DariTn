package tn.dari.spring.servicetest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Comment;
import tn.dari.spring.entity.Search;
import tn.dari.spring.repository.CommentRepository;
import tn.dari.spring.repository.SearchRepository;
import tn.dari.spring.service.ISearchService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(SearchServiceImplTest.class);
	@Autowired
	ISearchService ss;
	
	@Autowired
	SearchRepository sr;
	
	
	@Test
	public void addSearchTest(){
		
		Search s = new Search("villa","tunis",(float) 130000000);
		ss.addSearch(s);
	}
	
	@Test
	public void deleteSearchTest(){
		l.info("search deleted: "+ ss.deleteSearch(2));
		 
		
	}
	
	
	@Test 
	public void testupdateSearch(){                        
		Search s = sr.findById((long) 5).get();
		s.setType("villa");
		s.setLocation("tunis");
		s.setPrice((float) 250000000);
        ss.addSearch(s);
		
	}

}
