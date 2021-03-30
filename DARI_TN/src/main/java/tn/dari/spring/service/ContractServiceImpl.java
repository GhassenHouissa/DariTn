package tn.dari.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.dari.spring.entity.Contract;
import tn.dari.spring.repository.ContractRepository;


@Service 
public class ContractServiceImpl implements ContractSerivce {
//	private static final Logger L = LogManager.addLogger(ContractSerivce.class);
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
	public Contract updateContract(Contract c ) {
		  Contract contract = cr.save(c);
		  return contract;
		  
	}
	

	
	@Override
	public List<Contract> retrieveContacts() {
		List<Contract> contracts =(List<Contract>) cr.findAll();
	return contracts;
	} 
	
	
	


}
