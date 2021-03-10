package tn.dari.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Admin;
import tn.dari.spring.entity.Customer;
import tn.dari.spring.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> retrieveAllUsers() {
		List<Customer> customers =  (List<Customer>)customerRepository.findAll();
		return customers;
		}
	@Override
	public Customer addCustomer (Customer c) {
		Customer customers = customerRepository.save(c);
		return customers ;
	}
	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
		
	}
	@Override
	public Customer updateCustomer(Customer c) {
		Customer customers=customerRepository.save(c);
		return customers;
	}
	@Override
	public Customer retrieveCustomer(Long id) {
		Optional<Customer> customers=customerRepository.findById(id);
		if (customers != null ) {
			return customers.get();
		}
	
		return null;
	}


}
