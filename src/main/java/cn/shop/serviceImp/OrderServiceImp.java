package cn.shop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shop.mapper.OrderMapper;
import cn.shop.po.Order;
import cn.shop.po.OrderQueryVo;
import cn.shop.service.OrderService;
@Service(value="orderService")
public class OrderServiceImp implements OrderService{
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public void addOrder(Order order) {
		orderMapper.add(order);
		
		
	}

	@Override
	public int findNowId() {
		//查询刚刚插入order的id
		return orderMapper.selectNowId();
	}

	@Override
	public List<Order> findAllOrderByCustomerId(Integer id) {
		return orderMapper.selectByCustomerID(id);
	}

	@Override
	public Order findOrderById(int order_id) {
		
		return orderMapper.selectByOrderId(order_id);
	}

	@Override
	public void deleteById(Integer id) {
		orderMapper.deleteById(id);
		
	}

	@Override
	public int findCount(Integer id) {
		
		return orderMapper.countByCustomerId(id);
	}

}
