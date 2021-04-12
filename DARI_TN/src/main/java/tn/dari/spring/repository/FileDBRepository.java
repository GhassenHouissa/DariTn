package tn.dari.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.FileDB;


@Repository


public interface FileDBRepository extends JpaRepository<FileDB, String> {

}