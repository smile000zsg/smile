<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="/PhoneQQ/"/>
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
	<title>QQ-登陆</title>
	<link rel="stylesheet" href="css/bootstrap.css" />
	<link rel="stylesheet" href="css/login.css" />
</head>
	<body>
	<form action="user/selectUsers" method="post">
		<div>
			<div class="box">
				<div class="logo"><img src="img/logo.png" style="width:3rem;height: 3.4rem;"></div>
				<div class="QQ-text">QQ</div>
			</div>
			<div class="box-2" style="margin-top:3rem;">
				<div class="input-user"><input size="16" type="text"/></div>
				<div class="img">
					<img src="img/tou-2.png"/>
					<span><img src="img/R_k_tlq_png.png"></span>
				</div>
			</div>
			<div class="box-x"></div>
			<div class="box-2">
				<div class="input-user"><input size="16" type="password"/></div>
			</div>
			<div class="box-x"></div>
			<div><button class="login-button" type="submit">登 陆</button></div>
			<div class="new-reg">
				<div class="pass">忘记密码？</div>
				<div class="new-user">新用户注册</div>
			</div>
			<div class="xieyi">登 陆 即 代 表 阅 读 并 同 意<span class="fuwu"> 服 务 条 款</span></div>
		</div>
	</form>
	</body>
	<script src="js/zepto.js"></script>
	<script src="js/remstyle.js"></script>
</html>
