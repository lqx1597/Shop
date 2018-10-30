package cn.shop.contorller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.shop.po.Customer;
import cn.shop.po.CustomerDeve;
import cn.shop.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	// 进行登录验证
	@RequestMapping("/checkLogin")
	public String checklogin(HttpServletRequest req, HttpServletResponse resp,
			@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("userCode")String userCode)
			throws ServletException, IOException {
		// 设置字符编码格式
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");

		// 判断验证码
		// 获取系统生成的验证码
		String sysCode = (String) req.getSession().getAttribute("sysCode");
		// 获取用户输入的验证码

		if (sysCode.equals(userCode)) {
			// 检查用户名与密码
			CustomerDeve customerDeve = customerService.check(username, password);
			if (customerDeve != null) {
				// 设置cookie用于下次登录时填充
				Cookie userName = new Cookie("userName", username);
				Cookie passWord = new Cookie("passWord", password);
				// 设置cookie的有效期为7天
				userName.setMaxAge(60 * 60 * 24 * 7);
				passWord.setMaxAge(60 * 60 * 24 * 7);
				// 添加到cookie中
				resp.addCookie(userName);
				resp.addCookie(passWord);
				//将用户信息保存到session中
				req.getSession().setAttribute("customerDeveInfo", customerDeve);
				
				//弹出窗口
				req.getSession().setAttribute("loginMsg", "登录成功！");
				//重定向到首页
				return "forward:productQuery.action";
				
			} else {
				
				req.getSession().setAttribute("loginMsg", "用户名或密码错误！");
				return "login";
			}
		} else {
			
			req.getSession().setAttribute("loginMsg", "验证码有误！");
			return "login";
		}

	}

	// 退出登录
	@RequestMapping("exit")
	public void exitLogin(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {

		req.getSession().removeAttribute("customerDeveInfo");
		req.getRequestDispatcher("productQuery.action").forward(req, resp);
	}

	// 用户注册
	@RequestMapping("register")
	public void register(HttpServletRequest req, HttpServletResponse resp,Customer customer,@RequestParam("userCode")String userCode)
			throws IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		// 创建对象
		CustomerDeve customerDeve = new CustomerDeve();
		
		//将获取到的用户信息添加到session中保存以便出错时返回数据免得用户再次输入，密码安全性较高除外
		req.getSession().setAttribute("regCus", customer);
		// 判断验证码
		// 获取系统生成的验证码
		String sysCode = (String) req.getSession().getAttribute("sysCode");
		// 获取用户输入的验证码
		if (sysCode.equals(userCode)) {
			// 判断数据库中是否存在此人
			CustomerDeve sameCus = customerService.findByName(customer.getUser_name());
			// 判断数据库中是否存在相同的电话号码
			CustomerDeve sameMobil = customerService.findMobile(customer.getMobile(), null);
			
			if (sameCus != null) {// 存在此人
				//弹出对话框信息及跳转页面
				SomeUtils.alertMes(req, resp, "该用户已经被注册!", "register.jsp");
			} else if (sameMobil != null) { // 不存在
				SomeUtils.alertMes(req, resp, "该手机号已经被注册!", "register.jsp");
			} else {
				customerDeve.setUser_name(customer.getUser_name());
				customerDeve.setPassword(customer.getPassword());
				customerDeve.setMobile(customer.getMobile());
				customerService.insert(customerDeve);
				SomeUtils.alertMes(req, resp, "注册成功！", "login.jsp");
			}

		} else {// 验证码不相等
			SomeUtils.alertMes(req, resp, "验证码有误!", "register.jsp");
		}

	}

	@RequestMapping("editInfo")
	public void editInfo(HttpServletRequest req, HttpServletResponse resp,Customer customer) throws IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		//获取用户id
		CustomerDeve old = (CustomerDeve) req.getSession().getAttribute("customerDeveInfo");
		//检查是否有重复
		CustomerDeve sameMobil = customerService.findMobile(customer.getMobile(), old.getId());
		CustomerDeve sameEmail = customerService.findEmail(customer.getEmail(),old.getId());
		if(sameMobil!=null) {
			SomeUtils.alertMes(req, resp, "该手机号已经被注册！", "edit_info.jsp");
		}else if(sameEmail!=null) {
			SomeUtils.alertMes(req, resp, "该邮箱已经被注册！", "edit_info.jsp");
		}else {
			// 设置修改信息
			CustomerDeve customerDeve = new CustomerDeve();
			customerDeve.setUser_name(customer.getUser_name());
			customerDeve.setReal_name(new String(customer.getReal_name().getBytes("iso-8859-1"), "utf-8"));
			customerDeve.setEmail(customer.getEmail());
			customerDeve.setPassword(customer.getPassword());
			customerDeve.setMobile(customer.getMobile());
			customerService.update(customerDeve);

			// 将修改后的信息返回给页面
			CustomerDeve customerDeveInfo = customerService.findByName(customer.getUser_name());
			System.out.println(customerDeveInfo);
			req.getSession().setAttribute("customerDeveInfo", customerDeveInfo);
			SomeUtils.alertMes(req, resp, "修改成功！", "self_info.jsp");
		}
		
		
	}

	// 注册时判断用户名是否存在
	@RequestMapping("checkUserName")
	public void checkUserName(HttpServletResponse resp,@RequestParam("user_name")String user_name) throws IOException {
		System.out.println(user_name);
		// 判断用户名格式是否正确
		CustomerDeve customer = customerService.findByName(user_name);
		if (customer != null) {
			// 用户名存在，用户名不可用
		} else {
			// 用户名不存在，用户名可用
			resp.getWriter().print(true);
		}

	}

	// 检查手机号是否存在
	@RequestMapping("checkUserMobile")
	public void checkUserMobile(HttpServletRequest req, HttpServletResponse resp,@RequestParam("mobile")String mobile) throws IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		//获取用户信息
		CustomerDeve old = (CustomerDeve) req.getSession().getAttribute("customerDeveInfo");
		Integer id;
		if (old == null) {id = null;}
		else {id = old.getId();}
		CustomerDeve customer = customerService.findMobile(mobile, id);
		if (customer != null) {
			// 手机号存在，手机号不可用
		} else {
			// 手机号不存在，手机号可用
			resp.getWriter().print(true);
		}

	}

	// 检查邮箱是否存在
	@RequestMapping("checkUserEmail")
	public void checkUserEmail(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		String email = req.getParameter("email");
		// 判断邮箱是否存在
		//获取用户信息
		CustomerDeve old = (CustomerDeve) req.getSession().getAttribute("customerDeveInfo");
		Integer id;
		if(old==null) {id=null;}
		else {id = old.getId();}
		
		CustomerDeve customer = customerService.findEmail(email,id);
		if (customer!=null) {
			//邮箱存在，邮箱不可用
		} else {
			//邮箱不存在，邮箱可用
			resp.getWriter().print(true);
		}

	}

}
