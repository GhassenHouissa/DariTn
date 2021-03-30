package tn.dari.spring.service;

import tn.dari.spring.entity.Comment;

public interface ICommentService {
	
	void addComment(Comment c);
	boolean deleteComment(long id);
	Comment updateComment(Comment c);
	

}
