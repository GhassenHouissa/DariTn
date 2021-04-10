package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Contract;


@Repository
public interface ContractRepository extends CrudRepository <Contract , Long>{


	

}
