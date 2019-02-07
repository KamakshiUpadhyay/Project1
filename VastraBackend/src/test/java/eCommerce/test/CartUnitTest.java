package eCommerce.test;
 
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import eCommerce.DAO.CartDAO;
import eCommerce.model.CartItem;

public class CartUnitTest 
     {
		static CartDAO cartDAO;
		
		@BeforeClass
		public static void executeFirst() 
		{
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("eCommerce");
			context.refresh();
			cartDAO = (CartDAO)context.getBean("cartDAO");
		}
		
		
		@Test
		public void addCartItemTest() 
		{
			CartItem cartItem=new CartItem();
			cartItem.setProductid(5);
			cartItem.setProductName("Saree");
			cartItem.setQuantity(5);
			cartItem.setPrice(2000);
			cartItem.setPaymentStatus("NP");
			cartItem.setUsername("Akansha");
			
			assertTrue("Problem in adding into Cart",cartDAO.addCartItem(cartItem));
	}
		
		@Test 
		@Ignore
		public void updateCartItemTest()
		{
			CartItem cartItem=cartDAO.getCartItem(5);
			cartItem.setQuantity(2);
			
			assertTrue("Problem in Updating the cart",cartDAO.updateCartItem(cartItem));
		}
		
		
		@Test
		@Ignore
		public void deleteCartItemTest()
		{
			CartItem cartItem=cartDAO.getCartItem(5);
			assertTrue("Problem in Deleting the cart",cartDAO.deleteCartItem(cartItem));
		}
		
		
		@Test
		public void displayCartItems()
		  {
			List<CartItem> listCartItems=cartDAO.listCartItems("Akansha");
		   	assertTrue("Problem in Displaying the CartItems", listCartItems.size()>0);
	        
		   	for (CartItem cartItem:listCartItems)
		 	{
		   		System.out.println(cartItem.getProductid()+"\t");
		   		System.out.println(cartItem.getProductName()+"\t");
		   		System.out.println(cartItem.getPrice()+"\t");
		   		System.out.println(cartItem.getPrice()*cartItem.getQuantity());
		   		
		   	}
		 }
   }


