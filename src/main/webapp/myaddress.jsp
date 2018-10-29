<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; pageEncoding=UTF-8">
<meta name="author" content="order by dede58.com" />
<title>小米商城-个人中心</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<!-- start header -->
	<%@include file="header.jsp"%>
	<!--end header -->
	<!-- start banner_x -->


	<!-- end banner_x -->
	<!-- self_info -->
	<div class="grzxbj">
		<div class="selfinfo center">
			<%@include file="left.jsp"%>
			<!-- <form action="addaddress.jsp" method="post"> -->
				<div class="rtcont fr">
					<div class="grzlbt ml40">收货地址</div>

					<div class="myaddress">
						
						<c:if test="${myaddress!=null }">
						<div class="topinfo">
							<span>收货人</span>
							<span>所在地址</span>
							<span>详细地址</span>
							<span>电话/手机</span>
							<span>操作</span>
						</div>
						<c:forEach items="${myaddress }" var="myaddress">
							<div class="address">
								<span>${myaddress.acceptor_name}</span> 
								<span>${myaddress.province }${myaddress.city }${myaddress.county }</span>
								<span>${myaddress.street }</span> 
								<span>${myaddress.acceptor_mobile}</span>
								<span><a href="editAddressBefore.action?addressId=${ myaddress.id}">修改</a>|<a href="deleteAddress.action?addressId=${ myaddress.id}" onclick="return confirm('您确认要删除么?')">删除</a></span>
							</div>
						</c:forEach>
						</c:if>
						<c:if test="${myaddress==null }">
						<div class="noaddress">
						<span>您还没有收货地址！</span>
						</div>
						</c:if>
						
					</div>

					<div class="editCustom">
						<button type="submit" onclick="checkNumber()">添加新地址</button>
					</div>
				</div>
		<!-- 	</form> -->
			<div class="clear"></div>
		</div>
	</div>
	<!-- self_info -->

	<%@include file="footer.jsp"%>
</body>
</html>
<script src="js/jquery-1.4.4.min.js"></script>
<script>

	//判断用户的收货地址个数
	function checkNumber(){
		var addressSize = "${addressSize}";
		if(addressSize>=5){
			alert("收货地址最多只能有5个")
		}else{
			window.location.href="addaddress.jsp";
		}
	}

</script>

