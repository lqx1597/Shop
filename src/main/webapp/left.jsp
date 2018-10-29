<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${customerDeveInfo==null}">
	<script type="text/javascript">
	alert("请您先登录！");
	window.location.href="login.jsp"
	</script>
	
	</c:if>
			<div class="lfnav fl">
				<div class="ddzx">订单中心</div>
				<div class="subddzx">
					<ul>
						<li><a href="./dingdanzhongxin.jsp">我的订单</a></li>
						<li><a href="safe.jsp">意外保</a></li>
						<li><a href="tuangou.jsp">团购订单</a></li>
						<li><a href="orderAss.jsp">评价晒单</a></li>
					</ul>
				</div>
				<div class="ddzx">个人中心</div>
				<div class="subddzx">
					<ul>
						<li><a href="./self_info.jsp">我的个人中心</a></li>
						<li><a href="myMes.jsp">消息通知</a></li>
						<li><a href="youhui.jsp">优惠券</a></li>
						<li><a href="myaddress.action">收货地址</a></li>
					</ul>
				</div>
			</div>
</body>
</html>