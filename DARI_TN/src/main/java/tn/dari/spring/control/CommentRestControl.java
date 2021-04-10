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

import tn.dari.spring.entity.Comment;
import tn.dari.spring.service.ICommentService;

@RestController
public class CommentRestControl {
	
	@Autowired
	ICommentService commentService;
	
	@Autowired
	UserController uc;
	
	
	
	private String mot;
	private long user_id;
	
	
	// http://localhost:8082/DARITN/servlet/addComment         
    @PostMapping("/addComment")
    @ResponseBody
    public void AddComment(@RequestBody long ads_id_ads) {
    Comment u = new Comment(mot);
    commentService.addComment(u,uc.findbyid(user_id).getId(),ads_id_ads);
	}
	
	
	
//*****************************************add***************************************
	// http://localhost:8082/DARITN/servlet/add-Comment         
	           /* @PostMapping("/add-Comment")
	            @ResponseBody
				public Comment addComment(@RequestBody Comment c) {
					Comment comment = commentService.addComment(c);     
				return comment;
				}*/
	            
	            
	          
				
	
	
//*************************************************delete************************************
	// http://localhost:8082/DARITN/servlet/remove-comment/{comment-id}
				@DeleteMapping("/remove-comment/{comment-id}")
				@ResponseBody
				public void removeComment(@PathVariable("comment-id") long commentId) {
					commentService.deleteComment(commentId);         
				}
				
				
//**************************************************update*********************************		
				
      // http://localhost:8082/DARITN/servlet/modify-comment
				@PutMapping("/modify-comment")
				@ResponseBody
				public Comment modifyComment(@RequestBody Comment comment) {
				return commentService.updateComment(comment);         
				}
				
//***************************************retrieveAll***********************************
				
				// http://localhost:8082/DARITN/servlet/retrieve-all-comment
				@GetMapping("/retrieve-all-comment")
				@ResponseBody
				public List<Comment> getComment() {
				List<Comment> list = commentService.retrieveAllComment();           
				return list;
				}
	
//***********************************************retrievebyid**************************************				
				
				
				//http://localhost:8082/DARITN/servlet/retrieve-comment/{comment-id}
				@GetMapping("/retrieve-comment/{comment-id}")
				@ResponseBody
				public Comment retrieveComment(@PathVariable("comment-id") Long id) {
				return commentService.retrieveComment(id);            
				}
	
}
