<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详情</title>
</head>
<body>

	

	<table>
		<c:forEach items="${ productAll}" var="productAll" begin="0" end="4">
		<tr><td>名称：${productAll.product_name }</td></tr>
		<tr><td>价格：${productAll.sale_price }</td></tr>
		<tr><td>描述：${productAll.description}</td></tr>
		<tr><td>图片：
		
		<img alt="" src="/img/${productAll.picture_file}" width=100 height=100></td></tr>
		</c:forEach>
		<tr>
		<td><button name="upPage">上一页</button></td>
		<td>
		<select name="nowPage">
		<option>第一页</option>
		<option>第二页</option>
		</select>
		</td>
		<td><button name="downPage">下一页</button></td>
		</tr>
		</table>
</body>
</html>