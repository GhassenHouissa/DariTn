package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification,Long> {

}
