package cn.shop.contorller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shop.po.CustomerDeve;
import cn.shop.po.Order;
import cn.shop.po.OrderQueryVo;
import cn.shop.po.Orderitem;
import cn.shop.po.Shop;
import cn.shop.service.OrderItemService;
import cn.shop.service.OrderService;
import cn.shop.service.ShopService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderItemService orderItemService;
	@Autowired
	private ShopService shopService;
	//添加订单操作
	@RequestMapping("goOrder")
	public @ResponseBody Order goOrder(Order order, HttpServletRequest req)
			throws ParseException {
		// 创建订单编号 时间+4位随机数
		String orderno = "" + Calendar.getInstance().getTimeInMillis() + ""
				+ (1000 + new Random().nextInt(9000));
		order.setOrder_no(orderno);
		// 创建提交订单时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		Date submit_date = df.parse(df.format(new Date()));// df.format(new
															// Date())为当前时间
		order.setSubmit_date(submit_date);
		// 创建订单状态
		int status = 1;
		order.setStatus(status);
		// 添加订单order
		orderService.addOrder(order);

		// 添加订单详情表
		// 根据刚刚插入的订单的id来插入订单详情（orderitem）
		// 获取刚刚插入订单的id
		int order_id = order.getId();//再插入时sql使用自增主键返回获取刚刚插入的id
		/*int order_id = orderService.findNowId();//这是获取id的最大值的方法*/
		// 新建orderItme对象
		Orderitem orderItem = new Orderitem();
		// 设置相关信息
		orderItem.setOrder_id(order_id);
		String product_id = req.getParameter("product_id");
		orderItem.setProduct_id(Integer.parseInt(product_id));
		orderItem.setSale_number(1);//设置购买数量
		int sale_price = order.getTotal_money();
		orderItem.setSale_price(sale_price);
		int total_money = order.getTotal_money();
		orderItem.setTotal_money(total_money);
		// 插入到orderItem表中
		orderItemService.addOrderItem(orderItem);
		return order;
	}

	//订单查询操作
	@RequestMapping("orderQuery")
	public void orderQuery(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CustomerDeve customerDeve = (CustomerDeve) req.getSession()
				.getAttribute("customerDeveInfo");
		// 查询order
		List<Order> order = orderService.findAllOrderByCustomerId(customerDeve
				.getId());
		if(order.size()==0){
			req.getSession().setAttribute("order", null);	
		}else{
			//保存在request域中
			req.getSession().setAttribute("order", order);
		}
		
		/* 进行分页 */
		//一页的商品条数
		// 获取总商品的条数
		int orderCount = orderService.findCount(customerDeve.getId());
		SomeUtils.paging(orderCount, 3, req, resp);
		
		req.getRequestDispatcher("dingdanzhongxin.jsp").forward(req, resp);
		//移除开始的session
		req.removeAttribute("beginProduct");
	}
	
	//删除订单
	@RequestMapping("deleteOrder")
	public void deleteOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		Order order = (Order) req.getSession().getAttribute("orderItemOrder");
		orderService.deleteById(order.getId());
		//删除orderitem（订单详细信息）
		orderItemService.deleteOrderItemByOrderId(order.getId());
		req.getRequestDispatcher("orderQuery.action").forward(req, resp);
		
	}
	
	//从购物车加入的订单
	@RequestMapping("addShopOrder")
	public void addShopOrder(HttpServletRequest req, HttpServletResponse resp) throws ParseException, ServletException, IOException{
		
		//获取传递过来的shopid
		String shopId = req.getParameter("shopId");
		//根据shopid进行购物车的查询
		String[] a = shopId.split(",");//分割
		for (int i = 0; i < a.length; i++) {
			//查询shop
			Shop shop=shopService.findShopById(Integer.parseInt(a[i]));
			//order赋值操作
			Order order = new Order();
			// 创建订单编号 时间+4位随机数
			String orderno = "" + Calendar.getInstance().getTimeInMillis() + ""
					+ (1000 + new Random().nextInt(9000));
			order.setOrder_no(orderno);
			// 创建提交订单时间
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
			Date submit_date = df.parse(df.format(new Date()));
			order.setSubmit_date(submit_date);
			// 创建订单状态
			int status = 1;
			order.setStatus(status);
			//设置收货地址id
			order.setAddress_id(shop.getAddress_id());
			//设置用户的id
			order.setCustomer_id(shop.getCustomer_id());
			//设置图片属性
			order.setProduct_img(shop.getProduct_img());
			//设置商品付款的价格
			order.setTotal_money(shop.getTotal_money());
			
			//order添加
			orderService.addOrder(order);
			int order_id = order.getId();
			/*int order_id = orderService.findNowId();*/
			// 新建orderItme对象
			Orderitem orderItem = new Orderitem();
			// 设置相关信息
			orderItem.setOrder_id(order_id);
			orderItem.setProduct_id(shop.getProduct_id());
			orderItem.setSale_number(shop.getBuy_number());
			orderItem.setSale_price(shop.getPrice());
			orderItem.setTotal_money(shop.getTotal_money());
			// 插入到orderItem表中
			orderItemService.addOrderItem(orderItem);
			
			//删除界面购物车中的内容
			shopService.deleteShopById(Integer.parseInt(a[i]));
		}
		req.getRequestDispatcher("shopQuery.action").forward(req, resp);
		
	}
	
}
