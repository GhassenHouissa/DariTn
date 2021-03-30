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

import tn.dari.spring.service.ContractSerivce;
import tn.dari.spring.entity.Contract;


@RestController
public class ContractControl {
	
	@Autowired
	ContractSerivce CS;
	
	
	@PostMapping("/add-contract")
	@ResponseBody
	public Contract addContract(@RequestBody Contract contrat) {
	Contract c = CS.addContract(contrat);
	return c;
	}
//	
//	
//	@GetMapping("/ShowAllContract")
//	@ResponseBody
//	public List<Contract> getAllContract(){
//		List <Contract> list=ContractService.showAll();
//		return list;
//	}
//	
//	
//	@GetMapping("GetById/{ContractId}")
//	@ResponseBody 
//	public Contract RetrieveById(@PathVariable("ContractID")Long id){
//		return ContractService.GetById(id);
//	}
//	
//	@GetMapping("ShowAllByName/{productName}")
//	@ResponseBody 
//	public List<Contract> RetrieveAllByName(@PathVariable("productName")Long id){
//		return CS.(id);
//	}
//	
	
//	
//	@PostMapping("/add-contract")
//	@ResponseBody
//	public Contract addContract(@RequestBody Contract c) {
//	Contract contract = ContractService.addContract(c);
//	return contract;
//	}
//	
//
	//DELETE//
	
	@DeleteMapping("/remove-contract/{Contract_ID}")
	@ResponseBody
	public void removeContract(@PathVariable("Contract_ID") Long id) {
	CS.deleteContract(id);
	}
//	
// 
	//modif///
@PutMapping("/update-Contract")
@ResponseBody
   public Contract updateContract(@RequestBody Contract c) {
	return CS.updateContract(c);
	}
}
	
	
	
	
