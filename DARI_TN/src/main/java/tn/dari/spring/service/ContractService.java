package tn.dari.spring.service;

import java.util.List;



import tn.dari.spring.entity.Contract;

public interface ContractService {

	public Contract addContract(Contract c);
	public List<Contract> retrieveContacts();
	public void deleteContract(Long id);
	public Contract  updateContract(Contract contract) ;
	public Contract retrieveContract(Long id);
	Contract retrieveUserById(Long id);
	}
	
	
