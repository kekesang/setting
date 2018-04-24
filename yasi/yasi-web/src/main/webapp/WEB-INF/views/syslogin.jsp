<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html xmlns="http//www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${ctxStatic}/css/login.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${ctxStatic}/js/jquery.min.js"></script>
<script src="${ctxStatic}/js/zzsc.js"></script>
<script type="text/javascript" src="${ctxStatic}/js/jquery-1.4.2.min.js"></script>
<script src="${ctxStatic}/js/tips.js" type="text/javascript"></script>
<script type="text/javascript" src="${ctxStatic}/js/lm.js"></script>
<title>无标题文档</title>
</head>

<body>
  <div class="box1">
    <div class="box2">
      <h1>爱思英语教育后台</h1>
    
   <table width="100%" border="0" cellspacing="0" cellpadding="0">
   <form name="loginForm" id="loginForm" action="" method=" post">
     
  <tr>
    <td width="30%" align="right">用户：</td>
    <td width="40%"><input type="text" class="box_inp1" name="account" id="account" /></td>
    <td width="30%"></td>
  </tr>
  <tr>
    <td align="right">密码：</td>
    <td><input name="password" class="box_inp1" type="text" id="password" /></td>
    <td><input name="" type="checkbox" value="" style="float:left; display:inline; margin-top:9px; margin-right:3px"/>&nbsp;记住密码</td>
  </tr>
  </form>
 <!--   <tr>
    <td align="right">验证码：</td>
    <td><img src="images/yzm.jpg" style=" float:right; display:inline;margin-right:15px"/><input name="" type="text" class="box_inp2"/>
      </td>
    <td>&nbsp;</td>
  </tr> -->
  <tr>
    <td>&nbsp;</td>
    <td>
     <input type="button" id="login" value="提交" class="subbtm" onclick="check()"/>
  <!--   <input type="submit" name="button" id="button" value="提交" class="subbtm"/> --></td>
    <td>&nbsp;</td>
  </tr>
 
  <tr>
    <td  align="center"><span id='error'></span></td>
    </tr>
</table>
 <form id="form2" name="form2" method="post" action="${ctx}/Sys/home" >
 <input type="hidden" name="SysNo" id="SysNo">
</form>
    </div>
    <div class="copy">保定新网 技术支持</div>
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
			url : "${ctx}/Syslogin",
			data: {
				    account: a,
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
