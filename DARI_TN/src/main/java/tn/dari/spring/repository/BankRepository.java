package tn.dari.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.dari.spring.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{

}
