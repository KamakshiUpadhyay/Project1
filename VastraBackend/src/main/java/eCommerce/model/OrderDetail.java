package eCommerce.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OrderDetail 
{
  @Id
  @GeneratedValue
  int orderID;
  int cardID;
  int TotalAmount;
  
  String username;
  Date orderDate;
  String shippingAddr;
  String Trans;
  
public int getOrderID() {
	return orderID;
}
public void setOrderID(int orderID) {
	this.orderID = orderID;
}
public int getCardID() {
	return cardID;
}
public void setCardID(int cardID) {
	this.cardID = cardID;
}
public int getTotalAmount() {
	return TotalAmount;
}
public void setTotalAmount(int totalAmount) {
	TotalAmount = totalAmount;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public String getShippingAddr() {
	return shippingAddr;
}
public void setShippingAddr(String shippingAddr) {
	this.shippingAddr = shippingAddr;
}
public String getTrans() {
	return Trans;
}
public void setTrans(String trans) {
	Trans = trans;
}
  
  
}
