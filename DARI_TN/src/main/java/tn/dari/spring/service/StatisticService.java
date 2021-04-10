package tn.dari.spring.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.StatisticPayment;


@Service
public class StatisticService {
	
	public List<StatisticPayment> findByCriteria(StatisticPayment statisticPayment){
		String query="SELECT c FROM Orders c WHERE 1=1 ";
		if( StringUtil.isNotEmpty(statisticPayment.getReference()))
			query+=" AND c.reference = '"+ statisticPayment.getReference()+"'";
		
		if(StringUtil.isNotEmpty(statisticPayment.getTotalMin()))
			query+=" AND c.total >= '"+ statisticPayment.getTotalMin()+"'";
		
		
		if(StringUtil.isNotEmpty(statisticPayment.getTotalMax()))
			query+=" AND c.total <= '"+ statisticPayment.getTotalMax()+"'";
		return entityManager.createQuery(query).getResultList() ;
		
	
}
    
	@Autowired
	private EntityManager entityManager;
}
