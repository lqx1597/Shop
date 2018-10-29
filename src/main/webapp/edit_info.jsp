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
			<form action="editInfo.action" name="res">
				<div class="rtcont fr">
					<div class="grzlbt ml40">信息修改</div>
					<div class="subgrzl ml40">
						<span>用户名</span>
						<span> <input type="hidden" value="${customerDeveInfo.user_name}" name="user_name" />
							${customerDeveInfo.user_name}
						</span>
						<span class="editInfoSapnCss">用户名不可修改</span>
					</div>
					<div class="subgrzl ml40">
						<span>真实姓名</span>
						<span><input type="text" name="real_name" value="${customerDeveInfo.real_name}"></span>
						<span class="editInfoSapnCss">仅自己可见</span>
					</div>
					<div class="subgrzl ml40">
						<span>手机号</span>
						<span><input type="text" name="mobile" id="mobile" value="${customerDeveInfo.mobile}" onblur="checkUserMobile()"></span>
						<span class="editInfoSapnCss" id="errorMobile">请输入正确的手机号</span>
					</div>
					<div class="subgrzl ml40">
						<span>密码</span>
						<span><input type="text" name="password" value="${customerDeveInfo.password}"></span>
						<span class="editInfoSapnCss">请输入6~18位的密码</span>
					</div>
					<div class="subgrzl ml40">
						<span>邮箱</span>
						<span><input type="text" name="email" id="email" value="${customerDeveInfo.email}" onblur="checkUserEamil()"></span>
						<span class="editInfoSapnCss" id="errorEmail">请输入合法的邮箱</span>
					</div>
					<div class="editCustom">
						<button type="submit" onclick="return editCheck()">确认</button>
					</div>
				</div>
			</form>
			<div class="clear"></div>
		</div>
	</div>

	<%@include file="footer.jsp"%>
</body>
</html>
<script language="JavaScript" src="js/customer.js">
</script>
<script type="text/javascript" src="js/jquery-1.4.4.min.js">
</script>