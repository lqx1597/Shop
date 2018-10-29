<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<header>
	<div class="top center">
		<div class="left fl">
			<ul>
				<li><a href="index.jsp" >天亦商城</a></li>
				<li>|</li>
				<li><a href="">TIYI</a></li>
				<li>|</li>
				<li><a href="">聊天</a></li>
				<li>|</li>
				<li><a href="">游戏</a></li>
				<li>|</li>
				<li><a href="">多看阅读</a></li>
				<li>|</li>
				<li><a href="">云服务</a></li>
				<li>|</li>
				<li><a href="">金融</a></li>
				<li>|</li>
				<li><a href="">天亦商城移动版</a></li>
				<li>|</li>
				<li><a href="">问题反馈</a></li>
				<li>|</li>
				<li><a href="">Select Region</a></li>
				<div class="clear"></div>
			</ul>
		</div>
		<div class="right fr">
			
			<c:if test="${customerDeveInfo!=null }">
			<div class="gouwuche fr">
				<a href="shopQuery.action">购物车</a>
			</div>
			<div class="fr">
				<ul>
					<li><a href="self_info.jsp
					" >${customerDeveInfo.user_name}</a></li>
					<li>|</li>
					<li><a href="orderQuery.action" >我的订单</a></li>
					<li>|</li>
					<li><a href="myMes.jsp">消息通知</a></li>
					<li>|</li>
					<li><a href="exit.action">退出登录</a></li>
				</ul>
			</div>
			</c:if>
			<c:if test="${ customerDeveInfo==null}">
			<div class="gouwuche fr">
				<a href="login.jsp">购物车</a>
			</div>
			<div class="fr">
				<ul>
					<li><a href="login.jsp" >登录</a></li>
					<li>|</li>
					<li><a href="./register.jsp" >注册</a></li>
					<li>|</li>
					<li><a href="login.jsp">消息通知</a></li>
				</ul>
			</div>
			
			</c:if>
			
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
	</div>
	</header>
	<div class="banner_x center">
			<a href="./index.jsp" target="_blank"><div class="logo fl"></div></a>
			<a href=""><div class="ad_top fl"></div></a>
			<div class="nav fl">
				<ul>
					<li><a href="moreProduct.action">手机</a></li>
					<li><a href="moreProduct.action">配件</a></li>
					<li><a href="moreProduct.action">平板·笔记本</a></li>
					<li><a href="moreProduct.action">电视</a></li>
					<li><a href="moreProduct.action">盒子·影音</a></li>
					<li><a href="moreProduct.action">路由器</a></li>
					<li><a href="moreProduct.action">智能硬件</a></li>
					<li><a href="moreProduct.action">服务</a></li>
					<li><a href="moreProduct.action">社区</a></li>
				</ul>
			</div>
			<div class="search fr">
				<form action="findProduct.action" method="post">
					<div class="text fl">
						<input type="text" class="shuru" name="keyWord" placeholder="小米6&nbsp;小米MIX现货">
					</div>
					<div class="submit fl">
						<input type="submit" class="sousuo" value="搜索"/>
					</div>
					<div class="clear"></div>
				</form>
				<div class="clear"></div>
			</div>
		</div>
</body>
</html>