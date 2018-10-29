
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
				<div class="ddzxbt">交易订单</div>
				<div class="order">
					<c:if test="${order!=null}">
						<c:forEach items="${order}" var="order" begin="${beginProduct}" end="${endProduct}">
							<div class="ddxq">
								<div class="ddspt fl">
									<img src="/img/${order.product_img}" width="85" height="85"
										alt="">
								</div>
								<div class="ddbh fl">订单号:${order.order_no}</div>
								<div class="ztxx fr">
									<ul>
										<c:if test="${order.status==1}">
											<li>已发货</li>
										</c:if>
										<c:if test="${order.status!=1}">
											<li>未发货</li>
										</c:if>
										<li>${order.total_money}</li>
										<li><fmt:formatDate value="${order.submit_date }"
												pattern="yyyy/MM/dd HH:mm:ss" /></li>
										<li><a href="orderItemQuery.action?order_id=${order.id}">订单详情></a></li>
										<div class="clear"></div>

									</ul>
								</div>

								<div class="clear"></div>
							</div>
						</c:forEach>
						
						<div class="clear"></div>
					</c:if>
					<c:if test="${order==null}">
						<div class="noaddress">
							<span>您还没有订单！</span>
						</div>
					</c:if>
				</div>
				<div class="orderPagecss">
							<div class="scss">
								<span>共<font style="color: red;">${count}</font>条记录
								</span><span>共<font style="color: red;">${ totalpage}</font>页
								</span><span>当前页：第<font style="color: red;">${ pageNo}</font>页
								</span>
							</div>
							<div class="acss">
								<a href="?pageNo=1" style="marginmargin-top: 12px;">首页</a> <a href="?pageNo=${pageNo-1}">上一页</a>
								<a href="?pageNo=${pageNo+1}">下一页</a> <a
									href="?pageNo=${totalpage}">尾页</a>
							</div>
							
						</div>
			</div>
			<div class="clear"></div>
		</div>

	</div>
	<%@include file="footer.jsp"%>
</body>
</html>