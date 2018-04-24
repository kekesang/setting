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
  <div class="nav1 fl"> <a href="${ctx}/home">首页</a></div>
<!--   <div class="nav2 fl"><a href="#"></div>
  <div class="nav3 fl"><a href="#"></a> </div> -->
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
    <div id="container">
<div id="has-divider ">
<p>班级名称：${cla.className}</p>
<p>班级名称：${cla.classPrice}</p>
<p>班级名称：${cla.classNums}</p>
<p>班级名称：${cla.classBegin}~${cla.classEnd}</p>
<p>班级名称：${tea1.teaName}</p>
<p>班级名称：${tea1.teaMajor}</p>
<p>班级名称：${c.cName}</p>
<p>班级名称：${c.cMajor}</p>
<input type="button" id="add" value="立即报名" />

<input type="button" id="talk" value="在线咨询" />
</div>
</div>
    
    </div>
    </div>
</div>
<div class="small-description-2">
  <h2>Awesome <span>专业 </span>培训学校</h2>
  <label>The Extensio is a simple and clean template suitable for companies </label>
</div>
<script type="text/javascript">
</script>
</body>
</html>