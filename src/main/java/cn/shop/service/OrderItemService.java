package cn.shop.service;

import cn.shop.po.Orderitem;

public interface OrderItemService {

	void addOrderItem(Orderitem orderItem);

	Orderitem findByOrderId(int order_id);

	void deleteOrderItemByOrderId(Integer id);

}
