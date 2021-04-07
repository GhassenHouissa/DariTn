package tn.dari.spring.service;
import java.util.List;


import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Insurance;
@Repository
public interface  InsuranceService {
	public  Insurance addInsurance( Insurance i);
	public List<Insurance> retrieveInsurances();
	public Insurance retrieveInsuranceById(Long id);
	public void deleteInsurance(Long id);
	public Insurance  updateInsurance(Insurance i) ;
	
	Insurance retrieveUserById(Long id);
	}
