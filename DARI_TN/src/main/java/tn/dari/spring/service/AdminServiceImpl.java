package tn.dari.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Admin;
import tn.dari.spring.entity.User;
import tn.dari.spring.repository.AdminRepository;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public List<Admin> retrieveAllUsers() {
		List<Admin> admins =  (List<Admin>)adminRepository.findAll();
		return admins;
	}

	@Override
	public Admin addAdmin(Admin a) {
		Admin admins = adminRepository.save(a);
		return admins;
	}

	@Override
	public void deleteAdmin(Long id) {
		adminRepository.deleteById(id);
		
	}

	@Override
	public Admin updateAdmin(Admin a) {
		Admin admins=adminRepository.save(a);
		return admins;
	}

	@Override
	public User retrieveAdmin(Long id) {
		Optional<Admin> admins=adminRepository.findById(id);
		if (admins != null ) {
			return admins.get();
		}
		return null;
		
	}
}
