package tn.dari.spring.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.entity.Category;
import tn.dari.spring.entity.Transaction;
@CrossOrigin("*")
@RepositoryRestResource
public interface AdsRepository extends JpaRepository<Ads, Long> {
	@RestResource(path="/byDescr")
public Page<Ads> findByDescription4Contains(@Param("m4") String description, Pageable pageable);
	@RestResource(path="/byTitle")
public Page<Ads> findByTitle4Contains(@Param("m1") String title, Pageable pageable);
//	@RestResource(path="/byTransaction")
//public Page<Ads> findByTransaction4(@Param("m2") Transaction transaction, Pageable pageable);
	//@RestResource(path="/byCategory")
//public Page<Ads> findByCategory4(@Param("m3") Category category, Pageable pageable);
	@RestResource(path="/byTransaction")
public Page<Ads> findByTransaction4(@Param("m5") Transaction transaction, Pageable pageable);

	@Query("FROM Ads c WHERE c.category4 = :category4")
	 List<Ads> findAdsByCategory(@Param(value = "category4") Category category);

	@Query("FROM Ads t WHERE t.transaction4 = :transaction4")
	 List<Ads> findAdsByTransaction(@Param(value = "transaction4") Transaction transaction4);
}
