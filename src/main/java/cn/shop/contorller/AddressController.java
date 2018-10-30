package cn.shop.contorller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shop.po.CustomerDeve;
import cn.shop.po.Customeraddress;
import cn.shop.service.CustomerAddressService;

@Controller
public class AddressController {
	@Autowired
	private CustomerAddressService customerAddressService;
	
	@RequestMapping("myaddress")
	public String findCustmerAddress(HttpServletRequest req,Model model) throws IOException, ServletException{
		
		//接受用户的信息
		CustomerDeve customerDeve = (CustomerDeve) req.getSession().getAttribute("customerDeveInfo");
		//根据用户ID查询收货地址
		List<Customeraddress> address = customerAddressService.findAddressByCustomerId(customerDeve.getId());
		if(address.isEmpty()){
			model.addAttribute("myaddress", null);
		}else{
			int addressSize = address.size();
			model.addAttribute("myaddress", address);
			model.addAttribute("addressSize", addressSize);
		}
		return "myaddress";
		
	}
	
	//添加地址
	//ajax获取去数据
	@RequestMapping("addAddress")
	public @ResponseBody Customeraddress addAddress(Customeraddress customerAddress){
		//添加地址操作
		customerAddressService.addAddress(customerAddress);
		return customerAddress;
	}
	
	
	
	
	
	//删除收货地址
	@RequestMapping("deleteAddress")
	public void deleteAddress(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException{
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		int addressId = Integer.parseInt(req.getParameter("addressId"));
		customerAddressService.deleteAddress(addressId);
		SomeUtils.alertMes(req, resp, "删除成功！", "myaddress.action");
		
	}
	//修改收货地址之前
	@RequestMapping("editAddressBefore")
	public void editAddress(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException{
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		int addressId = Integer.parseInt(req.getParameter("addressId"));
		//获取还没修改之前的信息
		Customeraddress oldCustomerAddress = customerAddressService.findAddressByAddressId(addressId);
		req.getSession().setAttribute("oldCustomerAddress", oldCustomerAddress);
		req.getRequestDispatcher("editAddress.jsp").forward(req, resp);
	
	}
	//修改收货地址
	@RequestMapping("editAddress")
	public @ResponseBody Customeraddress editAddress(Customeraddress newCustomerAddress){
		//添加地址操作
		customerAddressService.updateAddress(newCustomerAddress);
		return newCustomerAddress;
	}
}
