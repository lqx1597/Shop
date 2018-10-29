package cn.shop.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginFilter extends HttpFilter{

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("denglu过滤器");
		String userName = null;
		String passWord = null;
		//获取cookies
		Cookie[] cookies = req.getCookies();
		//遍历cookies
		if(cookies!=null&& cookies.length > 0){
		for (Cookie c : cookies) {
			
				if(c.getName().equals("userName")){
					userName = c.getValue();
				}
				if(c.getName().equals("passWord")){
					passWord = c.getValue();
					System.out.println(passWord);
				}
		}
		}
		req.getSession().setAttribute("userName", userName);
		req.getSession().setAttribute("passWord", passWord);
		chain.doFilter(req, resp); 
	}
}
