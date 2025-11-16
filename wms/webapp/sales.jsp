<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>물류창고 입출고 프로그램</title>
<style>
body{
	display:flex;
	flex-direction:column;
}
header,footer{
	background-color:blue;
	color:white;
	text-align:center;
}
nav{
	background-color:pink;
}
#menu{
	display:flex;
}
# menu li{
	list-style:none;
	margin-right:30px;
}
li a{
	text-decoration:none;
	color:blue;
}
li a:hover{
	font-weight:bolder;
	color:red;
}
section{
	background-color:beige;
	display:flex;
	flex-direction:column;
	align-items:center;
	min-height:500px;
}
h1,h3{
	text-align:center;
}
</style>
</head>
<body>
	<header>
		<h1>(과정평가형 정보처리산업기사)물류창고 입출고 프로그램 ver2020-02</h1>
	</header>
	<nav>
		<ul id = "menu">
		<li><a href="product"></a>제품조회</li>
		<li><a href="inout"></a>입출고등록</li>
		<li><a href="detail"></a>입출고내역조회</li>
		<li><a href="sales"></a>출고매출이익</li>
		<li><a href="index.jsp"></a>홈으로</li>
		</ul>
	</nav>
	<section>
		<h3>과정평가형 자격 CBQ</h3>
	</section>
	<footer>
		<p>HRDKOREA Copyright&copy;2016 All rights reserve.Human Resources Development Service of Korea</p>
	</footer>
</body>
</html>