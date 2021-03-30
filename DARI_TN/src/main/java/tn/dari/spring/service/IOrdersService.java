package tn.dari.spring.service;

import tn.dari.spring.entity.Orders;

public interface IOrdersService {
	
	void addOrders(Orders o);
	boolean deleteOrders(long id);

}
