package tn.dari.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Insurance;
import tn.dari.spring.repository.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService{

	@Autowired
	InsuranceRepository ir;
	
	//private static final Logger l = LogManager.getLogger(InsuranceServiceImpl.class);
	
	@Override
	public Insurance addInsurance(Insurance i) {
		return ir.save(i);
		
	}

	@Override
	public boolean deleteInsurance(long id) {
		if(ir.existsById(id)){
			ir.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}
	

	@Override
	public Insurance updateInsurance(Insurance i) {
	return ir.save(i);
		}
	

//	@Override
//	public List<Insurance> retrieveAllInsurance() {
//		List<Insurance> insurance = (List<Insurance>) ir.findAll();
//		for(Insurance insurances: insurance){
//			l.info("insurances:" + insurances);
//		}
//		return insurance;
//	}

	@Override
	public Insurance retrieveInsurance(Long id) {
		return ir.findById(id).get();
	}

	@Override
	public List<Insurance> retrieveAllInsurance() {
		// TODO Auto-generated method stub
		return null;
	}


}
