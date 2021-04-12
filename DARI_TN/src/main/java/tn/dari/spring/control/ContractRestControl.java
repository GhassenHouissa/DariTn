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

import tn.dari.spring.entity.Contract;
import tn.dari.spring.service.ContractService;

@RestController

public class ContractRestControl {




	
	@Autowired
	ContractService cs;
	
	
	
//*****************************************add***************************************
	// http://localhost:8081/DARITN/servlet/add-Contract       
	            @PostMapping("/add-Contract")
	            @ResponseBody
				public Contract addContract(@RequestBody Contract c) {
					Contract contract = cs.addContract(c);     
				return contract;
				}
	            
	            
	          
				
	
	
//*************************************************delete************************************
	// http://localhost:8081/DARITN/servlet/remove-contract/{Contract_Id}
		
					
					@DeleteMapping("/remove-contract/{Contract_ID}")
					@ResponseBody
					public void removeContract(@PathVariable("Contract_ID") Long id) {
					cs.deleteContractt(id);
				}
				
				
//**************************************************update*********************************		
				
      // http://localhost:8081/DARITN/servlet/modify-contract
				@PutMapping("/modify-contract")
				@ResponseBody
				public Contract modifyContract(@RequestBody Contract contract) {
				return cs.updateContract(contract);         
				}
				
//***************************************retrieveAll***********************************
				
				// http://localhost:8081/DARITN/servlet/retrieve-all-contract
				@GetMapping("/retrieve-all-contract")
				@ResponseBody
				public List<Contract> getContract() {
				List<Contract> list = cs.retrieveAllContract();           
				return list;
				}
			
//***********************************************retrievebyid**************************************				
				
				
				//http://localhost:8081/DARITN/servlet/retrieve-contract/{Contract_ID}
				@GetMapping("/retrieve-contract/{Contract_Id}")
				@ResponseBody
				public Contract retrieveContract(@PathVariable("Contract_Id") Long id) {
				return cs.retrieveContract(id);            
				}
				

}
