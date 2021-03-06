package eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import eCommerce.DAO.ProductDAO;
import eCommerce.DAO.UserDAO;
import eCommerce.model.Product;
import eCommerce.model.UserDetail;

@Controller
public class PageController 
{
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/login")
		public String showLogin(Model m)
		{
		    m.addAttribute("pageinfo" , "Login");
			return "Login";
		}
	@RequestMapping("/adminhome")
	public String showHome(Model m)
	{
	    m.addAttribute("pageinfo" , "Home");
	    List<Product> listProducts = productDAO.listProducts();
		m.addAttribute("productList", listProducts);
		return "AdminHome";
	}
	 
	
    @RequestMapping("/register")
		public String showRegister(Model m)
		{
    		m.addAttribute("user", new UserDetail());
    	    m.addAttribute("pageinfo" , "Register");
			return "Register";
		}

	@RequestMapping("/contactus")
		public String showContactUs(Model m)
		{
		    m.addAttribute("pageinfo" , "Contact Us");
			return "ContactUs";
		}

	@RequestMapping("/aboutus")
		public String showAboutUs(Model m)
		{
		    m.addAttribute("pageinfo" , "About Us");
			return "AboutUs";
		}

	


}
