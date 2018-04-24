<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>班级信息</title>
</head>
<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/global.css">
<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/index.css">
<body>
<div id="index4">
  <table width="200" border="0" align="center" cellpadding="0" cellspacing="0" class="top">
    <tr>
      <td width="197" rowspan="3" align="center"><a href="index.html"><img src="${ctxStatic}/images/1.gif" width="153" height="46" /></a></td>
      <td width="77" rowspan="3" class="daohang">&nbsp;</td>
      <td width="608" height="24" align="right" valign="bottom" class="STYLE13"><a href="${ctx}/" class="STYLE14">首页</a>&nbsp; <span class="STYLE14"><a href="#" class="STYLE14">登录</a></span> <span class="STYLE14"><a href="#" class="STYLE14">免费注册</a> </span><img src="${ctxStatic}/images/144.gif" width="14" height="12" /> 购物车 | 我的骐骥 </td>
      <td width="78" class="daohang">&nbsp;</td>
    </tr>
    <tr>
      <td height="18" colspan="2" class="daohang">&nbsp;</td>
    </tr>
    <tr>
      <td colspan="2" valign="top" class="daohang"><a href="../index.html">首页</a> 　<a href="#">学校简介</a>　 <a href="kechengfangan.html">名师专区</a>　 <a href="jiaoyuzixun.html">教育资讯</a>　 <a href="zhuanjiawenda.html">专家问答</a> 　<a href="#">课程订购</a> 　<a href="#">教辅产品</a> 　<a href="#">学员社区</a></td>
    </tr>
  </table>
  <table width="960" border="0" cellpadding="0" cellspacing="0" class="kg">
    <tr>
      <td><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http//download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="1440" height="198">
        <param name="movie" value="${ctxStatic}//flash/01.swf" />
        <param name="quality" value="high" />
        <embed src="${ctxStatic}/flash/01.swf" quality="high" pluginspage="http//www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="1440" height="198"></embed>
      </object></td>
    </tr>
  </table>
  <table height="618" border="0" cellpadding="0" cellspacing="0" class="shangp1">
    <tr>
      <td width="699" height="229" rowspan="2" align="center" valign="top"><table width="100%" height="43" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td background="${ctxStatic}/images/72.gif"><table width="100" border="0" cellspacing="0" cellpadding="0">
              <td  align="center"> <span class="STYLE7"><strong>${cla.className}</strong></span></td>
            </table></td>
          </tr>
        </table>
        <table width="100%" border="0" cellpadding="0" cellspacing="0" class="kl2">
          <tr>
            <td width="4%" class="hanggao2">&nbsp;</td>
                        <td width="54%" align="left" class="hanggao2"><span class="STYLE10"><strong>课程费用：</strong></span><span class="STYLE8">￥${c.cDprice} 原价${c.cPrice}</span></td>
            <td width="42%" rowspan="8" align="left" valign="top"><img src="${ctxStatic}/images/73.gif" width="240" height="200" /></td>
          </tr>
         <tr align="left" class="hanggao2">
            <td>&nbsp;</td>
            <td align="left"><span class="STYLE10"><strong>适合年级：</strong>高三</span></td>
          </tr>
          <tr align="left" class="hanggao2">
            <td>&nbsp;</td>
            <td align="left"><span class="STYLE10"><strong>科目种类：</strong>英语</span></td>
          </tr>
          <tr align="left" class="hanggao2">
            <td>&nbsp;</td>
            <td align="left"><span class="STYLE10"><strong>班级人数：</strong>${cla.classTotal}</span></td>
          </tr>
          <tr align="left" class="hanggao2">
            <td>&nbsp;</td>
            <td align="left"><span class="STYLE10"><strong>已报人数：</strong>${cla.classIn}</span></td>
          </tr>
          <tr align="left" class="hanggao2">
            <td>&nbsp;</td>
            <td align="left"><span class="STYLE10"><strong>开课时间：</strong>${cla.classBegin}-${cla.classEnd}&nbsp;${cla.classStatus}</span></td>
          </tr>
          <tr align="left" class="hanggao2">
            <td>&nbsp;</td>
            <td align="left"><span class="STYLE10"><strong>上课地址：</strong>${cla.classAddress}</span></td>
          </tr>
          <tr align="left" class="hanggao2">
            <td>&nbsp;</td>
            <td align="left"><span class="STYLE10"><strong>课次：</strong>${cla.classNums}</span></td>
          </tr>
        </table>
        <table width="699" border="0" align="left" cellpadding="0" cellspacing="0" class="kl2">
          <tr>
            <td width="4" rowspan="2">&nbsp;</td>
            <td width="168" height="44" align="center"><a href="#"><img src="${ctxStatic}/images/74.gif" width="170" height="43" /></a></td>
            <td width="527" align="left">&nbsp;</td>
          </tr>
          <tr>
            <td height="609" colspan="2" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="0" cellspacing="0" cellpadding="0" style="line-height:26px; margin-top:20px;">
                  <tr>
        <td width="10" background="${ctxStatic}/images/kcxx_img_09.gif">&nbsp;</td>
                    <td width="685" height="30" background="${ctxStatic}/images/78.gif" class="kcxq"><ul>
                        <li class="xxlb_line kcxq_mouse">课程描述</li>
                     <!--  <li class="xxlb_line"><a href="#">教学目标</a></li>
                      <li class="xxlb_line"><a href="#">适合学员</a></li>
                      <li class="xxlb_line"><a href="#">教学计划</a></li>
                      <li class="xxlb_line"><a href="#">教授师资</a></li>
                      <li class="xxlb_line"><a href="#">组合优惠</a></li>
                      <li class="xxlb_line"><a href="#">课程安排</a></li> -->
                    </ul></td>
                  </tr>
                  <tr>
                    <td height="30">&nbsp;</td>
                    <td height="30"><p class="hanggao6">&nbsp;</p>
                        <p class="hanggao6">课程描述 <br />
                          ·名校在职名师授课<br />
                          ·课程内容：30%基础+70%加难加深拓展题；着重训练解题思路例如：1题多解能力训练。 </p>
                      <p class="hanggao6">教学目标 <br />
                        清华大学、北京大学、复旦大学、交通大学、香港大学等国家著名大学； </p>
                      <p class="hanggao6">适合学员 <br />
                        示范性学校年级组排名前50名，有较强学习能力和良好学习习惯的学生 </p>
                      <p class="hanggao6">教学计划 <br />
                        请致电教学机构咨询 </p>
                      <p class="hanggao6">教授师资 <br />
                        四大名校及示范性学校在职教研组长、学科带头人、特级在职教师、区教研员、市金牌竞赛教练 </p>
                      <p class="hanggao6">开课中心 <br />
                        徐汇中心</p></td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
          </tr>
      </table></td>
      <td width="12" rowspan="2">&nbsp;</td>
      <td width="249" height="227" align="center" valign="top" background="${ctxStatic}/images/9.gif"><table width="90%" border="0" cellspacing="0" cellpadding="0">
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
      <td align="center" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="ui">
        <tr>
          <td align="center" valign="top" background="${ctxStatic}/images/76.gif"><table width="42%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="49" align="left"><span class="STYLE1">最新课程</span></td>
            </tr>
          </table>
            <table width="74%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="10%" align="left" valign="middle"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                <td width="90%" align="left"><span class="STYLE12">2011年暑期优惠周</span></td>
              </tr>
            </table>
            <table width="74%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="52" align="left">教学特色：在物理教学中形成了自己的梯...</td>
              </tr>
            </table>
            <table width="74%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="18" align="right"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="15%" height="27" align="center"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="22" valign="top"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="15%" height="27" align="center"><img src="../images/31.gif" width="4" height="4" /></td>
                <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="22" valign="top"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="15%" height="27" align="center"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="21" valign="top"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="15%" height="27" align="center"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="24" valign="top"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
              </tr>
            </table>
            <table width="90%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="15%" height="27" align="center"><img src="../images/31.gif" width="4" height="4" /></td>
                <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
              </tr>
            </table></td>
        </tr>
      </table>
        <table width="100%" border="0" cellpadding="0" cellspacing="0" class="iu">
          <tr>
            <td align="center" valign="top" background="../images/77.gif"><table width="42%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="49" align="left"><span class="STYLE1">最新课程</span></td>
              </tr>
            </table>
              <table width="74%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="10%" align="left" valign="middle"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                  <td width="90%" align="left"><span class="STYLE12">2011年暑期优惠周</span></td>
                </tr>
              </table>
              <table width="74%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td height="52" align="left">教学特色：在物理教学中形成了自己的梯...</td>
                </tr>
              </table>
              <table width="74%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td height="18" align="right"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
                </tr>
              </table>
              <table width="90%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="15%" height="27" align="center"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                  <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
                </tr>
              </table>
              <table width="90%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td height="25" valign="top"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
                </tr>
              </table>
              <table width="90%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="15%" height="27" align="center"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                  <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
                </tr>
              </table>
              <table width="90%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td height="21" valign="top"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
                </tr>
              </table>
              <table width="90%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="15%" height="27" align="center"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                  <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
                </tr>
              </table>
              <table width="90%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td height="18" valign="top"><img src="${ctxStatic}/images/33.gif" width="184" height="14" /></td>
                </tr>
              </table>
              <table width="90%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="15%" height="27" align="center"><img src="${ctxStatic}/images/31.gif" width="4" height="4" /></td>
                  <td width="85%" align="left"><span class="STYLE12"><a href="#" class="cctv2">2011年暑期优惠周</a></span></td>
                </tr>
              </table></td>
          </tr>
        </table></td>
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
<<script src="${ctxStatic}/js/jquery-1.3.2.min.js" type="text/javascript"></script>
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
