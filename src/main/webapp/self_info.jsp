<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>小米商城-个人中心</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
		<%@include file="header.jsp" %>
	
	
	<div class="grzxbj">
		<div class="selfinfo center">
		<%@include file="left.jsp" %>
		<form action="edit_info.jsp">
		<div class="rtcont fr">
			<div class="grzlbt ml40">我的资料</div>
			<div class="subgrzl ml40"><span>昵称</span><span>${customerDeveInfo.user_name}</span></div>
			<div class="subgrzl ml40"><span>真实姓名</span>
			<c:if test="${customerDeveInfo.real_name!=null}"><span>${customerDeveInfo.real_name}</span></c:if>
			<c:if test="${customerDeveInfo.real_name==null}"><span>您还未设置真实姓名</span></c:if>
			<span><font>仅自己可见</font></span></div>
			
			<div class="subgrzl ml40"><span>密码</span><span>${customerDeveInfo.password }</span></div>
			<div class="subgrzl ml40"><span>手机</span>
			
			<c:if test="${customerDeveInfo.mobile!=null}"><span>${customerDeveInfo.mobile}</span></c:if>
			<c:if test="${customerDeveInfo.mobile==null}"><span>您还未设置手机号码</span></c:if>
			
			</div>
			<div class="subgrzl ml40"><span>邮箱</span>
			
			<c:if test="${customerDeveInfo.email!=null}"><span>${customerDeveInfo.email}</span></c:if>
			<c:if test="${customerDeveInfo.email==null}"><span>您还未设置邮箱</span></c:if>
			
			</div>
			
			
			<div class="editCustom"><button type="submit">编辑</button></div>
		</div>
		</form>
		<div class="clear"></div>
		</div>
	</div>
		
	<%@include file="footer.jsp" %>
	</body>
</html>