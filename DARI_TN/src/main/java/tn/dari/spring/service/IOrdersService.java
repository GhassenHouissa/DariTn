package tn.dari.spring.service;

import java.util.List;

import tn.dari.spring.entity.Orders;

public interface IOrdersService {
	
	Orders addOrders(Orders o);
	boolean deleteOrders(long id);
	Orders updateOrders( Orders o);
	List<Orders> retrieveAllOrders();
	Orders retrieveOrders(Long id);

}
