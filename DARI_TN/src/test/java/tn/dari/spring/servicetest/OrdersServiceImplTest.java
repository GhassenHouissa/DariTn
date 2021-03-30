package tn.dari.spring.servicetest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Orders;
import tn.dari.spring.service.IOrdersService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdersServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(OrdersServiceImplTest.class);
	
	@Autowired
	IOrdersService os ;
	
	@Test
	public void addOrdersTest(){
		Orders o = new Orders();
		
		os.addOrders(o);
	}
	
	@Test
	public void deleteOrdersTest(){
		l.info("Orders deleted : "+ os.deleteOrders(2));
		
	}

}
