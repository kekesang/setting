<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教育在线</title>

</head>
<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/global.css">
<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/index.css">

<body>
<div id="index">
<div class="headbg">
 
 <table width="960" border="0" align="center" cellpadding="0" cellspacing="0" class="top">
 
   <tr>
      <td  class="logo" width="145" rowspan="3" align="left"><a href="index.html"><img src="${ctxStatic}/images/logo.gif" width="140" height="41" /></a></td>

      <td width="40" rowspan="3" class="daohang">&nbsp;</td>
      
<td width="700" height="24" align="right" valign="bottom" class="STYLE10" style="padding-right:70px;">欢迎登录骐骥教育，请 <span class="STYLE11"><a href="#" class="STYLE11">登录</a></span> 
<span class="STYLE11"><a href="#" class="STYLE11">免费注册</a> </span><img src="${ctxStatic}/images/144.gif" width="14" height="12" />      购物车 | 我的骐骥 </td>
      
    </tr>
  
 
    
  </table>
 
 </div>

  <table width="960" border="0" cellpadding="0" cellspacing="0" class="kg">
    <tr>
      <td><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http//download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" name="banner" width="1440" height="198" id="banner">
        <param name="movie" value="${ctxStatic}/flash/01.swf" />
        <param name="quality" value="high" />
        <embed src="${ctxStatic}/flash/01.swf" width="1440" height="198" quality="high" pluginspage="http//www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" name="banner"></embed>
      </object></td>
    </tr>
  </table>
  <table height="218" border="0" cellpadding="0" cellspacing="0" class="shangp">
    <tr>
      <td width="186" height="228" rowspan="2" align="center" valign="top" background="${ctxStatic}/images/3.gif"><table width="84%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td width="184" height="120" align="left"><span class="STYLE1">
		  <img src="${ctxStatic}/images/person.png" width="30" height="30" /> Hi欢迎来到骐骥！</span></td>
        </tr>
      </table>
        <table width="84%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="29" ><input type="submit" name="Submit2" value="" class="input_btn" /></td>
			<td height="29" ><a href="">新用户注册</a></td>
          </tr>
        </table>
        </td>
      <td width="16" rowspan="2" align="left">&nbsp;</td>
      <td width="415"><span class="STYLE4">2011,骐骥教育暑期班隆重登场！　　　　　　　　　　　　</span></td>
      <td width="26"><img src="${ctxStatic}/images/4.gif" width="15" height="15" /></td>
      <td width="26"><img src="${ctxStatic}/images/5.gif" width="15" height="15" /></td>
      <td width="24"><img src="${ctxStatic}/images/6.gif" width="15" height="15" /></td>
      <td width="18" rowspan="2">&nbsp;</td>
      <td width="249"  rowspan="2" align="center" valign="top" background="${ctxStatic}/images/9.gif"><table width="90%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="29" align="left" valign="bottom"><span class="STYLE5">高级搜索</span></td>
        </tr>
      </table>
        <table width="84%" border="0" cellpadding="0" cellspacing="0" class="kl">
          <tr>
              <form  id="searchform" action="${ctx}/course/search">
            <td width="66%" height="34"><input name="cour" id="cour" type="text" class="input_text2" value="请输入课程名称" onFocus="if (value =='请输入课程名称'){value =''}" onBlur="if (value ==''){value='请输入课程名称'}"/></td>
            <td width="34%" align="center" valign="middle"><input type="button" name="Submit2" value="" class="input_btn1" /></td>
          </tr>
        </table>
        <table width="82%" border="0" cellpadding="0" cellspacing="0" class="kl1">
          <tr>
            <td height="27" colspan="4" align="left" valign="middle"><span class="STYLE4">关键字：</span></td>
          </tr>
          <tr>
            <td width="29%" height="21" align="left" valign="bottom">学习方法</td>
            <td width="29%" align="left" valign="bottom">学习知识</td>
            <td width="28%" align="left" valign="bottom">学习成绩</td>
            <td width="14%" align="left" valign="bottom">外语</td>
          </tr>
          
      </table></td>
    </tr>
    <tr>
      <td height="200" colspan="4" valign="bottom"><img src="${ctxStatic}/images/10.gif" width="491" height="198" /></td>
    </tr>
  </table>
  <table width="100" border="0" cellpadding="0" cellspacing="0" class="zj">
    <tr>
      <td width="186" height="232" align="center" valign="top" background="${ctxStatic}/images/14.gif"><table width="46%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="37" align="left"><span class="STYLE1">课程导航</span></td>
        </tr>
        <c:forEach items="${cateList}" var="cate" varStatus="status">
          <tr>
          <td height="32" align="left"><span class="STYLE6"><a href="#" class="cctv">  ${cate.categoryName}</a></span></td>
           </tr>
        <form id="cateform${status.index}" method="post" action="${ctx}/course/list">
            <input type="hidden" name="categoryNo" value="${cate.categoryNo}"></form>
        </c:forEach>
      </table></td>
         <td width="17" rowspan="2" align="center" valign="top">&nbsp;</td>
      <td width="491" rowspan="2" align="center" valign="top" background="${ctxStatic}/images/24.gif">
	    <table width="95%" height="21" border="0" cellpadding="0" cellspacing="0" class="ioio4">
        <tr>
         <td width="17%" height="19" align="center" valign="middle" background="${ctxStatic}/images/17.gif">
		  <table width="60" border="0" cellpadding="0" cellspacing="0" class="ioio5">
            <tr>
              <td><a href="#" class="STYLE5">免费体验课</a></td>
            </tr>
          </table>            <a href="#" class="STYLE5"></a>
		  </td>
          <td width="17%" align="left" valign="bottom" background="images/18.gif">
		  <table width="60" border="0" align="center" cellpadding="0" cellspacing="0" class="ioio5">
            <tr>
              <td><a href="#" class="STYLE1"></a></td>
            </tr>
          </table>            <a href="#"></a></td>
          <td width="17%" align="left" valign="bottom" background="images/18.gif"><table width="60" border="0" align="center" cellpadding="0" cellspacing="0" class="ioio5">
            <tr>
              <td><a href="#" class="STYLE1"></a></td>
            </tr>
          </table>            <a href="#"></a></td>
          <td width="17%" align="left" valign="bottom" background="images/18.gif"><table width="60" border="0" align="center" cellpadding="0" cellspacing="0" class="ioio5">
            <tr>
              <td><a href="#" class="STYLE1"></a></td>
            </tr>
          </table>            <a href="#"></a></td>
          <td width="16%" align="left" valign="bottom" background="images/18.gif"><table width="60" border="0" align="center" cellpadding="0" cellspacing="0" class="ioio5">
            <tr>
              <td><a href="#" class="STYLE1"></a></td>
            </tr>
          </table></td>
          <td width="16%" align="left" valign="bottom" background="images/18.gif"><table width="60" border="0" align="center" cellpadding="0" cellspacing="0" class="ioio5">
            <tr>
              <td><a href="#" class="STYLE1"></a></td>
            </tr>
          </table></td>
        </tr>
      </table>
      <table width="94%" height="126" border="0" cellpadding="0" cellspacing="0" class="hh">
          <tr>
            <td width="29%" height="134" rowspan="2" align="left" valign="top"><img src="images/21.gif" width="120" height="120" /></td>
            <td width="71%" height="24" align="left" valign="top"><span class="STYLE6"><strong>看好暑期培训 骐骥教育暑期班隆重登场！</strong></span></td>
          </tr>
          <tr>
            <td height="82" align="left" valign="top" class="wenzi">在2011年的春季，您是否希望快速提高学习成绩，找到适合的学习方法，骐骥教育春季精品辅导课程隆重推出了！<br />
            春季精品课程，紧密围绕课本大纲有针对性的进行辅导，不但帮助学生全面掌握各科知识...</td>
          </tr>
        </table>
           <table width="94%" border="0" cellpadding="0" cellspacing="0" class="wenzi1">
            <tr>
               <c:forEach items="${courseList}" var="course" begin="0" end="0" varStatus="status">
            <td width="6%" align="left" valign="middle"><img src="${ctxStatic}/images/22.gif" width="5" height="5" /></td>
            <td width="74%" align="left">
            <form id="clform${status.index}" method="post" action="${ctx}/course/detail">
            <input type="hidden" name="courseNo" value="${course.cNo}"></form>
             <div onclick="detail2(${status.index})">
            <a href="#" class="cctv1">${course.cName}！ 原价：￥${course.cPrice} 惊爆价:免费</a></div></td>
            <%-- <td width="20%" align="center">原价：￥${course.cPrice} 惊爆价:免费</td> --%></c:forEach>
          </tr>
          
          <c:forEach items="${courseList}" var="course" begin="1" end="5" varStatus="status">
          <tr align="left" valign="middle">
            <td colspan="3"><img src="${ctxStatic}/images/23.gif" width="465" height="1" /></td>
          </tr>
          <tr>
            <td align="left" valign="middle"><img src="${ctxStatic}/images/22.gif" width="5" height="5" /></td>
            <td align="left">
            <form id="clform${status.index}" method="post" action="${ctx}/course/detail">
            <input type="hidden" name="courseNo" value="${course.cNo}"></form>
            <div onclick="detail2(${status.index})">
            <a href="#" class="cctv1">${course.cName}原价：￥${course.cPrice} 惊爆价:免费</a>
            </div></td>
