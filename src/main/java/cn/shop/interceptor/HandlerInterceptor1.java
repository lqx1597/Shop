package cn.shop.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor1 implements HandlerInterceptor{
	
	
	//在方法之前执行
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if((int)request.getSession().getAttribute("addressLength")>=5){
			return false;
		}else{
			return true;
		}
		
	}
	
	//在方法之后，返回modelandview之前执行
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		/*HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);*/
	}
	
	//异常处理
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		/*HandlerInterceptor.super.afterCompletion(request, response, handler, ex);*/
	}
	
}
