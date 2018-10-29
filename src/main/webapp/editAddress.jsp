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
					<div class="grzlbt ml40">收货地址</div>


					<div class="subgrzl ml40">
						<span>收货人</span> <span> 
						<input id="id" type="hidden" value="${oldCustomerAddress.id }"/>
						<input id="customer_id" type="hidden" value="${oldCustomerAddress.customer_id }"/>
						<input id="acceptor_name"
							type="text" placeholder="请输入收货人姓名" value="${oldCustomerAddress.acceptor_name}"/></span>
					</div>
					<div class="subgrzl ml40">
						<span>电话/手机</span> <span><input type="text" value="${oldCustomerAddress.acceptor_mobile}"
							id="acceptor_mobile" placeholder="请输入收货人手机/电话" /></span>
					</div>
					<div class="subgrzl ml40">
						<span>所在地址</span><span> <select id="id_province"
							onchange="doListCity(),doListCounty()" name="province">
						</select> <select id="id_city" onchange="doListCounty()" name="city">
						</select> <select id="id_county" name="county">
						</select>
						</span>
					</div>
					<div class="subgrzl ml40">
						<span>详细地址</span><span><input type="text" id="street" value="${oldCustomerAddress.street}"
							placeholder="请输入收货人详细地址"></span>
					</div>

					<div class="editCustom">
						<button type="button" onclick="doAdd()">确定</button>
						
					</div>
				</div>
			<div class="clear"></div>
		</div>
	</div>
	<!-- self_info -->

	<%@include file="footer.jsp"%>
</body>
</html>

<script src="js/city.js"></script>
<script src="js/jquery-1.4.4.min.js"></script>
<script>
function isNull(str) {
	if (str == "")
		return true;
	var regu = "^[ ]+$";
	var re = new RegExp(regu);
	return re.test(str);
}
	
	//载入省份数据到省份下拉框中
	var objProvince = document.getElementById("id_province")
	for (var i = 0; i < province.length; i++) {
		objProvince.options.add(new Option(province[i].name, i));

	}
	//定义改变城市下拉框的选项方法
	function doListCity() {
		var objCity = document.getElementById("id_city");
		objCity.options.length = 0;
		//获得省份下拉框当前选择的省份序号
		var index = document.getElementById("id_province").selectedIndex;
		//遍历该省份序号所对应的城市数据

		for (var i = 0; i < province[index].city.length; i++) {
			objCity.options.add(new Option(province[index].city[i].name, i));

		}
	}

	function doListCounty() {
		//var objCity=document.getElementById("id_city");
		var objCounty = document.getElementById("id_county");
		objCounty.options.length = 0;
		//获得省份下拉框当前选择的省份序号
		var index = document.getElementById("id_province").selectedIndex;
		//获得城市市下拉框当前选择的城市序号
		var index1 = document.getElementById("id_city").selectedIndex;
		for (var i = 0; i < province[index].city[index1].districtAndCounty.length; i++) {
			objCounty.options.add(new Option(
					province[index].city[index1].districtAndCounty[i], i));

		}

	}
	function doAdd() {
		var id = $("#id").val();
		//获取id
		var customer_id = $("#customer_id").val();
		//获取地址信息
		//1.获取province信息
		var province_id = document.getElementById("id_province");
		var province_index = province_id.selectedIndex;
		var province = province_id.options[province_index].text;
		//2.获取city信息
		var city_id = document.getElementById("id_city");
		var city_index = city_id.selectedIndex;
		var city = city_id.options[city_index].text;
		//31.获取county信息
		var county_id = document.getElementById("id_county");
		var county_index = county_id.selectedIndex;
		var county = county_id.options[county_index].text;
		//获取其它信息
		var acceptor_name = $("#acceptor_name").val();
		if(isNull(acceptor_name)){
			alert("用户名不能为空");
			return false;
		}
		var acceptor_mobile = $("#acceptor_mobile").val();
		var reg = /^1[34578]\d{9}$/;
		if (isNull(acceptor_mobile) || acceptor_mobile.length != 11
				|| !reg.test(acceptor_mobile)) {
			alert("手机号格式不正确!");
			return false;
		}
		var street = $("#street").val();
		if(isNull(street)){
			alert("详细地址不能为空！");
			return false;
		}
		else{
		$.ajax({
			type : 'post',
			url : '${pageContext.request.contextPath }/editAddress.action',
			//请求是key/value这里不需要指定contentType，因为默认就 是key/value类型
			//contentType:'application/json;charset=utf-8',
			//数据格式是json串，地址信息
			data : {
				id:id,
				customer_id:customer_id,
				acceptor_name : acceptor_name,
				acceptor_mobile : acceptor_mobile,
				province:province,
				city:city,
				county:county,
				street : street
			},
			success : function(data) {//返回json结果
			window.location.href="myaddress.action";
			}

		});
		}
	}
</script>