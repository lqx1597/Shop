<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>会员登录</title>
		<link rel="stylesheet" type="text/css" href="./css/login.css">
		
	</head>
	<body>
	
	<c:if test="${loginMsg!=null}">
	<script type="text/javascript">
	alert("${loginMsg}");
	</script>
	<!-- 移除loginMsg -->
	<% request.getSession().removeAttribute("loginMsg"); %>
	</c:if>
	
		<!-- login -->
		<a href="./index.jsp">
		<div class="top center" style="padding-top: 20px;">
			<div class="logo center">
				<img src="./image/aa.jpg" alt="" width="55" height="55" ><span style="margin-top: 10px;"><font style="font-size: 30px;">天亦商城</font></span>
			</div>
			
		</div>
		</a>
		<form  method="post" action="checkLogin.action" class="form center">
		<div class="login">
			<div class="login_center">
				<div class="login_top">
					<div class="left fl">会员登录</div>
					<div class="right fr">您还不是我们的会员？<a href="./register.jsp" target="_self">立即注册</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				<div class="login_main center">
					<div class="username">用户名:&nbsp;
					<c:if test="${userName!=null }"><input class="shurukuang" type="text" name="username" value="${userName }"/></c:if>
					<c:if test="${userName==null }"><input class="shurukuang" type="text" name="username" placeholder="请输入你的用户名"/></c:if>
					
					</div>
					<div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;
					<c:if test="${passWord!=null }"><input class="shurukuang" type="password" name="password" placeholder="${passWord }"/></c:if>
					<c:if test="${passWord==null }"><input class="shurukuang" type="password" name="password" placeholder="请输入你的密码"/></c:if>
					
					</div>
					<div class="username">
						<div class="left fl">验证码:&nbsp;<input class="yanzhengma" type="text" name="userCode" placeholder="请输入验证码"/></div>
						<div class="right fl">
						<img id="img" src="login.action" onclick="checkImg()">
						</div>
						
						<div class="clear"></div>
					</div>
				</div>
				<div class="login_submit">
					<input class="submit" type="submit" name="submit" value="立即登录" >
				</div>
				
			</div>
		</div>
		</form>
		<footer>
			<div class="copyright">简体 | 繁体 | English | 常见问题</div>
			<div class="copyright">天亦公司版权所有-京ICP备19999999-<img src="./image/ghs.png" alt="">京公网安备1999999999号-京ICP证1999999号</div>

		</footer>
	</body>
</html>
<script type="text/javascript" src="js/jquery-1.4.4.min.js">
</script>
<script type="text/javascript" src="js/customer.js">
</script>
