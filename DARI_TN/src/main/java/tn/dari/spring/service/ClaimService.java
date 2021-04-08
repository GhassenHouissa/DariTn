package tn.dari.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Claim;

@Repository
public interface ClaimService {

	List<Claim> retrieveAllClaims();

	Claim addClaim(Claim claim);

	void deleteClaim(Long id);

	Claim retrieveclaimbyId(Long id);

	Claim retrieveClaim(Long id);

	
}
