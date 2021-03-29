package tn.dari.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.dari.spring.entity.Ads;
@RepositoryRestResource
public interface Ads_interface extends CrudRepository<Ads, Long> {
public List<Ads> findByTitle4Contains(String title);
public List<Ads> findByLocation4Contains(String location);

}
 