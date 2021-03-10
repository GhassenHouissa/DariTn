package tn.dari.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Customer;


@Repository
public interface CustomerService {
	List<Customer> retrieveAllUsers ();
	Customer addCustomer(Customer u);
	void deleteCustomer (Long id);
	Customer updateCustomer(Customer u);
	Customer retrieveCustomer(Long id);

}
