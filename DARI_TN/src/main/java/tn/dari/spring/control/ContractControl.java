package tn.dari.spring.control;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.dari.spring.service.ContractService;
import tn.dari.spring.entity.Contract;


@RestController
public class ContractControl {
	
	@Autowired
	ContractService cs;
	
	// http://localhost:8081/SpringMVC/servlet/add-contract
	@PostMapping("/add-contract")
	@ResponseBody
	public Contract addContract(@RequestBody Contract contrat) {
	Contract c = cs.addContract(contrat);
	return c;
	}
	

	// http://localhost:8081/SpringMVC/servlet/Show-All
	@GetMapping("/Show-All")
	@ResponseBody 
	public List<Contract> RetrieveAllById(){
		return cs.retrieveContacts();
	}
	

	
	//DELETE//
	// http://localhost:8081/SpringMVC/servlet/remove-contract/
	@DeleteMapping("/remove-contract/{Contract_ID}")
	@ResponseBody
	public void removeContract(@PathVariable("Contract_ID") Long id) {
	cs.deleteContract(id);
	}


	
// http://localhost:8081/SpringMVC/servlet/update-Contract/
	
	@PutMapping("/update-Contract/{Contract_ID}")
	@ResponseBody
	public Contract updateContract(@RequestBody Contract contract) {
		return cs.updateContract(contract);
	
	
	}
}
	
	
	
	
