package tn.dari.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.VisiteRDV;

@Repository
public interface VisiteRDVRepository extends CrudRepository<VisiteRDV,Long>{
	@Query("SELECT a FROM VisiteRDV a WHERE a.state=:confirmed ")
	List<VisiteRDV> retrieveAllVisiteRDVByState(@Param("confirmed")String State);

	static VisiteRDV saveAndFlush(VisiteRDV visiteRDV) {
		// TODO Auto-generated method stub
		return null;
	}

}