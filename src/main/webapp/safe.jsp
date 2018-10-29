<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>意外保</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
		<%@include file="header.jsp" %>
	
	<div class="grzxbj">
		<div class="selfinfo center">
		<%@include file="left.jsp" %>
		<form action="edit_info.jsp">
		<div class="rtcont fr">
			<div class="grzlbt ml40">我的手机意外保障服务</div>
			<span class="mobileSafe">您尚未购买手机意外保障服务</span>
			<div class="outMobile">
			<div class="mobileCss">
			<img alt="" src="image/mobileSafe.png">
			</div>
			<div class="safeZiCss">
				<p><img alt="" src="image/gou.png">原厂配件保证
				<p><img alt="" src="image/gou.png">一年内免费维修
				<p><img alt="" src="image/gou.png">自助报修，运费报销
			</div>
			</div>
		</div>
		</form>
		<div class="clear"></div>
		</div>
	</div>
		
	<%@include file="footer.jsp" %>
	</body>
</html>