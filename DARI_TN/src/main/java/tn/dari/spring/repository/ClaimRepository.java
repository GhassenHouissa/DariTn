package tn.dari.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Claim;
@Repository
public interface ClaimRepository extends CrudRepository<Claim, Long>{

	@Query("FROM Claim c WHERE c.description_claim = :description_claim")
	Claim findClaimByDescription(@Param(value = "description_claim") String description_claim);
}