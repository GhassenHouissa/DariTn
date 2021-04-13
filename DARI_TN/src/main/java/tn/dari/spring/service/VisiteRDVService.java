package tn.dari.spring.service;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import tn.dari.spring.entity.VisiteRDV;


@Repository
public interface VisiteRDVService {
	List<VisiteRDV> retrieveAllVisiteRDV();
	VisiteRDV addVisiteRDV(VisiteRDV a,Date date);

	void deleteVisiteRDV(String id);
	VisiteRDV retrieveVisiteRDV(String id);
	void ConfrmerVisiteRDV(Date date);
	int countVisiteRDV();
	public List<VisiteRDV> rechercheVisiteRDV();
	public void VisiteRDVToday();
	public void BlockUserByAttendance();

	VisiteRDV retrieveVisiteRDV();
	VisiteRDV addVisiteRDV(VisiteRDV a, Date date, String state, VisiteRDV visitRDV);
	VisiteRDV addVisiteRDV(VisiteRDV visitRDV);


}
