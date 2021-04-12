package tn.dari.spring.service;

import java.util.List;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Contract;
import tn.dari.spring.repository.ContractRepository;

@Service
public  class ContractServiceImpl implements ContractService{

	@Autowired
	
	ContractRepository cr;
	
//	private static final Logger l = LogManager.getLogger(ContractServiceImpl.class);
	
	@Override
	public Contract addContract(Contract c) {
		return cr.save(c);
		
	}

	@Override
	public boolean deleteContractt(long id) {
		if(cr.existsById(id)){
			cr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}
	

	@Override
	public Contract updateContract(Contract c) {
	return cr.save(c);
		}
	

//	@Override
//	public List<Contract> retrieveAllContract() {
//		List<Contract> contract = (List<Contract>) cr.findAll();
//		for(Contract contracts : contract){
//			l.info("contracts:" + contracts);
//		}
//		return contract;
//	}

	@Override
	public Contract retrieveContract(Long id) {
		return cr.findById(id).get();
	}

	@Override
	public List<Contract> retrieveAllContract() {
		// TODO Auto-generated method stub
		return null;
	}



}

