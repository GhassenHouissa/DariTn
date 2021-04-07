package tn.dari.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Insurance;
import tn.dari.spring.repository.InsuranceRepository;
import tn.dari.spring.service.InsuranceService;



	@Service 
public class InsuranceServiceImp implements InsuranceService {
//		private static final Logger L = LogManager.addLogger(ContractSerivce.class);
	   @Autowired
	    InsuranceRepository ir;

		@Override
		public Insurance addInsurance(Insurance i) {
			
			return ir.save(i);
		}
		
		@Override
		public void deleteInsurance(Long id) {
			  ir.deleteById(id);
		}
		
		@Override
		public Insurance updateInsurance(Insurance insurance ) {
			return 	ir.save(insurance);
		
		}

		@Override
		public List<Insurance> retrieveInsurances() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Insurance retrieveInsuranceById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Insurance retrieveUserById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
//		@Override
//		public List<Insurance> retrieveInsurances() {
//			List<Insurance> insurances =(List<Insurance>) ir.findAll();
//		return insurances;
//		}
		
		
	}
		

