package tn.dari.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Notification;
@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long>{

	@Query("FROM Notification n WHERE n.DescNotif = :DescNotif")
	Notification findNotifByDescription(@Param(value = "DescNotif") String DescNotif);
}