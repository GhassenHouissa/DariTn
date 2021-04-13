package tn.dari.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Bank;
import tn.dari.spring.entity.Credit;
import tn.dari.spring.entity.CreditFormula;
import tn.dari.spring.repository.BankRepository;
import tn.dari.spring.repository.CreditFormulaRepository;
import tn.dari.spring.repository.CreditRepository;

@Service
public class CreditServiceImpl implements CreditService {
	
	@Autowired
	BankRepository br;
	
	@Autowired
	CreditRepository cr;
	
	@Autowired
	CreditFormulaRepository fr;
	
	@Override
	public void addCredit(int id, Credit C) {
		CreditFormula F=fr.findById(id).get();
		int duree=F.getDuration();
		double interet=F.getInterestRate();
		float somme=C.getInitialamount();	
		float sommefinal=(float) (somme+(somme*interet));	
		float monthly=sommefinal/(duree*12);
		C.setFinalamount(sommefinal);
		C.setMonthly(monthly);	
		C.setCreditformula(F);
		cr.save(C);	
	}
	
	@Override
	public Credit retrieveCredit(int id) {
		return cr.findById(id).orElse(null);
		
	}

	
	@Override
	public void deleteCredit(int id) {
		cr.deleteById(id);
	}
	
	
	@Override
	public void addBank(Bank B) {
		br.save(B);
	}
		
	@Override
	public List<Bank> retreiveBanks(){
		return (List<Bank>) br.findAll();
	}
	
	@Override
	public Bank retreiveBank(int id) {
		return br.findById(id).orElse(null);
	}
	
	
	@Override
	public void deleteBank(int id) {
		br.deleteById(id);
	}
	
	@Override
	public void addCreditFormula(CreditFormula C, int id) {
		Bank B=br.findById(id).get();
		C.setBank(B);
		B.addFormula(C);
		fr.save(C);
	}
	
	@Override
	public List <CreditFormula> listeformulecredit(int bank){
		Bank B=br.findById(bank).get();
		return B.getCreditformulas();
	}
	
	@Override
	public void modifiecredit(int credit, int formule) {
		Credit C=cr.findById(credit).get();
		CreditFormula F=fr.findById(formule).get();
		int duree=F.getDuration();
		double interet=F.getInterestRate();
		float somme=C.getFinalamount();
		float sommefinal=(float)(somme+(somme*interet));
		float monthly=sommefinal/(duree*12);
		C.setFinalamount(sommefinal);
		C.setMonthly(monthly);
		C.setCreditformula(F);
		cr.save(C);
	}


	@Override
	public CreditFormula retreivecreditformula(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	

	
}
