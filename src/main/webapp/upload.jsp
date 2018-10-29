<%@page import="cn.shop.po.Catogory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品信息的录入</title>
</head>
<body>
	<form action="add.action" method="post" enctype="multipart/form-data">
		<p>请录入要增加的商品信息
		<p>
			名称: <input type="text" name="product_name" />
		<p>
			商品分类: <select name="cat_id">
				<option value="1">手机</option>
				<option value="2">家电</option>
				<option value="3">充电宝</option>
				<option value="4">手环</option>
				<option value="5">路由器</option>
			</select>
		<p>
			价格: <input type="text" name="sale_price" />
		<p>商品简介:
			<textarea rows="5" cols="5" name="product_desc"></textarea>
		<p>
			首页照片: <input type="file" name="pic" />
		<p>
			<input type="submit" value="提交" />
	</form>

</body>
</html>