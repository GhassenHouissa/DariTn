package tn.dari.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Claim;
import tn.dari.spring.repository.ClaimRepository;

@Service
public class ClaimServiceImpl implements ClaimService {

	@Autowired
	private ClaimRepository claimRepository;
	
	@Override
	public List<Claim> retrieveAllClaims(){
		List<Claim> claims = (List<Claim>) claimRepository.findAll();
		return claims;
	}

	@Override
	public Claim addClaim(Claim c) {
		Claim claim =claimRepository.save(c);
		return claim; 
	}
	

	@Override
	public void deleteClaim(Long id) {
		claimRepository.deleteById(id);
	}
	
	@Override
	public Claim retrieveclaimbyId(Long id) {
		Optional<Claim> claim=claimRepository.findById(id);
		if (claim != null ) {
			return claim.get();
		}
		return null;
		
	}

	@Override
	public Claim retrieveClaim(Long id) {
		// TODO Auto-generated method stub
		return claimRepository.findById(id).get();
	}
	
	public long countClaim() {
		return claimRepository.count();		
	}
	
	@Override
	public Claim retrieveClaimByDescription(String description_claim) {
		Claim claim = claimRepository.findClaimByDescription(description_claim);
		return claim;
	}
	
}