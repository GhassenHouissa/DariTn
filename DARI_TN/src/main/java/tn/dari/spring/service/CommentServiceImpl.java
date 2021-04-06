package tn.dari.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Comment;
import tn.dari.spring.repository.CommentRepository;

@Service
public class CommentServiceImpl implements ICommentService{

	@Autowired
	CommentRepository cr;
	
	private static final Logger l = LogManager.getLogger(CommentServiceImpl.class);
	
	@Override
	public Comment addComment(Comment c) {
		return cr.save(c);
		
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
	return cr.save(c);
		}
	

	@Override
	public List<Comment> retrieveAllComment() {
		List<Comment> comment = (List<Comment>) cr.findAll();
		for(Comment comments : comment){
			l.info("comments:" + comments);
		}
		return comment;
	}

	@Override
	public Comment retrieveComment(Long id) {
		return cr.findById(id).get();
	}


}
