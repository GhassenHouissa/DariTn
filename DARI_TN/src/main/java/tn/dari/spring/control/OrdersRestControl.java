package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Orders;
import tn.dari.spring.service.IOrdersService;

@RestController
public class OrdersRestControl {
	
	@Autowired
	IOrdersService ordersService;
	
	
	//*******************add*********************************************************
		// http://localhost:8082/DARITN/servlet/add-Orders
				@PostMapping("add-Orders")
				@ResponseBody
				public Orders addOrders(@RequestBody Orders o) {
					Orders orders = ordersService.addOrders(o);         
				return orders;
				}
				
	//*****************delete*********************************************************
				
				
				// http://localhost:8082/DARI_TN/servlet/remove-orders/{orders-id}
				@DeleteMapping("/remove-orders/{orders-id}")
				@ResponseBody
				public void removeOrders(@PathVariable("orders-id") long ordersId) {
					ordersService.deleteOrders(ordersId);         
				}
				
				
    //********************************update*****************************************
				
				// http://localhost:8082/DARI_TN/servlet/modify-orders
				@PutMapping("/modify-orders")
				@ResponseBody
				public Orders modifyOrders(@RequestBody Orders orders) {
				return ordersService.updateOrders(orders);         
				}
				
				
//***************************************retrieveAll***********************************
				
				// http://localhost:8082/DARI_TN/servlet/retrieve-all-orders
				@GetMapping("/retrieve-all-orders")
				@ResponseBody
				public List<Orders> getOrders() {
				List<Orders> list = ordersService.retrieveAllOrders();             
				return list;
				}
				
//***********************************************retrievebyid**************************************				
				
				
				//http://localhost:8082/DARITN/servlet/retrieve-orders/{orders-id}
				@GetMapping("/retrieve-orders/{orders-id}")
				@ResponseBody
				public Orders retrieveOrders(@PathVariable("orders-id") Long id) {
				return ordersService.retrieveOrders(id);           
				}

}
