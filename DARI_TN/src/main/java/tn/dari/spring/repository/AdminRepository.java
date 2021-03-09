package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin ,Long> {

}
