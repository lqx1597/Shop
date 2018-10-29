package cn.shop.service;

import java.util.List;

import cn.shop.po.Order;

public interface OrderService {

	void addOrder(Order order);

	int findNowId();

	List<Order> findAllOrderByCustomerId(Integer id);

	Order findOrderById(int order_id);

	void deleteById(Integer id);

	int findCount(Integer id);

}
