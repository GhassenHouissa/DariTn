package tn.dari.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Bank;
import tn.dari.spring.repository.BankRepository;

@Service 
public class BankService {
	
	private BankRepository bankRepository;
	
	public List<Bank> findAllBanks(){
		return bankRepository.findAll();
	}
	
	public Bank addBank(Bank bank)  {
		return bankRepository.save(bank);
	}
	
	
	public void deleteBank(Long id) {
		bankRepository.deleteById(id);
	}
	
	public Bank updateBank(Bank bank) {
		return bankRepository.saveAndFlush(bank);
	}
	
	public Bank findBankByID(Long id) {
		return bankRepository.getOne(id); 
	}

}
