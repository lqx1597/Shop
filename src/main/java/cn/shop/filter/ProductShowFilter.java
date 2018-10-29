package cn.shop.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ProductShowFilter extends HttpFilter {
	
	
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		req.getRequestDispatcher("productQuery.action").forward(req, resp);
		chain.doFilter(req, resp);
	}

}
