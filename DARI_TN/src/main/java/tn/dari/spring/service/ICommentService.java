package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Comment;

public interface ICommentService {
	
	Comment addComment(Comment c);
	boolean deleteComment(long id);
	Comment updateComment(Comment c);
	List<Comment> retrieveAllComment();
	Comment retrieveComment(Long id);
	

}
