<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="/PhoneQQ/"/>
	<meta name="viewport"
         content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
	<title></title>
	<link rel="stylesheet" href="css/bootstrap.css" />
	<link rel="stylesheet" href="css/lianxi.css"/>
</head>
	<style>
		
	</style>
	<body>
	<div class="box-blue">
		<div class="img-1"><img src="img/tou-2.png" class="tou-img"></div>
		<div class="message">联系人</div>
		<div class="jia">添加</div>
	</div>
	<div class="overflow-box">
		<div class="input-search">
			<div class="search-box"><span><img src="img/R_k_ric_png.png">&nbsp;</span>搜索</div>
		</div>
		<div>
			<div class="friend-max-box">
				<div class="friend-box">
					<div class="new-user" style="">新朋友</div>
					<div class="friend-img"><img src="img/R_k_tlt_png.png"></div>
				</div>
				<div class="friend-box">
					<div class="new-user">创建群聊</div>
					<div class="friend-img"><img src="img/R_k_tlt_png.png"></div>
				</div>
			</div>
		</div>
		<div class="group-box">
			<div class="row-text" id="hh">
				<div>好友</div>
				<div>群聊</div>
				<div>设备</div>
				<div>通讯录</div>
				<div>公众号</div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-bottom.png"></div>
				<div class="tebie">&nbsp;APTECH1号</div>
				<div class="zaixian"><span>0</span>/<span>0</span></div>
			</div>
			<div class="friend-user-box">
				<div class="friend-user">
					<div>
						<div><img src="img/tttt.jpg" class="friend-img2"></div>
					</div>
					<div class="group-user">
						<div>
							<div>青鸟人1号</div>
						</div>
						<div style="display: flex;">
							<div class="user-img">[手机在线]<img src="img/R_k_vwq_png.png"></div>
							<div class="kong">青鸟人1号空间</div>
						</div>
					</div>
				</div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH2号</div>
				<div class="zaixian"><span>6</span>/<span>12</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH3号</div>
				<div class="zaixian"><span>12</span>/<span>0</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH4号</div>
				<div class="zaixian"><span>2</span>/<span>10</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH5号</div>
				<div class="zaixian"><span>5</span>/<span>18</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH6号</div>
				<div class="zaixian"><span>13</span>/<span>16</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH7号</div>
				<div class="zaixian"><span>11</span>/<span>12</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH8号</div>
				<div class="zaixian"><span>11</span>/<span>12</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH9号</div>
				<div class="zaixian"><span>11</span>/<span>12</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH9号</div>
				<div class="zaixian"><span>11</span>/<span>12</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH9号</div>
				<div class="zaixian"><span>11</span>/<span>12</span></div>
			</div>
			<div class="group-row">
				<div class="group-img"><img src="img/group-l.png"></div>
				<div class="tebie">&nbsp;APTECH9号</div>
				<div class="zaixian"><span>11</span>/<span>12</span></div>
			</div>
		</div>
	</div>
	<div class="footer-box">
		<div>
			<img src="img/l2.png" style="margin-top:0.1rem;">
			<p style="margin-top:0.4rem;">消息</p>
		</div>
		<div>
			<img src="img/lx2.png" >
			<p style="margin-top:0.3rem;">联系人</p>
		</div>
		<div>
			<img src="img/k1.png" style="margin-top:0.2rem;">
			<p style="margin-top:0.5rem;">看点</p>
		</div>
		<div>
			<img src="img/d2.png">
			<p style="margin-top:0.4rem;">动态</p>
		</div>
	</div>
	</body>
	<script type="text/javascript" src="js/zepto.js" ></script>
	<script>
		$(function(){
//			var y = $(".row-text").offset().top;
//			console.log(y);
//			//长按
//			document.querySelector(".overflow-box").onscroll=function(e){
//				//console.log("---"+);
//				var t = $(this).scrollTop();
//				if(t>=y){
//					$("#hh").clone().appendTo("body").css({
//						position:"fixed",
//						background:"#fff",
//						top:'5rem',
//						width:'100%'
//					});
//				}
//				if(y=0){
//					$(".row-text").remove();
//				}
//			}
		});
	</script>
</html>
