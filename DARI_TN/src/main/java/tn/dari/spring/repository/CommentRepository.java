package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Long> {

}
