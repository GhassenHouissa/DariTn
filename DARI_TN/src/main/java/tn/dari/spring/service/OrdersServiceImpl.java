package tn.dari.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Orders;
import tn.dari.spring.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements IOrdersService {

	@Autowired
	OrdersRepository or ;
	
	private static final Logger l = LogManager.getLogger(OrdersServiceImpl.class);
	
	
	@Override
	public Orders addOrders(Orders o) {
		return or.save(o);
		
	}

	@Override
	public boolean deleteOrders(long id) {
		if(or.existsById(id)){
			or.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public Orders updateOrders(Orders o) {
		Orders exist =or.findById(o.getId()).orElse(null);
		
		or.findById(o.getId());
		
		exist.setNumber(o.getNumber());   
		exist.setPrice(o.getPrice());
	  
	
		return or.save(exist) ;    
	}

	@Override
	public List<Orders> retrieveAllOrders() {
		List<Orders> orders = (List<Orders>) or.findAll();
		for(Orders order : orders){
			l.info("order :" + order);
		}
		return orders;
	}

	@Override
	public Orders retrieveOrders(Long id) {
		return or.findById(id).get();
	}

}
