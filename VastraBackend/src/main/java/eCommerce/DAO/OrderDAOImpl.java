package eCommerce.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eCommerce.model.OrderDetail;

@Repository("orderDAO")
@Transactional
public class OrderDAOImpl implements OrderDAO 
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrder(OrderDetail orderDetail) 
	{
		try
		{
		  sessionFactory.getCurrentSession().save(orderDetail);
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
@Override
  public boolean updateCart(String username)
  {
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("update CartItem set paymentStatus='P' where username=:uname");
	query.setParameter("uname", username);
	int row_eff=query.executeUpdate();
	session.close();
	if(row_eff>0)
		return true;
	else
		return false;
  }

}
