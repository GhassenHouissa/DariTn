package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Bank;
import tn.dari.spring.entity.Credit;
import tn.dari.spring.entity.CreditFormula;

public interface CreditService {
	public void addBank(Bank B);
	public List<Bank> retreiveBanks();
	public Bank retreiveBank(int id);
	public void deleteBank(int id);
	public void addCredit(int id, Credit C);
	public Credit retrieveCredit(int id);
	public void deleteCredit(int id);
	public void addCreditFormula(CreditFormula C, int id);
	public List<CreditFormula> listeformulecredit(int bank);
	public CreditFormula retreivecreditformula(int id);
	public void modifiecredit(int id, int credit);

}
