package tn.dari.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Ads;

@Repository
public interface Ads_interface extends CrudRepository<Ads, Long> ,JpaRepository<Ads,Long> {
	
	@Query(value = "SELECT * FROM D_annonce a  where a.area =:area ", nativeQuery = true)
    List <Ads> findAdsByArea(@Param("area")String area);
	
	@Query(value = "SELECT * FROM D_annonce c  where c.content =:content ", nativeQuery = true)
    List <Ads> findAdsByContent(@Param("content")String content);
	
	
	@Query(value = "SELECT * FROM D_annonce  where location=?1 and composition=?1 " , nativeQuery = true)
    List <Ads> findAdsByLocationOrComposition(@Param("location")String location, @Param("composition")String composition);
	
}
