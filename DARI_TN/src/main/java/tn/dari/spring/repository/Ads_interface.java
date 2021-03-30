package tn.dari.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tn.dari.spring.entity.Ads;

public interface Ads_interface extends CrudRepository<Ads, Long> {
public List<Ads> findByAreaAndLocation(Long area,String location);
}
