package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Favorites;
@Repository
public interface FavoritesRepository extends CrudRepository<Favorites, Long> {

}
