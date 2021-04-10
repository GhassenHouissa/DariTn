package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Contract;

public interface ContractService {

	Contract addContract(Contract c);

	boolean deleteContractt(long id);

	Contract updateContract(Contract c);

	List<Contract> retrieveAllContract();

	Contract retrieveContract(Long id);

}
