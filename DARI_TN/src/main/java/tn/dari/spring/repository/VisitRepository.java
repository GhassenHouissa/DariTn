package tn.dari.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.dari.spring.entity.Visit;

public interface VisitRepository extends JpaRepository<Visit, Long> {

}
