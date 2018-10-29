<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>我的优惠券</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
		<%@include file="header.jsp" %>
	
	<div class="grzxbj">
		<div class="selfinfo center">
		<%@include file="left.jsp" %>
		<form action="edit_info.jsp">
		<div class="rtcont fr">
			<div class="grzlbt ml40">我的优惠券</div>
			<div class="myMesCss"><a href="">未使用</a><a href="">已使用</a><a href="">已失效</a></div>
			<hr style="height: 1px; border: none; border-top: 1px solid #ddd; margin-top: 10px;border-bottom: 1px solid rgba(255, 255, 255, 0.3);" />
			<div class="myMesSpan"><span>未找到相应优惠券。</span>
			<span style="width: 500px;">参加天亦社区活动，微博、微信活动即有机会赢优惠券哦~</span></div>
		</div>
		</form>
		<div class="clear"></div>
		</div>
	</div>
		
	<%@include file="footer.jsp" %>
	</body>
</html>