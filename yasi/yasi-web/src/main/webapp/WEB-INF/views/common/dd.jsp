<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>S专业英语培训学校--The best choose</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="${ctxStatic}/css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="${ctxStatic}/js/jquery.min.js"></script>  
<!-- <link href='http//fonts.googleapis.com/css?family=Open+Sans:400,600' rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" /> -->
<!---start-login-script--->
		<script src="${ctxStatic}/js/login.js"></script>
		<!---//End-login-script--->
		<!-----768px-menu----->
		<link type="text/css" rel="stylesheet" href="${ctxStatic}/css/jquery.mmenu.all.css" />
		<script type="text/javascript" src="${ctxStatic}/js/jquery.mmenu.js"></script>
			<script type="text/javascript">
				//	The menu on the left
				$(function() {
					$('nav#menu-left').mmenu();
				});
		</script>
		<!-----//768px-menu----->
</head>
<body>
	<div class="content">
	<!------start-768px-menu---->
			<div id="page">
					<div id="header">
						<a class="navicon" href="#menu-left"> </a>
					</div>
					<nav id="menu-left">
						<ul>
							<li class="active"><a href="index.jsp">Home</a></li>
							<li><a href="about.html">About</a></li>
	<!-- 						<li><a href="blog.html">Blog</a></li> -->
							<div class="clear"> </div>
						</ul>
					</nav>
			</div>
		<!------end-768px-menu---->
			<!---start-header---->
			<div class="header">
		   <!---start-wrap---->
				<div class="wrap">
				<div class="header-left">
					<div class="logo">
						<a href="${ctx}"><img src="${ctxStatic}/images/logo.jpg"/></a>
					</div>
				</div>
				<div class="header-right">
					<div class="top-nav">
					<ul>
						<li class="active"><a href="index.jsp">首页</a></li>
						<li><a href="${ctx}/about.html">介绍</a></li>
						<li><a href="${ctx}/blog.html">信息</a></li>
					</ul>
				</div>
				
				<div class="sign-ligin-btns">
					<ul>
						
						<li id="loginContainer"><a class="login" id="loginButton" href="#"><span>管理员登陆</span></a>
							 <div class="clear"> </div>
				                <div id="loginBox">                
				                    <form id="loginForm" action="#" method=" post">
				                        <fieldset id="body">
				                            <fieldset>
				                                <label for="account">Account</label>
				                                <input type="text" name="account" id="account" />
				                            </fieldset>
				                            <fieldset>
				                                <label for="password">Password</label>
				                                <input type="password" name="password" id="password" />
				                            </fieldset>
				                           
				                            <label class="remeber" for="checkbox"><input type="checkbox" id="checkbox" />Remember me</label>
				                            <input type="button" id="login" value="Login" onclick="check()"/>
				                        </fieldset>
				                            <span id='error'></span>
				                           
				                    </form>
				                     <form id="form2" name="form2" method="post" action="${ctx}/Sys/home" >
				                            <input type="hidden" name="SysNo" id="SysNo" ">
				                            </form>
				                </div>
				            <!-- Login Ends Here -->
						</li>
						<li id="signupContainer"><a class="signup" id="signupButton" href="#"><span>注册</span></a>
							 <div class="clear"> </div>
				                <div id="signupBox">                
				                    <form id="signupForm">
				                        <fieldset id="signupbody">
				                            <fieldset>
				                                <label for="email">Email Address <span>*</span></label>
				                                <input type="text" name="email" id="signupemail" />
				                            </fieldset>
				                            <fieldset>
				                                <label for="password">Choose Password <span>*</span></label>
				                                <input type="password" name="password" id="signuppassword" />
				                            </fieldset>
				                             <fieldset>
				                                <label for="password">Confirm Password <span>*</span></label>
				                                <input type="password" name="password" id="signuppassword1" />
				                            </fieldset>
				                            <input type="submit" id="signup" value="Register Now!" />
				                        </fieldset>
				                    </form>
				                </div>
				            <!-- Login Ends Here -->
						</li>
						<div class="clear"> </div>
					</ul>
				</div>
				<div class="clear"> </div>
				</div>
				<div class="clear"> </div>
			</div>
			</div>
			<div class="main">
				<div class="wrap">
				<div class="main_left">
					<h2>预约广告</h2>
					<p>Slide is mobile payment solution to easily send money to frieds.Lorem ipsum dolor sit amet, consectetur elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>		
					<div class="buttons">
						<div class="sign_up">
							<a href="#">马上预约</a>
						</div>
						<div class="learn">
							<a href="details.html" class="arrow_btn">LEARN MORE</a>
						</div>
							<div class="clear"> </div>
					</div>
				</div>
			<div class="main_right">
						<span> </span>
			</div>
			<div class="clear"> </div>
			<!---//End-header---->
			</div>
		</div>
	</div>
		<div class="buttom">
			<div class="wrap">
				<div class="top-grids">
					<div class="top-grid">
						<a href="#"><img src="${ctxStatic}/images/icon1.png"/></a>
						<h3><a href="#">Lorem ipsum dolor sit amet consectetur adipisicing.</a></h3>
						<p>Lorem ipsum dolor sit amet, consctetur adipisicing elit, sed do eiusmod.</p>
					</div>
					<div class="top-grid">
						<a href="#"> <img src="${ctxStatic}/images/icon2.png"/></a>
						<h3><a href="#">Lorem ipsum dolor sit amet consectetur adipisicing.</a></h3>
						<p>Lorem ipsum dolor sit amet, consctetur adipisicing elit, sed do eiusmod.</p>
						</div>
					<div class="top-grid">
						<a href="#"><img src="${ctxStatic}/images/icon3.png"/> </a>
						<h3><a href="#">Lorem ipsum dolor sit amet consectetur adipisicing.</a></h3>
						<p>Lorem ipsum dolor sit amet, consctetur adipisicing elit, sed do eiusmod.</p>
						</div>
					<div class="clear"> </div>
				</div>
			</div>
		</div>
		<div class="footer">
   	    <div class="wrap">
   	    	<div class="footer-left">
				<div class="copy">
			       <p>Copyright &copy; 2014.Company name All rights reserved.</p>
		        </div>
			</div>
			<div class="social_icons">	
	           <ul>
					<li class="in"><a href="#"><span> </span></a></li>
					<li class="pro"><a href="#"><span> </span></a></li>
					<li class="twitter"><a href="#"><span> </span></a></li>
					<li class="facebook"><a href="#"><span> </span></a></li>
					<div class="clear"> </div>
				</ul>
		   </div>
		   <div class="clear"> </div>
	    </div>

   </div>
</body>

<script type="text/javascript">
function check(){
	var a=$("#account").val();
	var b=$("#password").val();
	$("#SysNo").val(a);
	if(a!=''&&b!=''){
		$.ajax({
			type : "POST",
			url : "${ctx}/login",
			data: {
				    acount: a,
		            password: b
		        },
			dataType : "json",
			error : function(data) {
				 $('#error').html('用户名密码错误');
			},
			timeout : 50000,
			success : function(data) {
				if(data==1){
				 $('#form2').submit();
				}
				else if(data==0){
					 $('#error').html('用户名密码错误');
				}
				else {
					 $('#error').html('请填写用户名和密码');
				}
			}
	});
	}
	else{
		$('#error').html('请填写用户名和密码');}
	}
</script>
</html>