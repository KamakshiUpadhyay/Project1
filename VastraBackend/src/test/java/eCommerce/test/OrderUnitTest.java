package eCommerce.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import eCommerce.DAO.OrderDAO;
import eCommerce.model.OrderDetail;

public class OrderUnitTest 
{
	static OrderDAO orderDAO;
	
	@BeforeClass
	public static void executeFirst() 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("eCommerce");
		context.refresh();
		orderDAO = (OrderDAO)context.getBean("orderDAO");
	}
@Test
  public void saveOrderTest()
  {
	OrderDetail orderDetail= new OrderDetail();
	orderDetail.setOrderdate(new Date());
	orderDetail.setCardID(100);
	orderDetail.setShippingAddr("Mayur Vihar");
	orderDetail.setTrans("cod");
	orderDetail.setUsername("Priya");
	
	assertTrue("Problem in Saving Order", orderDAO.saveOrder(orderDetail));
  }
	
	
}
