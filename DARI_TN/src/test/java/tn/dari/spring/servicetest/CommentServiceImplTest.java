package tn.dari.spring.servicetest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Comment;
import tn.dari.spring.repository.CommentRepository;
import tn.dari.spring.service.ICommentService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(CommentServiceImplTest.class);
	
	@Autowired
	ICommentService cs;
	
	@Autowired
	CommentRepository cr;
	
	@Test
	public void addCommentTest(){
		Comment c = new Comment("est il encore disponible ???");
		cs.addComment(c);
		
	}
	
	@Test
	public void deleteCommentTest(){
		l.info("comment deleted: "+ cs.deleteComment(8));
		 
		
	}
	
	@Test 
	public void testupdateComment(){                        
	Comment c = cr.findById((long) 3).get(); 
	c.setDescription("je suis intéressé!");
	cs.addComment(c);
		
	}

}
