package cn.shop.contorller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.shop.po.Customeraddress;
import cn.shop.po.Order;
import cn.shop.po.Orderitem;
import cn.shop.po.Product;
import cn.shop.service.CustomerAddressService;
import cn.shop.service.OrderItemService;
import cn.shop.service.OrderService;
import cn.shop.service.ProductService;

@Controller
public class OrderItemController {
	@Autowired
	private OrderItemService orderItemService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private CustomerAddressService customerAddressService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping("orderItemQuery")
	public void orderItmeQuery(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		//根据orderid查询orderitem
		int order_id = Integer.parseInt(req.getParameter("order_id"));
		
		//根据orderid查询order
		Order order = orderService.findOrderById(order_id);
		req.getSession().setAttribute("orderItemOrder", order);
		//根据orderid查询orderitem
		Orderitem orderItem = orderItemService.findByOrderId(order_id);
		req.getSession().setAttribute("orderItem", orderItem);
		//根据order的addressID来查询address
		Customeraddress orderItemAddress = customerAddressService.findAddressByAddressId(order.getAddress_id());
		req.getSession().setAttribute("orderItemAddress", orderItemAddress);
		//根据orderItem的productID来查询product
		Product orderItemProduct = productService.findProductById(orderItem.getProduct_id());
		req.getSession().setAttribute("orderItemProduct", orderItemProduct);
		req.getRequestDispatcher("orderDetailed.jsp").forward(req, resp);
	}

}
