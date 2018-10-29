<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>团购订单</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
		<%@include file="header.jsp" %>
	
	<div class="grzxbj">
		<div class="selfinfo center">
		<%@include file="left.jsp" %>
		<form action="edit_info.jsp">
		<div class="rtcont fr">
			<div class="grzlbt ml40">我的订单</div>
			<div class="myMesCss"><a href="">全部有效订单</a><a href="">待支付</a><a href="">待收货</a><a href="">待关闭</a></div>
			<hr style="height: 1px; border: none; border-top: 1px solid #ddd; margin-top: 10px;border-bottom: 1px solid rgba(255, 255, 255, 0.3);" />
			<div class="myMesSpan"><span>当前没有交易订单</span></div>
		</div>
		</form>
		<div class="clear"></div>
		</div>
	</div>
		
	<%@include file="footer.jsp" %>
	</body>
</html>