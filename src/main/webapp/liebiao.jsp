<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>小米手机列表</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
		<%@include file="header.jsp" %>
		<div class="danpin center">
			
			<div class="biaoti center">手机精品</div>
			<center>
			<div class="moreProduct">
			
			 <c:forEach var="productAll" items="${ productAll}" begin="${beginProduct}" end="${endProduct}">
			
				<div class="mproduct" onclick="window.location.href='productshow.action?id=${productAll.id}'">
				 <div class="sonProduct">
					<img width="160" height="160" alt="" src="/img/${productAll.picture_file}">
					<p><span>${productAll.product_name }</span>
					<p><span style="color: gray; font-size: 10px;">${productAll.description}</span>
					<p><span><font color="#ff8000250250250">${productAll.sale_price }.00元</font></span>
				</div>
				</div>
			</c:forEach>
			
				
				<div class="clear"></div>
			</div> 
			</center>
			<div class="clear"></div>
		</div>
		
		
		<div class="pageCss center">
		<div class="scss">
		<span>共<font style="color: red;">${ count}</font>条记录</span><span>共<font style="color: red;">${ totalpage}</font>页</span><span>当前页：第<font style="color: red;">${ pageNo}</font>页</span>
		</div>
		
		<div class="acss">
		<a href="?pageNo=1">首页</a>
		<a href="?pageNo=${pageNo-1}">上一页</a>
		<a href="?pageNo=${pageNo+1}">下一页</a>
		<a href="?pageNo=${totalpage}">尾页</a>
		</div>
		</div>
		<div class="clear"></div>
		

	<%@include file="footer.jsp" %>

	<!-- end danpin -->


	</body>
</html>