package tn.dari.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Admin;

@Repository
public interface AdminService {
	List<Admin> retrieveAllUsers ();
	Admin addAdmin(Admin u);
	void deleteAdmin (Long id);
	Admin updateAdmin(Admin u);
	Admin retrieveAdmin(Long id);

}
