package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Claim;
@Repository
public interface ClaimRepository extends CrudRepository<Claim, Long>{

}
