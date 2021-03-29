package tn.dari.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Bank;

@Service 
public class BankService {
	
	private List<Bank> banks = new ArrayList<>(Arrays.asList(
				new Bank("Banque de l’Habitat" , "01" , "9.23"),
				new Bank("Banque Nationale Agricole" , "02" , "11.23"),
				new Bank("Banque de Tunisie et des Emirats" , "03" , "12.85"),
				new Bank("Banque Zitouna" , "04" , "10.22"),
				new Bank("Amen Bank" , "05" , "11.35"),
				new Bank("Attijari Bank" , "06" , "14.52"),
				new Bank("Arab Tunisian Bank" , "07" , "12.85"),
				new Bank("Banque de Tunisie" , "08" , "8.12"),
				new Bank("Union Internationale de Banque" , "09" , "12.15"),
				new Bank("Qatar National Bank- Tunis " , "10" , "9.89"),
				new Bank("Banque de Tunisie et des Emirats" , "11" , "13.71")
				
				));
	
	public List<Bank> getAllBanks() { 
		return banks;
	}
	
	public Bank getBank(String id) {
		return banks.stream().filter(t -> t.getBank_id().equals(id)).findFirst().get();
	}

	public void addBank(Bank bank) {
		banks.add(bank);
	}

	public void updateBank(String id, Bank bank) {
		for (int i=0; i < banks.size(); i++) {
			Bank t = banks.get(i);
			if(t.getBank_id().equals(id)) {
				banks.set(i, bank);
				return;
			}
		}
		
	}

	public void deletetBank(String id) {
		banks.removeIf(t -> t.getBank_id().equals(id));
	}

}
