package tn.dari.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Comment;
import tn.dari.spring.repository.CommentRepository;

@Service
public class CommentServiceImpl implements ICommentService{

	@Autowired
	CommentRepository cr;
	@Override
	public void addComment(Comment c) {
		cr.save(c);
		
	}

	@Override
	public boolean deleteComment(long id) {
		if(cr.existsById(id)){
			cr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public Comment updateComment(Comment c) {
			
			Comment exist =cr.findById(c.getId()).orElse(null);
			
			cr.findById(c.getId());
			
			exist.setDescription(c.getDescription());     
		  
		
			return cr.save(exist) ;    
		
		}

}
