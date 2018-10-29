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
				System.out.println("条");
				//重定向到首页
				return "forward:productQuery.action";
				
				/*PrintWriter writer = resp.getWriter();
				writer.write("<script>alert('登录成功！');</script>");
				writer.write("<script>window.location.href='index.jsp';</script>");
				writer.close();
				writer.flush();*/

			} else {
				/*PrintWriter writer = resp.getWriter();
				writer.write("<script>alert('用户名或密码错误！');</script>");
				writer.write("<script>window.location.href='login.jsp'</script>");
				writer.close();
				writer.flush();*/
				req.getSession().setAttribute("loginMsg", "用户名或密码错误！");
				return "login";
			}
		} else {
			/*PrintWriter writer = resp.getWriter();
			writer.write("<script>alert('验证码有误！');</script>");
			writer.write("<script>window.location.href='login.jsp';</script>");
			writer.close();
			writer.flush();*/
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
				/*req.getSession().setAttribute("resMsg", "该用户名已经注册！");*/
				/*return "register";*/
				PrintWriter writer = resp.getWriter();
				writer.write("<script>alert('该用户名已经被注册！');</script>");
				writer.write("<script>window.history.back();</script>");
				writer.close();
				writer.flush();
			} else if (sameMobil != null) { // 不存在
				/*req.getSession().setAttribute("resMsg", "该手机号已经注册！");*/
				//return "register";
				PrintWriter writer = resp.getWriter();
				writer.write("<script>alert('该手机号已经被注册！');</script>");
				writer.write("<script>window.history.back();</script>");
				writer.close();
				writer.flush();
			} else {
				customerDeve.setUser_name(customer.getUser_name());
				customerDeve.setPassword(customer.getPassword());
				customerDeve.setMobile(customer.getMobile());
				customerService.insert(customerDeve);
				/*req.getSession().setAttribute("loginMsg", "注册成功！");*/
				//return "login";
				PrintWriter writer = resp.getWriter();
				writer.write("<script>alert('注册成功！');</script>");
				writer.write("<script>window.location.href='login.jsp';</script>");
				writer.close();
				writer.flush();
			}

		} else {// 验证码不相等
			/*req.getSession().setAttribute("resMsg", "验证码有误！");*/
			/*return "register";*/
			PrintWriter writer = resp.getWriter();
			writer.write("<script>alert('验证码有误！');</script>");
			writer.write("<script>window.location.href='register.jsp';</script>");
			writer.close();
			writer.flush();
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
			PrintWriter writer = resp.getWriter();
			writer.write("<script>alert('该手机号已经被注册！');</script>");
			writer.write("<script>window.history.back();</script>");
			writer.close();
			writer.flush();
		}else if(sameEmail!=null) {
			PrintWriter writer = resp.getWriter();
			writer.write("<script>alert('该邮箱已经被注册！');</script>");
			writer.write("<script>window.history.back();</script>");
			writer.close();
			writer.flush();
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
			PrintWriter writer = resp.getWriter();
			writer.write("<script>alert('修改成功！');</script>");
			writer.write("<script>window.location.href='self_info.jsp';</script>");
			writer.close();
			writer.flush();
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
			System.out.println("a");
			//邮箱存在，邮箱不可用
		} else {
			//邮箱不存在，邮箱可用
			System.out.println("b");
			resp.getWriter().print(true);
		}

	}

}
