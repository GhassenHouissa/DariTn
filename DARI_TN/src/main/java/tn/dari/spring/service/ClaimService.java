package tn.dari.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Claim;

@Repository
public interface ClaimService {


	long countClaim();
	
	List<Claim> retrieveAllClaims();

	Claim addClaim(Claim claim);

	void deleteClaim(Long id);

	Claim retrieveclaimbyId(Long id);

	Claim retrieveClaim(Long id);

	Claim retrieveClaimByDescription(String description_claim);

	
}