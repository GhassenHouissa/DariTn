package tn.dari.spring.servicetest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Contract;
import tn.dari.spring.service.ContractSerivce;
@RunWith(SpringRunner.class)
@SpringBootTest

public class ContractServiceImpltest {
	
	@Autowired 
	ContractSerivce cs;
	@Test 
	public  void addContractTest(){
		Contract c = new Contract();
		cs.addContract(c);
		
		
	}

}