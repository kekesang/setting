<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${ctxStatic}/css/css.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${ctxStatic}/js/jquery.min.js"></script>
<script src="${ctxStatic}/js/zzsc.js"></script>
<script type="text/javascript" src="${ctxStatic}/js/jquery-1.4.2.min.js"></script>
<script src="${ctxStatic}/js/tips.js" type="text/javascript"></script>
<script type="text/javascript" src="${ctxStatic}/js/lm.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="topbox">
  <div class="top">
    <div class="tr"><!-- 您好，xxx，欢迎登陆泽寓仓储管理系统 -->。<a href="#">[帮助]</a>  <a href="#">[退出]</a></div>
    <div class="tl">咨询热线：<span>400-123-4367</span></div>
  </div>
</div>
<div class="head">
  <div class="logo fl"><a href="#"><img src="${ctxStatic}/images/logo.png" alt=""/></a></div>
  <div class="sear fl">
  <form  id="searchform" action="${ctx}/course/search">
  <input name="cour" id="cour" type="text" class="sear_inp" value="请输入课程名称" onFocus="if (value =='请输入课程名称'){value =''}" onBlur="if (value ==''){value='请输入课程名称'}"/><input type="button" class="sear_btm" value="搜索" onclick="search()"/>
   </form></div>
 
  <!-- <div class="carl fl relative">
    <div class="carn absolute">1</div>
    <div class="carlh4 relative" id="menu_about"><a href="#">待出库清单</a></div>
    <div class="sub-columns absolute" id="sub_menu_about">
     </div>
  </div> -->
</div>
<div class="clear"></div>
 
 <div class="nav">
  <div class="nav1 fl"><!-- <a href="#">我的收藏</a></div>
  <div class="nav2 fl"><a href="#"><img src="images/qq.jpg"/></a></div>
  <div class="nav3 fl"><a href="#"><span>1</span></a> --></div>
</div> 
<div class="main">
  <div class="left fl">
    <ul id="menu">
     <li > <a href="#">关于</a></li>
    <li><a href="#">全部课程分类</a>
    <ul>
       <c:forEach items="${cateList}" var="cate" varStatus="status">
          <div onclick="list(${status.index})">
         <li><a>&nbsp; ${cate.categoryName}</a></li></div>
        <form id="cateform${status.index}" method="post" action="${ctx}/course/list">
            <input type="hidden" name="categoryNo" value="${cate.categoryNo}"></form>
        </c:forEach> 
        <!--  <li><a>&nbsp;零基础 </a></li>
         <li><a>&nbsp;听力</a></li>
         <li><a>&nbsp;口语</a></li>
         <li><a>&nbsp;出国</a></li>
         <li><a>&nbsp;四六级</a></li>
         <li><a>&nbsp;少儿英语 </a></li> -->
    </ul>
    </li>
    <li ><a href="${ctx}/class/teacher">名师专区</a>
     <!-- <ul>
       
        <li><a>&nbsp;</a></li>

    </ul> --></li>
    <li ><a href="#">精品试听课</a></li>
    <li ><a href="#">我的收藏</a></li>
  
   </ul>
  </div>
  <div class="rigt fl">
  
    <div class="rp">
    <div class="rm"></div>
     <div class="homep1">
     <img  width="980px"  margin-left="20px" src="${ctxStatic}/images/home-banner-img1.jpg"/></div>
      <div class="gm"></div>
      <div class="mm"><strong>最新开班</strong></div>
      <div class="mmm">
       <ul>
         <c:forEach items="${classList}" var="c" begin="0" end="2" varStatus="status">
        <li><a href="#?w=600" rel="popup1" class="poplight"><img src="${ctxStatic}/images/oo2.jpg"/></a>
          <p><a href="#">${c.className}</a></p>
          <%-- <div class="rpc1">
            <dl><dt class="rpc1_3"><span>${c.className}</span></dt>
            </dl>
          </div> --%>
          <div class="rpc2">
            <dl>
             <!--  <dt><a href="#"></a></dt> -->
               <div onclick="detail(${status.index})">
               <dt style="margin-left:34px;"><a href="#">查看详情</a></dt></div>
            </dl>
          </div>
           <form id="classform${status.index}" method="post" action="${ctx}/class/detail">
            <input type="hidden" name="classNo" value="${c.classNo}"></form>
        </li></c:forEach>
             
        </ul>
        </div>
        <div class="gm"> <a href="#">more</a></div>
        <div class="mm"><strong>精品免费课</strong></div>
         <div class="mmm">
         <ul>
         
         <c:forEach items="${courseList}" var="course" begin="0" end="2" varStatus="status">
         <li><div class="list1"><!-- <a href="#?w=600" rel="popup1" class="poplight"> -->
          <img src="${ctxStatic}/images/oo2.jpg"/></a>
          
          <h2>${course.cName}</h2>
          <label>原价：￥${course.cPrice}惊爆价：<span>￥${course.cDprice}</span> </label>
         
    <%--       
          <div class="rpc1">
            <dl><dt class="rpc1_3">原价：￥${course.cPrice}惊爆价：<span>￥${course.cDprice}</span></dt>
            </dl>
          </div> --%> 
          <div class="rpc2">
            <dl>
               <div onclick="detail2(${status.index})">
              <dt style="margin-left:34px;"><a href="#">查看详情</a></dt></div>
            </dl>
             <form id="clform${status.index}" method="post" action="${ctx}/course/detail">
            <input type="hidden" name="courseNo" value="${course.cNo}"></form>
          </div>
        </li>
      
        </c:forEach>
          </ul>
         </div> 
        <div class="gm"> <a href="#">more</a></div>
    </div>
  <!--END POPUP-->
    <script type="text/javascript" src="${ctxStatic}/js/lightbox.js"></script>
    <div class="clear"></div>
    <!-- <div class="page">
      <a><span class="prev-disabled">上一页</span></a><a href="#">1</a><a href="#">2</a><a href="#">3</a><a href="#">4</a><a href="#">5</a><a href="#">6</a><span class="next"><a href="#">下一页</a></span>
    </div> -->
  </div>
</div>
<div class="footbox">
<span>友情链接：</span>
地址：北京朝阳区慈云寺路1号东区国际4号楼3A01 电话/传真：010-87336858 合作邮箱：13910624139@139.com<br />
保定新网 技术支持
</div>
<script type="text/javascript">

</script>
</body>
</html>