package cn.shop.po;

import com.sun.jndi.cosnaming.IiopUrl.Address;

public class OrderQueryVo {
	private Order orderOrder;
	private Orderitem orderItem;
	private Product orderProduct;
	private CustomerDeve orderCustomerDeve;
	private Address orderAddress;
	public Order getOrderOrder() {
		return orderOrder;
	}
	public void setOrderOrder(Order orderOrder) {
		this.orderOrder = orderOrder;
	}
	public Orderitem getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(Orderitem orderItem) {
		this.orderItem = orderItem;
	}
	public Product getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(Product orderProduct) {
		this.orderProduct = orderProduct;
	}
	public CustomerDeve getOrderCustomerDeve() {
		return orderCustomerDeve;
	}
	public void setOrderCustomerDeve(CustomerDeve orderCustomerDeve) {
		this.orderCustomerDeve = orderCustomerDeve;
	}
	public Address getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(Address orderAddress) {
		this.orderAddress = orderAddress;
	}
	@Override
	public String toString() {
		return "OrderQueryVo [orderOrder=" + orderOrder + ", orderItem="
				+ orderItem + ", orderProduct=" + orderProduct
				+ ", orderCustomerDeve=" + orderCustomerDeve
				+ ", orderAddress=" + orderAddress + "]";
	}
	
	
	

}
