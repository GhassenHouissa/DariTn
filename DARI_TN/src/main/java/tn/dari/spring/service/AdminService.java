package tn.dari.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Admin;
import tn.dari.spring.entity.User;

@Repository
public interface AdminService {
	List<Admin> retrieveAllUsers ();
	User addAdmin(Admin u);
	void deleteAdmin (Long id);
	User updateAdmin(Admin u);
	User retrieveAdmin(Long id);

}
