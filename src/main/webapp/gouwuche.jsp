
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
				<div class="ddzxbt">我的购物车</div>
				<c:if test="${shop!=null }">
					<div class="shop">
						<p>
							<span><input type="checkbox" id="allCheck">全选</span> <span
								style="width: 200px;">商品名称</span> <span>商品数量</span> <span>商品单价</span>
							<span>小计</span>


							<c:forEach items="${shop }" var="shop" begin="${beginProduct}" end="${endProduct}">
								<p>
									<span><input type="checkbox" name="xuanze" id="xuanze"
										value="${shop.id }"></span> <span style="width: 200px;">${shop.product_name }</span>
									<span>${shop.buy_number }件</span> <span>${shop.price }.00元</span>
									<span>${shop.total_money }.00元</span>
									<%--<a href="deleteShop.action?shopId=${shop.id }" onclick="return confirm('你确定要删除吗？')"><span>删除</span></a> --%>
							</c:forEach>
					</div>
					<div class="shopPageCss">
					
					<div class="shopACss">
								<a href="?pageNo=1" style="marginmargin-top: 12px;">首页</a> <a href="?pageNo=${pageNo-1}">上一页</a>
								<a href="?pageNo=${pageNo+1}">下一页</a> <a
									href="?pageNo=${totalpage}">尾页</a>
					</div>			
					<div class="shopSpanCss">			
								<span>共<font style="color: red;">${ count}</font>条记录
								</span><span>共<font style="color: red;">${ totalpage}</font>页
								</span><span>当前页：第<font style="color: red;">${ pageNo}</font>页
								</span>
					</div>
					<div class="buyAgain">
						<a href="moreProduct.action">继续购物</a><span><%-- </span>共<font color="red">${shopCount}</font>件商品
						
					，已选择<font
						color="red" id="checkCount">0</font>件
					</span><span>合计:<font color="red"
						style="font-weight: bold; font-size: 25px;">${allMoney }.00</font>元
					</span> --%>
					</div>		
					</div>		
					<div class="clear"></div>
						
	
					<div class="doSomeCss">
							<input class="shopb" type="button" value="去结算" onclick="doAdd()">
							<input class="shopb" type="button" value="删除"
								onclick="deleteShop()">

					</div>
				</c:if>
				<c:if test="${shop==null }">
					<div class="noaddress">
						<span>你还没用添加商品到购物车！</span>
					</div>
				</c:if>


			</div>
			<div class="clear"></div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>
<script type="text/javascript" src="js/jquery-1.4.4.min.js">
	
</script>
<script type="text/javascript">
	//全选时间点击操作
	//获取全选
	var allCheck = document.getElementById("allCheck");
	//获取单选
	var checks = document.getElementsByName("xuanze");

	//全选点击操作
	allCheck.onclick = function() {
		//判断是否全部选择
		var isCheck = $("#allCheck").is(":checked");
		if (isCheck) {//选中状态
			for (var i = 0; i < checks.length; i++) {
				checks[i].checked = true;
				//var checkCount = $("input[type='checkbox']:checked").length - 1;
				//$("#checkCount").html(checkCount);
			}
		} else {
			for (var i = 0; i < checks.length; i++) {
				checks[i].checked = false;
				//$("#checkCount").html("0");
			}
		}
	}

	//删除购物车商品的操作
	function deleteShop() {
		var check_val = [];
		for (k in checks) {
			if (checks[k].checked)
				check_val.push(checks[k].value);
		}
		//判断是否选择了商品
		if (check_val == '' || check_val == null) {
			alert("请选择要删除的商品！");
		} else {
			var con = confirm("你确定要删除吗？")
			if (con) {
				window.location.href = "deleteShop.action?shopId=" + check_val;
			}
		}

	}
	
	//添加商品到订单中
	function doAdd(){
		var check_val = [];
		for (k in checks) {
			if (checks[k].checked)
				check_val.push(checks[k].value);
		}
		//判断是否选择了商品
		if (check_val == '' || check_val == null) {
			alert("请选择要购买的商品！");
		} else {
			
				window.location.href = "addShopOrder.action?shopId=" + check_val;
			
		}
	}
	
	
	

	//改变购买数量操作
	/* function changeNumber(shopId, number) {
		var buyNumber = document.getElementById("buyNumber").innerText;
		buyNumber = parseInt(buyNumber) + parseInt(number);
		$("#buyNumber").html(parseInt(buyNumber));
		
	} */
	//用来测试。
	/* function text() {

		var obj = document.getElementsByName("xuanze");
		var check_val = [];
		for (k in obj) {
			if (obj[k].checked)
				check_val.push(obj[k].value);
		}
		alert(check_val);
		//window.location.href="index.jsp";

	} */
</script>