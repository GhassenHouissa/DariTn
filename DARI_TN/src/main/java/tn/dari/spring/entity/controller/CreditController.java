package tn.dari.spring.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Bank;
import tn.dari.spring.entity.CreditFormula;
import tn.dari.spring.repository.BankRepository;
import tn.dari.spring.repository.CreditFormulaRepository;
import tn.dari.spring.service.CreditService;

@RestController
public class CreditController {
	
	@Autowired
	CreditService cs;
	
	@Autowired
	BankRepository brep;
	
	@Autowired
	CreditFormulaRepository cfr;
	
	
	@GetMapping("/banks/get")
	public List<Bank> getBanks()
	{
		return (List<Bank>) brep.findAll();
	}
	
	@GetMapping("/banks/getf")
	public List<CreditFormula> getCreditFormula()
	{
		return (List<CreditFormula>) cfr.findAll();
	}
	
	@PostMapping("/banks/addbank")
	public ResponseEntity<String> addBank(@RequestBody Bank B)
	{
		cs.addBank(B);
		return new ResponseEntity<>("Ajout avec succés.", HttpStatus.CREATED);
	}
	
	@PostMapping("/banks/{id}/addformula")
	public ResponseEntity<String> ajouterPackage(@PathVariable("id")int id, @RequestBody CreditFormula F)
	{
		cs.addCreditFormula(F, id);
		return new ResponseEntity<>("Ajout avec succés...", HttpStatus.CREATED);
	}
	
	@PutMapping("/credits/{credit}/creditformulas/{formule}/modify")
	public ResponseEntity<String> modifiecredit(@PathVariable("credit")int credit,@PathVariable("formule")int formule)
	{
		cs.modifiecredit(credit, formule);
		return new ResponseEntity<>("success..", HttpStatus.ACCEPTED);
	}
	
    @GetMapping("/numberOfBanks")
    @ResponseBody
    public Long countBank() {
    	Long countBank=countBank();
    	return countBank;
        //@GetMapping("/numberOfBanks")
        //@ResponseBody
        //public Long countBank() {
        	//Long countBank= bankService.countBank() ;
        	//return countBank;
    }

}