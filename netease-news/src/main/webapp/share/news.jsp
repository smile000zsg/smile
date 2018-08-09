<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/netease-news/"/>
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/mui.min.css" />
<link rel="stylesheet" href="css/infonews.css"/>
</head>
<body>
	<div id="info-box">
		<div class="head-box">
		 	<div><span class="mui-icon mui-icon-arrowleft"></span></div>
		 	<div class="titleName"><img src="img/tou.jpg"> <span>${nt.nickName}</span></div>
		 	<div class="follow-up">已有2233人参与跟帖</div>
		 </div>
		 <div class="body-z">
		 	<!--继毕福剑之后，国嘴梁宏达也被央广封杀，网友：涉及到了敏感话题-->
		 	<div class="news-title" >${nt.newsTheme}</div>
			<div class="author-box">
				<img src="img/tou.jpg" class="tou">
				<div class="author-time">
					<span class="author-text">${nt.nickName}</span>
				 	<p><span class="time-text">1分钟前</span></p>
				 </div>
				 <div class="subs"> + 订阅</div>
			</div>
			<div class="article-box">
				<img src="img/renwu-1.jpg"  class="renwu"/>
				<p class="article">
				 <!--继毕福剑之后，国嘴梁宏达也被央广封杀，网友：涉及到了敏感话题，得罪人了。梁宏达，人称“老梁”
				， 中国大陆电视时事和媒体双栖评论员，小编相信很多网友喜欢老梁主持的电视节目
				《老梁说天下》《老梁故事会》，因为老梁学识渊博，通晓古今的评论解说成为不少观众喜爱他的理。-->
				${nt.newsContent}
				</p>
				<img src="img/renwu-2.jpg" class="renwu"/>
				<p class="article">
				不过由于老梁因涉及到敏感话题而遭到封杀，或许跟诋毁雷锋事件有关，在上一年的时候，梁宏达先生诋毁、
				质疑雷锋的视频在网上引起轩然大波，引起广大雷锋人的反击和声讨。因此老梁的节目就再也没有播出了，梁宏达节目停播了。
				</p>
				<img src="img/renwu.jpg" class="renwu"/>
				<p class="article">
				除此之外，梁宏达经常会爆出一些后幕，说着别人都说的问题。对于梁宏达被封杀，网友们自然也是十分惋惜的，毕竟老梁
				的每一个节目确实都很好，都是能让人竖大拇指的。现在梁宏达已经停止工作了，看来他会找到一个新工作。各位网友对此怎么看？
				</p>
			</div>
			<div class="love-box"><span class="mui-icon mui-icon-star"></span>74人喜欢</div>
			<div class="share-box">
				<div onclick="share()">&nbsp;&nbsp;<img  src="img/weixin.jpg">微信&nbsp;&nbsp;</div>
				<div>&nbsp;&nbsp;<img src="img/weixin.jpg"> 朋友圈&nbsp;&nbsp;</div>
				<div>&nbsp;&nbsp;<img src="img/weixin.jpg"> 微博&nbsp;&nbsp;</div>
			</div>
			<div style="border:2px solid #f0f8fa;margin:2rem 0 2rem 0"></div>
			<div id="box"> 
				<div class="hot-text">热门跟帖</div>
				<c:forEach var="ls" items="${ls}">
					<div class='pz-hot'>
						<div><img src='img/tou.jpg' class='t-img'></div>
						<div class='left-2'>
							<div class='wy-box'><span class='wy'>${ls.nickName}</span><span class='d'>152顶</span></div>
							<span class='address'>北京市昌平区  荣耀8  16小时前</span>
							<div class='comment-text'>
								<div>${ls.commentText}</div>
							</div>
							<div class='comment-reply'>
								${ls.listReply[0].nickName} 回复 : ${ls.listReply[0].replycontent}
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
		<div class="follow-u">
			<input type="text" class="follow-input" placeholder="写跟帖"/>
			<span class="glyphicon glyphicon-star-empty"></span>
	 		<span class="mui-icon mui-icon-star"></span>
			<span class="mui-icon mui-icon-undo"></span>
			<span class="mui-icon mui-icon-more"></span>
		</div>	
		 
		</div>
	</body>
	<script src="js/vue.min.js"></script>
	<script src="js/mui.min.js"></script>
	<script type="text/javascript" src="js/jquery-3.2.1.min.js" ></script>
	<script>
	</script>
</html>
