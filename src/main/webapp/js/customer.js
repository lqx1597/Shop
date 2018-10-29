//注册页面的js
function mycheck() {
	if (isNull(res.username.value)) {
		alert("用户名不能为空！");
		return false;
	}

	if (isNull(res.password.value)) {
		alert("密码不能为空！！");
		return false;
	}
	if (res.password.value != res.repassword.value) {
		alert("两次密码不一致！");
		return false;
	}
	if (res.password.value.length < 6 || res.password.value.length > 18) {
		alert("密码长度需要6~18位");
		return false;
	}
	if (res.username.value.length < 2 || res.username.value.length > 10) {
		alert("用户名需要2~10位");
	}
	// 设置电话号码
	var reg = /^1[34578]\d{9}$/;
	if (!reg.test(res.mobile.value)) {
		alert("电话格式不正确(11位电话)");
		return false;
	}

}

// 判断是否为空
function isNull(str) {
	if (str == "")
		return true;
	var regu = "^[ ]+$";
	var re = new RegExp(regu);
	return re.test(str);
}

// 生成验证码
function checkImg() {
	$("#img").attr("src", "login.action?a=" + new Date().getTime());
}

// 检查编辑信息页面是否合理
function editCheck() {

	var reg = /^1[34578]\d{9}$/;
	if (isNull(res.real_name.value) || res.real_name.value.length < 2
			|| res.real_name.value.length > 10) {
		alert("真实姓名格式不正确");
		return false;
	}
	if (!reg.test(res.mobile.value)) {
		alert("电话格式不正确(11位电话)");
		return false;
	}
	if (res.password.value.length < 6 || res.password.value.length > 18
			|| isNull(res.password.value)) {
		alert("密码长度需要6~18位");
		return false;
	}
	if(isNull(res.email.value)){
		alert("邮箱不能为空！")
		return false;
	}else{
		emailReg=/^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/gi;
		if(!emailReg.test(res.email.value)){
			alert("请输入合法的邮箱地址");
			return false;
		}
	}
	
	
	
}

// 检查用户名
function checkUserName() {

	// 判断用户名的格式是否正确
	if (isNull(res.username.value) || res.username.value.length < 2
			|| res.username.value.length > 10) {
		$("#errorName").html("用户名格式不正确");
		return false;
	} else {

		// ajax判断用户名是否存在
		$.ajax({
			type : "post",
			url : "checkUserName.action",
			data : {
				user_name : $("#username").val()
			},
			success : function(result) {
				if (result) {
					$("#errorName").html("用户名可用");
					return true;
				} else {
					$("#errorName").html("该用户名已经注册，不可用");
					return false;
				}
			}
		});
	}
}

// 检查电话号码
function checkUserMobile() {
	// 设置电话号码
	var reg = /^1[34578]\d{9}$/;
	if (isNull(res.mobile.value) || res.mobile.value.length != 11
			|| !reg.test(res.mobile.value)) {
		$("#errorMobile").html("手机号格式不正确;");
		return false;
	} else {

		// ajax判断手机号是否存在
		$.ajax({
			type : "post",
			url : "checkUserMobile.action",
			data : {
				mobile : $("#mobile").val()
			},
			success : function(result) {
				if (result) {
					$("#errorMobile").html("手机号可用");
					return true;
				} else {
					$("#errorMobile").html("该手机号已经注册，不可用");
					return false;
				}
			}
		});
	}
}

//检查电子邮箱
function checkUserEamil() {
	// 设置电话号码
	emailReg=/^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/gi;
	if (isNull(res.email.value)||!emailReg.test(res.email.value)) {
		$("#errorEmail").html("电子邮箱格式不正确;");
		return false;
	} else {
		$("#errorEmail").html("正确;");
		// ajax判断邮箱是否存在
		$.ajax({
			type : "post",
			url : "checkUserEmail.action",
			data : {
				email : $("#email").val()
			},
			success : function(result) {
				if (result) {
					$("#errorEmail").html("该邮箱可用");
					return true;
				} else {
					$("#errorEmail").html("该邮箱已经注册，不可用");
					return false;
				}
			}
		});
	}
}
