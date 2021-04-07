package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Insurance;

@Repository
public interface InsuranceRepository extends CrudRepository <Insurance, Long>{

}
