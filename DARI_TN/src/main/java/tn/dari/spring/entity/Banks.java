package tn.dari.spring.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.service.BankService;

@RestController
public class Banks {

	@Autowired 
    private BankService bankService;

    @RequestMapping("/banks")
    public List<Bank> getAllBanks() {
		return bankService.getAllBanks();
	}
    
    @RequestMapping("/banks/{id}")
    public Bank getBank(@PathVariable String id) {
    	return bankService.getBank(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/banks")
    public void addBank(@RequestBody Bank bank) {
    	bankService.addBank(bank);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/banks/{id}")
    public void updateBank(@RequestBody Bank bank, @PathVariable String id) {
    	bankService.updateBank(id, bank);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/banks/{id}")
    public void deleteBank(@PathVariable String id) {
    	bankService.deletetBank(id);
    }
    
}
