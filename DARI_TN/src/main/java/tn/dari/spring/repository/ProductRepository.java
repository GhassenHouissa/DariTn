package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.dari.spring.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
