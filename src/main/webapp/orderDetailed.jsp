
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="order by dede58.com" />
<title>小米商城-个人中心</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>

	<%@include file="header.jsp"%>

	<div class="grzxbj">
		<div class="selfinfo center">
			<%@include file="left.jsp"%>
			<div class="rtcont fr">
				<div class="ddzxbt">交易订单>${orderItemOrder.order_no }</div>
				<div class="orderDetailed">
					<p><span>订单号:</span><span>${orderItemOrder.order_no }</span>
					<p><span>商品名称:</span><span>${orderItemProduct.product_name}</span>
					<p><span>商品总价:</span><span>${orderItem.total_money }</span>
					<p><span>商品数量:</span><span>${orderItem.sale_number }</span>
					<p><span>订单状态:</span><span>已发货</span>
					<p><span>下单时间：</span><span><fmt:formatDate value="${orderItemOrder.submit_date }"
											pattern="yyyy/MM/dd HH:mm:ss" /></span>
					<p><span>收货人:</span><span>${orderItemAddress.acceptor_name }</span>
					<p><span>收货地址:</span><span>${orderItemAddress.province }${orderItemAddress.city }${orderItemAddress.county }${orderItemAddress.street }</span>
					<p><span>联系电话:</span><span>${orderItemAddress.acceptor_mobile }</span>
					<center>
					<a href="deleteOrder.action"><input type="button" value="删除订单" onclick="return confirm('您确定要删除吗？')"> </a>
					</center>
				</div>

			</div>
			<div class="clear"></div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>