package tn.dari.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.entity.Orders;
import tn.dari.spring.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements IOrdersService {

	@Autowired
	OrdersRepository or ;
	@Override
	public void addOrders(Orders o) {
		or.save(o);
		
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

}
