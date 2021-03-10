package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;


import tn.dari.spring.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer ,Long>  {

}
