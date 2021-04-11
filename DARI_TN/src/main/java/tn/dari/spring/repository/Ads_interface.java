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
	
	
	@Query(value = "SELECT * FROM D_annonce  where location=?1 or composition=?1 " , nativeQuery = true)
    List <Ads> findAdsByLocationOrComposition(@Param("location")String location, @Param("composition")String composition);
	
	
	/*@Query(value = "SELECT * FROM  D_annonce  JOIN Search JOIN User  where (Search.word_search=Adds.add_name OR Search.word_search=Adds.add_content )AND( User.Id=Search.id_client_Search)  AND (User.Id = ?1)   ", nativeQuery = true)
    List<Ads> lespubquiaffichepourceclient(@Param("id") long id);*/
	
	@Query(value = "SELECT * FROM D_annonce  where reduction=1 " , nativeQuery = true)
    List <Ads> findAdsByReduction(@Param("reduction")Boolean reduction);
	
	@Query(value = "SELECT * FROM D_annonce  where augmentation=1 " , nativeQuery = true)
    List <Ads> findAdsByAugmentation(@Param("augmentation")Boolean augmentation);
	
	
}
