package eCommerce.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCommerce.DAO.UserDAO;
import eCommerce.model.UserDetail;

public class UserJunitTest 
{
	static UserDAO userDAO;

	@BeforeClass
	public static void executeFirst() 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("eCommerce");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
	}

	@Test
	@Ignore
	public void registerUserTest() 
	{
		UserDetail user = new UserDetail();
		user.setUserName("Kamakshi");
		user.setPassword("k1234");
		user.setEnabled(true);
		user.setRole("ROLE_ADMIN");
		user.setCustomerName("MS. Kamakshi");
		user.setCustomerAddr("Delhi");
		
		assertTrue("Problem in Registering User", userDAO.registerUser(user));
		
	}
    
}
