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
  <div class="logo fl"><a href="#"><img src="${ctxStatic}/images/logo.jpg" alt=""/></a></div>
  <div class="sear fl"><input name="" type="text" class="sear_inp" value="请输入产品名称/产品编号/出库单编号/入库单编号 ..." onFocus="if (value =='请输入产品名称/产品编号/出库单编号/入库单编号 ...'){value =''}" onBlur="if (value ==''){value='请输入产品名称/产品编号/出库单编号/入库单编号 ...'}"/><input type="button" class="sear_btm" value="搜索"/></div>
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
    <h5>我的库房</h5>
    <div class="wrap-menu"></div><script src="${ctxStatic}/js/lm.js"></script>
    <h5><a href="#">出库单管理</a></h5>
    <h5><a href="#">入库单管理</a></h5>
    <h5><a href="#">我的资料</a></h5>
    <h5><a href="#">我的收藏</a></h5>
  </div>
  <div class="rigt fl">
  <div class="rm"></div>
    <div class="rp">
    </div>
  <!--END POPUP-->
    <script type="text/javascript" src="${ctxStatic}/js/lightbox.js"></script>
    <div class="clear"></div>
    <div class="page">
      <span class="prev-disabled">上一页</span></a><a href="#">1</a><a href="#">2</a><a href="#">3</a><a href="#">4</a><a href="#">5</a><a href="#">6</a><span class="next"><a href="#">下一页</a></span>
    </div>
  </div>
</div>
<div class="footbox">
<span>友情链接：</span>
地址：北京朝阳区慈云寺路1号东区国际4号楼3A01 电话/传真：010-87336858 合作邮箱：13910624139@139.com<br />
保定新网 技术支持
</div>
</body>
</html>