<!--             <td align="center"></td> -->
            </tr>
            </c:forEach>
          
       </table></td>
      <td width="17" rowspan="3" align="center" valign="top">&nbsp;</td>
      <td width="249" rowspan="3" align="center" valign="top" >
	  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="ui">
        <tr>
          <td align="center" valign="top" background="${ctxStatic}/images/76.gif"><table width="42%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="49" align="left"><span class="STYLE1">最新开班</span></td>
            </tr>
          </table>
             
             <c:forEach items="${classList}" var="cl" begin="0" end="2" varStatus="status">
              <div onclick="detail(${status.index})">
            <table width="74%" border="0" cellspacing="0" cellpadding="0">
              
              <tr>
                <td width="10%" align="left" valign="middle"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                <td width="90%" align="left"><span class="STYLE12">${cl.className}</span></td>
              </tr>
            </table>
            <table width="74%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="52" align="left">&nbsp;&nbsp;剩余名额：${cl.classTotal-cl.classIn}</td>
              </tr>
            </table>
            <table width="74%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="18" align="right"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
              </tr>
            </table>
            <form id="classform${status.index}" method="post" action="${ctx}/class/detail">
            <input type="hidden" name="classNo" value="${cl.classNo }"></form>
            </div></c:forEach>
            </td>
        </tr>
      </table>
        
    <tr>
      <td height="145" valign="bottom"><img src="${ctxStatic}/images/15.gif" width="186" height="130" /></td>
    </tr>
    
    <tr>
      <td colspan="3" valign="bottom"><img src="${ctxStatic}/images/16.gif" width="694" height="90" /></td>
    </tr>
  </table>
   
  <table width="1440" border="0" cellpadding="0" cellspacing="0" class="dibu">
    <tr>
      <td><table width="449" border="0" align="center" cellpadding="0" cellspacing="0" class="dibug">
        <tr>
          <td width="449"><a href="#" class="cctv3">首页</a>  　|  　<a href="#" class="cctv3">课程中心</a>　  |  　<a href="#" class="cctv3">评测专区</a>　  |　  <a href="#" class="cctv3">成果展示</a>　  |  　<a href="#" class="cctv3">在线购买</a>　  |  　<a href="#" class="cctv3">活动专区</a></td>
        </tr>
        <tr>
          <td align="center">徐家汇.天钥桥路380弄31号.南溪公寓.裙房一至三层</td>
        </tr>
        <tr>
          <td align="center">骐骥教育版权所有   沪ICP备08020898号 </td>
        </tr>
      </table></td>
    </tr>
  </table>
</div>
<script src="${ctxStatic}/js/jquery-1.3.2.min.js" type="text/javascript"></script>
<script src="${ctxStatic}/js/function.js" type="text/javascript"></script>
<script type="text/javascript" src="${ctxStatic}/js/analytics.js"></script>
<script type="text/javascript">
function detail(i){
	document.getElementById('classform'+i).submit();
}
function list(i){
	document.getElementById('cateform'+i).submit();
}
function search(){
	document.getElementById('searchform').submit();
}
function detail2(i){
	document.getElementById('clform'+i).submit();
}
</script>
</body>
</html>
