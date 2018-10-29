<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="order by dede58.com" />
<title>小米6立即购买-小米商城</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<!-- start header -->
	<%@include file="header.jsp"%>
	<form action="post" method="">
		<div class="xiangqing">
			<div class="neirong w">
				<div class="xiaomi6 fl">${product.product_name}</div>
				<nav class="fr">
				<li><a href="">概述</a></li>
				<li>|</li>
				<li><a href="">变焦双摄</a></li>
				<li>|</li>
				<li><a href="">设计</a></li>
				<li>|</li>
				<li><a href="">参数</a></li>
				<li>|</li>
				<li><a href="">F码通道</a></li>
				<li>|</li>
				<li><a href="">用户评价</a></li>
				<div class="clear"></div>
				</nav>
				<div class="clear"></div>
			</div>
		</div>

		<div class="jieshao mt20 w">
			<div class="left fl">
				<img width=560 height="560" src="/img/${product.picture_file}">
			</div>
			<div class="right fr">
				<div class="h3 ml20 mt20">${product.product_name}</div>
				<div class="jianjie mr40 ml20 mt10">${product.description}</div>
				<div class="jiage ml20 mt10">${product.sale_price}.00元</div>

				<c:if test="${customerDeveInfo==null}">
					<div class="ml20">收货地址：您还未登陆！</div>

				</c:if>
				<c:if test="${customerDeveInfo!=null}">
					<div class="customerAddress">
						<span class="ml20">收货地址：</span>
						<c:if test="${customerAddress!=null}">
							<select id="customerAddress_id">
								<c:forEach items="${customerAddress }" var="customerAddress">
									<option value="${customerAddress.id }">${customerAddress.province }${customerAddress.city }${customerAddress.county }${customerAddress.street }
									</option>

								</c:forEach>
							</select>
						</c:if>
						<c:if test="${customerAddress==null}">
							<div class="ml20">
								你还没有收货地址！<a href="addaddress.jsp"><font color="red">点击添加</font></a>
							</div>
						</c:if>
					</div>
				</c:if>

				<div class="ft20 ml20 mt20">选择版本</div>
				<div class="xzbb ml20 mt10">
					<div class="banben fl">
						<a> <span>全网通版 6GB+64GB </span> <span>2499元</span>
						</a>
					</div>
					<div class="banben fr">
						<a> <span>全网通版 6GB+128GB</span> <span>2899元</span>
						</a>
					</div>
					<div class="clear"></div>
				</div>
				<div class="ft20 ml20 mt20">选择颜色</div>
				<div class="xzbb ml20 mt10">
					<div class="banben">
						<a> <span class="yuandian"></span> <span class="yanse">亮黑色</span>
						</a>
					</div>

				</div>
				<div class="xqxq mt20 ml20">
					<div class="top1 mt10">
						<div class="left1 fl">小米6 全网通版 6GB内存 64GB 亮黑色</div>
						<div class="right1 fr">2499.00元</div>
						<div class="clear"></div>
					</div>
					<div class="bot mt20 ft20 ftbc">总计：${product.sale_price}.00元</div>
				</div>
				<div class="xiadan ml20 mt20">
					<input class="jrgwc" type="button" name="buy" value="立即选购"
						onclick="gobuy()" />
					<!-- </a> -->
					<input class="jrgwc" type="button" name="addshopcat" value="加入购物车"
						onclick="goShop()" />

				</div>
			</div>
			<div class="clear"></div>
		</div>
	</form>
	<div class="clear"></div>
	<!-- footer -->
	<%@include file="footer.jsp"%>

</body>
</html>
<
<script type="text/javascript" src="js/jquery-1.4.4.min.js">
	
</script>
<script type="text/javascript">
	function gobuy() {
		//判断用户是否登录
		if ("${customerDeveInfo}" == null || "${customerDeveInfo}" == '') {
			alert("请您先登录!");
			return false;
		} else {
			//判断用户是否有地址	
			var checkAddress = "${customerAddress}";
			if (checkAddress == null || checkAddress == '') {
				alert("您还没有收货地址！")
				return false;
			}
			//获取地址信息，先获取select的id
			var customerAddress_id = document
					.getElementById("customerAddress_id");
			//获取select选中的索引
			var customerAddress_index = customerAddress_id.selectedIndex;
			//获取value中的值
			var address_id = customerAddress_id.options[customerAddress_index].value;
			//获取地址信息
			//var customerAddress = customerAddress_id.options[customerAddress_index].text;

			var con = confirm("您确定要购买吗");

			if (con) {
				var product_name = "${product.product_name}";
				$
						.ajax({
							type : 'post',
							url : '${pageContext.request.contextPath }/goOrder.action?product_id=${product.id}',
							data : {
								customer_id : "${customerDeveInfo.id}",
								total_money : "${product.sale_price}",
								address_id : address_id,
								product_img : "${product.picture_file}"
							},
							success : function(data) {//返回json结果
								alert("购买成功！");
							}

						});

			} else {
				alert("取消购买")
			}

		}//end else

	}

	//加入购物车
	function goShop() {
		//判断用户是否登录
		if ("${customerDeveInfo}" == null || "${customerDeveInfo}" == '') {
			alert("请您先登录!");
			return false;
		} else {
			//判断用户是否有地址	
			var checkAddress = "${customerAddress}";
			if (checkAddress == null || checkAddress == '') {
				alert("您还没有收货地址！")
				return false;
			}
			//获取地址信息，先获取select的id
			var customerAddress_id = document
					.getElementById("customerAddress_id");
			//获取select选中的索引
			var customerAddress_index = customerAddress_id.selectedIndex;
			//获取value中的值
			var address_id = customerAddress_id.options[customerAddress_index].value;
			//获取地址信息
			//var customerAddress = customerAddress_id.options[customerAddress_index].text;

			$.ajax({
						type : 'post',
						url : '${pageContext.request.contextPath }/goShop.action',
						data : {
							product_img:"${product.picture_file}",
							buy_number:1,
							product_name:"${product.product_name}",
							customer_id : "${customerDeveInfo.id}",
							price : "${product.sale_price}",
							total_money : "${product.sale_price}",
							address_id : address_id,
							product_id:"${product.id}"
						},
						success : function(data) {//返回json结果
							alert("添加成功！");
						}

					});

		}//end else

	}
</script>