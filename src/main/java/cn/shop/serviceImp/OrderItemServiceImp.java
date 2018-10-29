package cn.shop.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shop.mapper.OrderitemMapper;
import cn.shop.po.Orderitem;
import cn.shop.service.OrderItemService;
@Service(value="orderItemService")
public class OrderItemServiceImp implements OrderItemService{
	
	@Autowired
	private OrderitemMapper orderItemMapper;

	@Override
	public void addOrderItem(Orderitem orderItem) {
		orderItemMapper.insert(orderItem);
		
	}

	@Override
	public Orderitem findByOrderId(int order_id) {

		return orderItemMapper.findByOrderId(order_id);
	}

	@Override
	public void deleteOrderItemByOrderId(Integer id) {
		orderItemMapper.deleteOrderItemByOrderId(id);
		
	}

}
