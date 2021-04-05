package tn.dari.spring.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Bank;
import tn.dari.spring.service.BankService;

@RestController
@RequestMapping("/api/bank")
public class BankController {

	@Autowired 
    private BankService bankService;

    @GetMapping("/all")
    public ResponseEntity<List<Bank>> getAllBanks() {
    	return new ResponseEntity<List<Bank>>(bankService.findAllBanks(), HttpStatus.OK);
	}
    
    @PostMapping("/add")
	public ResponseEntity<Bank> addBank(@RequestBody Bank bank) {
    	Bank bank1 = bankService.addBank(bank);
		if (bank1 == null) return new ResponseEntity<Bank>(bank, HttpStatus.CONFLICT);
		return new ResponseEntity<Bank>(bank1, HttpStatus.OK);
	}
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Bank> deleteBank(@PathVariable("id") long id)
    {
    	bankService.deleteBank(id);
        return new ResponseEntity<Bank>( HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Bank> updateFormation(@Validated @RequestBody Bank bank)
    {
    	Bank bank1 = bankService.updateBank(bank);
		if (bank1 == null) return new ResponseEntity<Bank>(bank, HttpStatus.CONFLICT);
		return new ResponseEntity<Bank>(bank1, HttpStatus.OK);
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Bank> getBank(@PathVariable("id") Long id) {
    	Bank bank1 = bankService.findBankByID(id);
    	if (bank1 == null) return new ResponseEntity<Bank>(bank1, HttpStatus.CONFLICT);
		return new ResponseEntity<Bank>(bank1, HttpStatus.OK);
    }
    
}
