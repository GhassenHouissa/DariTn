package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.dari.spring.entity.Favorites;

public interface FavoritesRepository extends CrudRepository<Favorites, Long> {

}
 