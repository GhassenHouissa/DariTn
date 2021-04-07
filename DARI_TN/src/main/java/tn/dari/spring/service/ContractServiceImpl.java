package tn.dari.spring.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.dari.spring.entity.Contract;
import tn.dari.spring.repository.ContractRepository;

import tn.dari.spring.service.ContractServiceImpl;
@Service 
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository cr;


	@Override
	public Contract addContract(Contract c) {
		
		return cr.save(c);
	}
	@Override
	public void deleteContract(Long id) {
		  cr.deleteById(id);
	}
	
	
	@Override
	public Contract updateContract(Contract contract ) {
		
		return 	cr.save(contract);
	}

	
	@Override
	public List<Contract> retrieveContacts() {
		List<Contract> contracts =(List<Contract>) cr.findAll();
	return contracts;
	}
	@Override
	public Contract retrieveContract(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Contract retrieveUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	} 
	
	
	



