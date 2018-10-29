<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="order by dede58.com" />
<title>天亦商城</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	
	
	<c:if test="${loginMsg!=null}">
	<script type="text/javascript">
	alert("${loginMsg}");
	</script>
	<!-- 移除loginMsg -->
	<% request.getSession().removeAttribute("loginMsg"); %>
	</c:if>
	
	<%@include file="header.jsp"%>


	<div class="banner_y center">
		<div class="nav">
			<ul>
				<li><a href="">手机</a> <a href="">电话卡</a>
					<div class="pop">
						<div class="ctn fl">
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xm5-80.jpg" alt="">
										</div> <span class="fl">小米手机5</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hmn4x80.png" alt="">
										</div> <span class="fl">红米Note 4X</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hmnote4-80.jpg" alt="">
										</div> <span class="fl">红米Note-4</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hm4x_80.png" alt="">
										</div> <span class="fl">红米4x</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hm4-80.jpg" alt="">
										</div> <span class="fl">红米4</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hm4A-80.jpg" alt="">
										</div> <span class="fl">红米4A</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<div class="right fl">
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/compare.jpg" alt="">
										</div> <span class="fl">对比手机</span>
										<div class="clear"></div>
									</a>
								</div>
								<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/mimobile.jpg" alt="">
										</div> <span class="fl">小米移动&nbsp;电话卡</span>
										<div class="clear"></div>
									</a>
								</div>
								<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
								<div class="clear"></div>
							</div>
						</div>
						<div class="clear"></div>
					</div></li>
				<li><a href="">笔记本</a> <a href="">平板</a>
					<div class="pop">
						
						<div class="ctn fl">
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xm5-80.jpg" alt="">
										</div> <span class="fl">小米手机5</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hmn4x80.png" alt="">
										</div> <span class="fl">红米Note 4X</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hmnote4-80.jpg" alt="">
										</div> <span class="fl">红米Note-4</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hm4x_80.png" alt="">
										</div> <span class="fl">红米4x</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hm4-80.jpg" alt="">
										</div> <span class="fl">红米4</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/hm4A-80.jpg" alt="">
										</div> <span class="fl">红米4A</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
						</div>

						<div class="clear"></div>
					</div></li>
				<li><a href="">电视</a> <a href="">盒子</a>
					<div class="pop">
						
						<div class="right fl">
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/compare.jpg" alt="">
										</div> <span class="fl">对比手机</span>
										<div class="clear"></div>
									</a>
								</div>
								<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/mimobile.jpg" alt="">
										</div> <span class="fl">小米移动&nbsp;电话卡</span>
										<div class="clear"></div>
									</a>
								</div>
								<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
								<div class="clear"></div>
							</div>
						</div>
						<div class="clear"></div>
					</div></li>
				<li><a href="">路由器</a> <a href="">智能硬件</a>
					<div class="pop">
						<div class="left fl">
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xm6_80.png" alt="">
										</div> <span class="fl">小米6</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xmNOTE2-80.jpg" alt="">
										</div> <span class="fl">小米Note 2</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<div class="clear"></div>
					</div></li>
				<li><a href="">移动电源</a> <a href="">电池</a> <a href="">插线板</a>
					<div class="pop">
						
						
						<div class="right fl">
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/compare.jpg" alt="">
										</div> <span class="fl">对比手机</span>
										<div class="clear"></div>
									</a>
								</div>
								<!-- <div class="xuangou_right fr"><a href="">选购</a></div> -->
								<div class="clear"></div>
							</div>
							
						</div>
						<div class="clear"></div>
					</div></li>
				<li><a href="">耳机</a> <a href="">音箱</a>
					<div class="pop">
						<div class="left fl">
							
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xm5Splus.jpg" alt="">
										</div> <span class="fl">小米5s Plus</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						
					</div></li>
				<li><a href="">线材</a> <a href="">支架</a> <a href="">储存卡</a>
					<div class="pop">
						<div class="left fl">
							
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/MIX-80.jpg" alt="">
										</div> <span class="fl">小米5s</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xm5Splus.jpg" alt="">
										</div> <span class="fl">小米5s Plus</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<div class="clear"></div>
					</div></li>
				<li><a href="">箱包</a> <a href="">服饰</a> <a href="">鞋</a> <a
					href="">眼镜</a>
					<div class="pop">
						<div class="left fl">
							
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/MIX-80.jpg" alt="">
										</div> <span class="fl">小米5s</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xm5Splus.jpg" alt="">
										</div> <span class="fl">小米5s Plus</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<div class="clear"></div>
					</div></li>
				<li><a href="">米兔</a> <a href="">生活周边</a>
					<div class="pop">
						<div class="left fl">
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xm6_80.png" alt="">
										</div> <span class="fl">小米6</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
							
							<div>
								<div class="xuangou_left fl">
									<a href="">
										<div class="img fl">
											<img src="./image/xm5Splus.jpg" alt="">
										</div> <span class="fl">小米5s Plus</span>
										<div class="clear"></div>
									</a>
								</div>
								<div class="xuangou_right fr">
									<a href="">选购</a>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<div class="clear"></div>
					</div></li>
			</ul>
		</div>

	</div>

	<div class="sub_banner center">
		<div class="sidebar fl">
			<div class="fl">
				<a href=""><img src="./image/hjh_01.gif"></a>
			</div>
			<div class="fl">
				<a href=""><img src="./image/hjh_02.gif"></a>
			</div>
			<div class="fl">
				<a href=""><img src="./image/hjh_03.gif"></a>
			</div>
			<div class="fl">
				<a href=""><img src="./image/hjh_04.gif"></a>
			</div>
			<div class="fl">
				<a href=""><img src="./image/hjh_05.gif"></a>
			</div>
			<div class="fl">
				<a href=""><img src="./image/hjh_06.gif"></a>
			</div>
			<div class="clear"></div>
		</div>
		<div class="datu fl">
			<a href=""><img src="./image/hongmi4x.png" alt=""></a>
		</div>
		<div class="datu fl">
			<a href=""><img src="./image/xiaomi5.jpg" alt=""></a>
		</div>
		<div class="datu fr">
			<a href=""><img src="./image/pinghengche.jpg" alt=""></a>
		</div>
		<div class="clear"></div>


	</div>
	<!-- end banner -->

	<!-- start danpin -->
	<div class="danpin center">
		<!-- 手机 信息 -->
		<div class="biaoti center">手机电脑明星单品</div>
		<div class="main center">
			<c:forEach items="${ productAll}" var="productAll" begin="0" end="4">
				<div class="mingxing fl">
					<div class="sub_mingxing">
						<a href="productshow.action?id=${productAll.id}"><img
							src="/img/${productAll.picture_file}" alt=""></a>
					</div>
					<div class="pinpai">
						<a href="">${productAll.product_name }</a>
					</div>
					<div class="youhui">${productAll.description}</div>
					<div class="jiage">${productAll.sale_price }元起</div>
				</div>
			</c:forEach>

			<div class="clear"></div>
		</div>
	</div>
	<div class="peijian w">
		<div class="biaoti center">配件</div>
		<div class="main center">
			<div class="content">
				<div class="remen fl">
					<a href=""><img src="./image/peijian1.jpg"></a>
				</div>
				<div class="remen fl">
					<div class="xinpin">
						<span>新品</span>
					</div>
					<div class="tu">
						<a href="productshow.action?id=14""><img
							src="./image/peijian2.jpg"></a>
					</div>
					<div class="miaoshu">
						<a href="productshow.action?id=14">小米6 硅胶保护套</a>
					</div>
					<div class="jiage">49元</div>
					<div class="pingjia">372人评价</div>
					<div class="piao">
						<a href="productshow.action?id=14"> <span>发货速度很快！很配小米6！</span>
							<span>来至于mi狼牙的评价</span>
						</a>
					</div>
				</div>

				<c:forEach items="${ productAll}" var="productAll" begin="6" end="8">

					<div class="remen fl">
						<div class="xinpin">
							<span style="background: #fff"></span>
						</div>
						<div class="tu">
							<a href="productshow.action?id=${productAll.id}"><img
								src="/img/${productAll.picture_file}"></a>
						</div>
						<div class="miaoshu">
							<a href="">${productAll.product_name }</a>
						</div>
						<div class="jiage">${productAll.sale_price }.00元</div>
						<div class="pingjia">${productAll.description}</div>
						<div class="piao">
							<a href="productshow.action?id=${productAll.id }"> <span>发货速度很快！客服很好！</span>
								<span>来自白逸飞的评价的评价</span>
							</a>
						</div>
					</div>
				</c:forEach>


				<div class="clear"></div>
			</div>
			<div class="content">


				<div class="remen fl">
					<a href="productshow.action?id=22"><img
						src="./image/peijian6.png"></a>
				</div>


				<c:forEach items="${ productAll}" var="productAll" begin="10"
					end="12">

					<div class="remen fl">
						<div class="xinpin">
							<span style="background: #fff"></span>
						</div>
						<div class="tu">
							<a href="productshow.action?id=${productAll.id}"><img
								src="/img/${productAll.picture_file}"></a>
						</div>
						<div class="miaoshu">
							<a href="">${productAll.product_name }</a>
						</div>
						<div class="jiage">${productAll.sale_price }.00元</div>
						<div class="pingjia">${productAll.description}</div>
						<div class="piao">
							<a href="productshow.action?id=${productAll.id }"> <span>发货速度很快！物超所值！</span>
								<span>来自陌生了独的评价</span>
							</a>
						</div>
					</div>
				</c:forEach>

				<div class="remenlast fr">
					<div class="hongmi">
						<a href="productshow.action?id=26"><img
							src="./image/hongmin4.png" alt=""></a>
					</div>
					<div class="liulangengduo">
						<a href="moreProduct.action"><img
							src="./image/liulangengduo.png" alt=""></a>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>