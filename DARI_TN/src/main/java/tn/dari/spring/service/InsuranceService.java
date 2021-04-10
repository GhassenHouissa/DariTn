package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Insurance;

public interface  InsuranceService {

	boolean deleteInsurance(long id);

	Insurance updateInsurance(Insurance i);

	Insurance addInsurance(Insurance i);

	List<Insurance> retrieveAllInsurance();

	Insurance retrieveInsurance(Long id);

	}
