package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Comment;

public interface ICommentService {
	
	Comment updateComment(Comment c);
	List<Comment> retrieveAllComment();
	Comment retrieveComment(Long id);
	
	
	 String addComment(Comment com,long user_id,long ads_id) ;
	boolean deleteComment(long id, long userId);

}
