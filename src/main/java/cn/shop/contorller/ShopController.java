package cn.shop.contorller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shop.po.CustomerDeve;
import cn.shop.po.Shop;
import cn.shop.service.ShopService;

//购物车
@Controller
public class ShopController {
	@Autowired
	private ShopService shopService;

	// 添加到购物车
	@RequestMapping("goShop")
	public @ResponseBody Shop goShop(Shop shop, HttpServletRequest req)
			throws ParseException {
		shopService.addShop(shop);
		return shop;
	}

	// 查询购物车
	@RequestMapping("shopQuery")
	public void shopQuery(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		CustomerDeve customerDeve = (CustomerDeve) req.getSession()
				.getAttribute("customerDeveInfo");
		List<Shop> shop = shopService.findByCustomerId(customerDeve.getId());
		if (shop.size() == 0) {
			req.getSession().setAttribute("shop", null);
		} else {
			req.getSession().setAttribute("shop", shop);
		}
		
		int shopCount = shopService.findCount(customerDeve.getId());
		//调用分页方法
		SomeUtils.paging(shopCount,5, req, resp);
		
		req.getRequestDispatcher("gouwuche.jsp").forward(req, resp);
		req.getSession().removeAttribute("beginProduct");
	}

	// 删除购物车的商品
	@RequestMapping("deleteShop")
	public void deleteShop(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 获取传过来的shopid
		// 进行批量删除操作
		String shopId = req.getParameter("shopId");

		String[] a = shopId.split(",");
		for (int i = 0; i < a.length; i++) {
			// 删除
			shopService.deleteShopById(Integer.parseInt(a[i]));

		}

		req.getRequestDispatcher("shopQuery.action").forward(req, resp);
	}

}
