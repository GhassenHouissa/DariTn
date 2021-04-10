package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.StatisticPayment;
import tn.dari.spring.service.StatisticService;

@RestController
public class StatisticPaymentController {
	
	@Autowired
	StatisticService statisticService;
	
	
	// http://localhost:8082/DARITN/servlet/criteria
	
	@PostMapping("/criteria")
    @ResponseBody
	public List<StatisticPayment> findByCriteria(@RequestBody StatisticPayment statisticPayment){
		return statisticService.findByCriteria(statisticPayment);
	}

}
