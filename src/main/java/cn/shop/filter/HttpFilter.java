package cn.shop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class HttpFilter
 */
@WebFilter("/HttpFilter")
public class HttpFilter implements Filter {

    private FilterConfig filterConfig;
    public FilterConfig getFilterConfig(){
    	return this.filterConfig;
    }
    public HttpFilter() {
    }

	public void destroy() {
	}

	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		doFilter((HttpServletRequest)req,(HttpServletResponse)resp,chain);
	}
	//覆盖
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)throws IOException, ServletException { 
		
	}
	public void init(FilterConfig config) throws ServletException {
		this.filterConfig = config;
		init();
	}
	//初始化
	protected void init(){
		
	}

}
