<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html >
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>主页</title>
		<link href="css/zym/index.css" rel="stylesheet" type="text/css"/>
		<link rel="stylesheet" href="css/zym/reveal.css">	
		<script type="text/javascript" src="js/zym/jquery-1.8.3.js" ></script>
		<script type="text/javascript" src="js/zym/jquery.reveal.js"></script>
        <script type="text/javascript" src="js/zym/js1.js"></script>
<script type="text/javascript">
			 $(document).ready(function(){
				 $("#last01").mouseover(function(){
					 $("#downlist").css("display","block");
					 })
			
				 $("#last01").mouseout(function(){
					 $("#downlist").css("display","none");
					 })
			 });			
    </script>
</head>
<body style="height:900px;">
  <div class="hopemodelpage">
 	 <!--随屏滚动的图片漂浮广告 开始-->
    <div class="advertisement" id="advertisement_01" ><img src="images/zym/ad.gif" class="ad"/></div>
    <div class="advertisement" id="advertisement_02" ><img src="images/zym/ad.gif" class="ad"/>
    	<div ><a id="close">关闭</a></div>
    </div>
    <!--随屏滚动的图片漂浮广告 结束-->
  	<div class="topadbanner"><img src="images/zym/topadbanner.jpg" /></div>
     <div id="top_protools">

    	<div class="welcome">
                    <div id="FnoLogin" class="fl" style="display: block;">
                        <span class="fl">欢迎来到货运通物流平台！</span>
                        <span class="fl"><a  href="${pageContext.request.contextPath}/jbyh_logOn.action" class="colory">请登录</a></span>
                        <span class="fl"><a  href="${pageContext.request.contextPath}/jbyh_preregister.action">免费注册</a></span>
                        <span class="fl"><a  href="#">忘记密码？</a></span>
                    </div>
                    <div id="FhasLogin" class="fl" style="display: none;">
                        <span class="fl">您好！已登录</span>
                        <span class="fl yonghm"><a class="redd" href="#" target="_blank">
                        <span id="FuserName"></span></a></span><span class="fl "><a class="redd" href="#" target="_blank">[进入会员中心]</a></span>
                        <span class="fl"><span onclick="outLogin();" class="hui9" style="cursor: pointer">退出</span></span>
                    </div>
       </div>
                
    	<a class="polling">物流查询</a>
    </div>
     <div class="header_img">
    	<img src="images/zym/logo_n.png" />
      <!--图片轮换开始-->
		<div id="picture">
            <div class="picture_img"><img src="images/zym/header_img_01.jpg" /></div>
            <div class="picture_img"><img src="images/zym/header_img_02.jpg"/></div>
            <div class="picture_img"><img src="images/zym/header_img_03.gif"/></div>
            <div class="picture_img"><img src="images/zym/header_img_04.jpg"/></div>   
       </div>
       <!--图片轮换结束-->
    </div>
    
     <div class="nav"> <!--橘色导航条开始-->
    	<ul>
        	<li><a href="#">首 页</a></li>
            <li><a href="#">物流园区</a></li>
            <li><a href="#">货源信息</a></li>
            <li><a href="#">车源信息</a></li>
            <li><a href="#">物流专线</a></li>
            <li><a href="#">整车货运</a></li>
            <li><a href="#">国际物流</a></li>
            <li><a href="#">搬家公司</a></li>
            <li><a href="#">快递公司</a></li>
            <li><a href="#">物流加盟</a></li>
            <li><a href="#">物流招标</a></li>
            <li><a href="#">物流设备</a></li>
            <li><a href="#">人才</a></li>
            <li><a href="#">物流资讯</a></li>
        </ul>
    </div> <!--橘色导航条结束-->
   
    <div class="nav02">
    	<a class="first01">分站</a>
        <a href="#">北京</a>
        <a href="#">上海</a>
        <a href="#">广东</a>
        <a href="#">浙江</a>
        <a href="#">江苏</a>
        <a href="#">天津</a>
        <a href="#">重庆</a>
        <a href="#">山西</a>
        <a href="#">山东</a>
        <a href="#">河南</a>
        <a href="#">四川</a>
        <a href="#">湖北</a>
        <a href="#">福建</a>
        <a href="#">陕西</a>
        <a href="#">湖南</a>
        <a href="#">云南</a>
        <a href="#">广西</a>
        <a href="#">安徽</a>
        <a href="#">河北</a>
        <a href="#">海南</a>
        <a href="#">辽宁</a>
        <a href="#">青海</a>
        <a href="#">吉林</a>
        <a href="#">甘肃</a>
        <a href="#">江西</a>
        <span>
        	<a id="last01" >更多</a>
            <div id="downlist"  >
            	  	<a href="#">黑龙江</a>
                    <a href="#">内蒙古</a>
                    <a href="#">宁夏</a>
                    <a href="#">贵州</a>
                    <a href="#">香港</a>
                    <a href="#">新疆</a>
                    <a href="#">台湾</a>
                    <a href="#">西藏</a>
                    <a href="#">澳门</a>
            </div>
        </span>  
    </div>
    <!--中间盒子开始-->
    <div class="main_box">
    	<!--左-->
    	<div class="left">
			<ul id="tabfirst">
                <li class="aa" name="li">
                    <a href="javascript:void(0)">专线直达</a>
                </li>
                <li class="aa" name="li">
                    <a href="javascript:void(0)">同城配送</a>
                </li>
                <li class="aa" name="li">
                    <a href="javascript:void(0)">长途整车</a>
                </li>
                <li class="aa" name="li">
                    <a href="javascript:void(0)">同城包车</a>
                </li>
            </ul>
            <div class="content_main">
                 <div class="left_main main_01">
                        <span id="select_tips">物通推荐物流承运商，提供免费上门接货和送货到家服务，发货省心又省钱! </span>
                        <div class="chose">
                            <label for="port">发货地</label>
                   
                            <input class="qi" id="tc_from" data-reveal-id="myModal" value="您的货物在哪里？" wtmap="{c:'tc_from',cb:true}" readonly="readonly" type="text">
                        </div>
                        <div class="chose">
                            <label for="land">收货地</label>
                            <input class="end" id="tc_to" data-reveal-id="myModal" value="把货运到哪里？" wtmap="{c:'tc_to',cb:true}" readonly="readonly" type="text">
                        </div>
                        <a class="menu" onclick="fahuoa()" href="javascript:void(0)">在线下单</a>
            	 </div>
            </div >
            <ul class="infor">
                  <li>
                     <img src="images/zym/h012016.png">
                     <p class="infor1">当前货源</p>
                     <p class="infor2"><a class="infor2" target="_blank" href="  ">2,316,241</a></p>
                  </li>
                  <li class="infor02">
                      <img src="images/zym/z022016.png">
                      <p class="infor1">物流专线</p>
                      <p class="infor2"><a class="infor2" target="_blank" href="  ">12,133,034</a></p>
                    </li>
                    <li>
                      <img src="images/zym/car032016.png">
                      <p class="infor1">车辆信息</p>
                      <p class="infor2"><a class="infor2" target="_blank" href=" ">285,388</a></p>
                  </li>
            </ul>
            <div id="myModal" class="reveal-modal">
                 <div id="demo2" class="citys">
                        <select class="province" name="province"></select>
                        <select class="city" name="city"></select>
                        <select class="area" name="area"></select>
                        <input class="qr" type="button" value="确认" />
                </div>
            </div>
        </div>
   		<!--/左-->
    	<!--右-->
        <div class="right">
           <div class="right_01">
            	<a href="${pageContext.request.contextPath}/jbyh_preregister.action" class="reg" target="_blank" >免费注册</a>
                <a href="${pageContext.request.contextPath}/jbyh_logOn.action" class="login" target="_blank" >登录</a>
            </div>
            
            <div class="right_02">
            	
            </div>
            
            <div class="right_03">
            	<a class="news">网站公告</a>
            	<ul>
                	<li><p><a class="news_text" href="#"  target="_blank" >关于落实《中华人民共和国网络安全法》的公告</a></p></li>
                    <li><p><a class="news_text" href="#" target="_blank" >货运通物流平台关于修改服务规则的重要提示</a></p></li>
                </ul>
            </div>
            <div class="right_04">
            	<img src="images/zym/qq.gif" />
            </div>
           <div class="right_05">
            	<a class="query">物流单号查询</a>
                <div class="querybox">
                    <a class="query_text">德邦物流</a>
                    <a class="query_text">天地华宇</a>
                    <a class="query_text">新邦物流</a>
                    <a class="query_text">远成物流</a>
                    <a class="query_text">速尔物流</a>
                    <a class="query_text">佳怡物流</a>
                    <a class="query_text">申通物流</a>
                    <a class="query_text">中铁物流</a>
                    <a class="query_text">龙邦物流</a>
                    <a class="query_last">更多</a> 
               </div>
           </div>
        </div>
    	<!--/右-->
    </div>
    <!--中间盒子结束-->
    <!--蓝色大图片-->
    <div class="img_center">
   		<img src="images/zym/s_636283013958617500.gif"  width="1040" height="60" border="0">
    </div>
    
        <div class="main_line"><!--物流专线开始-->
    	<div class="line_left"><!--物流专线左边开始-->
            <div class="line_left_heading"><!--物流专线左边头部开始-->
            	<div class="line_left_heading_title">找物流专线</div>
                <div class="line_left_heading_choose">
                	<div class="line_left_heading_choose_f1">出发地:</div>
                    <div class="line_left_heading_choose_inputbox">
                   		 <input class="inputf1" id="wlLineTo" name="wlLineTo" value="请选择 省-市-县" wtmap="{c:'wlLineTo',cb:false}" readonly="readonly" type="text">
                    </div>
                    <div class="line_left_heading_choose_f1">到达地:</div>
                    <div class="line_left_heading_choose_inputbox">
                   	 	<input class="inputf1" id="wlLineTo" name="wlLineTo" value="请选择 省-市-县" wtmap="{c:'wlLineTo',cb:false}" readonly="readonly" type="text">
                    </div>
                    <div class="inputbox_search">
                        <input id="btnSearchWl" class="buttons" onclick="searchWlLine(val('wlLineFrom'), val('wlLineTo'))" value="" type="button">
                    </div>
                    <div class="more">
                    	<a href="#" target="_blank">更多&gt;&gt;</a>
                    </div>
               </div>   
            </div>   <!--物流专线左边头部结束-->
            <div class="line_nav">
            	<ul class="line_nav_ul">
               		<li class="t1">出发地 → 到达地</li>
                    <li class="t2">公司名称</li>
                    <li class="t3">会员类型</li>
                    <li class="t4">重货价格</li>
                    <li class="t5">轻货价格</li>
                    <li class="t6">时效</li>
                    <li class="t7">发车频率</li>
                    <li class="fahuot">发货</li>
                </ul>	
            </div>            
      		<div class="line_left_content"><!--找物流专线开始-->
            	<div class="shell">
                	 <div id="div1">
       				 	<ul>
             		     <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市天承货运中心</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     
                     <li>
                     	<span class="t1"><a>河南&nbsp;郑州&nbsp;新郑</a>--><a>河南&nbsp;新乡</a></span>
                        <span class="t2"><a>河南礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">0.7</i>元/公斤</span>
                        <span class="t5">180元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">两天一次</span>
                        <span class="fahuo"></span>
                     </li>
                     
	     			 <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">0.35</i>元/公斤</span>
                        <span class="t5">120元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     
       				 <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/min-tjcys.png" /></span>
                        <span class="t4"><i class="zhong">0.4</i>元/公斤</span>
                        <span class="t5">80元/立方</span>
                        <span class="t6">时效1天</span>
                        <span class="t7">1天1次</span>
                        <span class="fahuo"></span>
                     </li>
                     
                     <li>
                       <span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">0.2</i>元/公斤</span>
                        <span class="t5">60元/立方</span>
                        <span class="t6">时效1天</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     
       				 <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     
       				      <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                      <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     
       				 <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     
       				 <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
       				     <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     
       				 <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     
       				 <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                     <li>
                     	<span class="t1"><a>河南&nbsp;郑州</a>--><a>内蒙古&nbsp;呼伦浩特&nbsp;根河</a></span>
                        <span class="t2"><a>郑州市礼邦物流有限公司</a></span>
                        <span class="t3"><img src="images/zym/wxthome.gif" /></span>
                        <span class="t4"><i class="zhong">1</i>元/公斤</span>
                        <span class="t5">160元/立方</span>
                        <span class="t6">时效小时</span>
                        <span class="t7">不详</span>
                        <span class="fahuo"></span>
                     </li>
                		</ul>
                	 </div>
           		</div>   
            </div><!--找物流专线结束-->
        </div><!--物流专线左边结束-->
        <div class="line_right"><!--物流专线右边开始-->
        	<a class="safe">在线发货保障</a>
            <div class="safebox">
                <div class="safe_box">
                	<div class="safe_right">
                        <i class="safe_img_01"></i>
                        <div class="safe_text_box">
                            <p class="safe_text_title">一站式发货</p>
                            <p class="safe_text">在线下单,轻松一键搞定</p>
                   		</div>
                	</div>
                </div>
                
                <div class="safe_box">
                	<div class="safe_right">
                        <i class="safe_img_02"></i>
                        <div class="safe_text_box">
                            <p class="safe_text_title">门到门接送</p>
                            <p class="safe_text">全程一票制,服务门到门</p>
                   		</div>
                	</div>
                </div>
                
                <div class="safe_box">
                	<div class="safe_right">
                        <i class="safe_img_03"></i>
                        <div class="safe_text_box">
                            <p class="safe_text_title">下单就省钱</p>
                            <p class="safe_text">先比价后下单在线支付优惠多</p>
                   		</div>
                	</div>
                </div>
                
                <div class="safe_box">
                	<div class="safe_right">
                        <i class="safe_img_04"></i>
                        <div class="safe_text_box">
                            <p class="safe_text_title">先行赔付</p>
                            <p class="safe_text">你发货,我投保,先行赔付</p>
                   		</div>
                	</div>
                </div>
            </div>
        </div><!--物流专线右边结束-->
    </div><!--物流专线结束-->
    <div class="line_1px"></div>
   <div class="footer">
   		<img class="online" src="images/zym/online.gif" />
        <div class="footer_l"></div>
        <div class="footer_r">
			<p>
            	<a href="#"> 关于我们</a><span class="h_ge">|</span>
                <a href="#"> 物通风姿</a><span class="h_ge">|</span>
                <a href="#"> 挑错有礼</a><span class="h_ge">|</span>
                <a href="#"> 诚聘英才</a><span class="h_ge">|</span>
                <a href="#"> 服务与产品</a><span class="h_ge">|</span>
                <a href="#"> 使用与帮助</a><span class="h_ge">|</span>
                <a href="#"> 服务条款</a><span class="h_ge">|</span>
                <a href="#"> 加盟我们</a><span class="h_ge">|</span>
                <a href="#"> 付款方式</a><span class="h_ge">|</span>
                <a href="#"> 友情链接</a><span class="h_ge">|</span>
                <a href="#"> 客服中心</a><span class="h_ge">|</span>
                <a href="#"> 联系我们</a><span class="h_ge">|</span>
                <a href="#"> 网站地图</a><span class="h_ge">|</span>
            </p>
            <p>
            	<span class="pr5">
                	版权所有：
                    <a href="#">货运通物流平台</a>
                    客服免费电话：
                    <a href="#">400-010-5656</a>
                    常年法律顾问：
                    <a href="#">河南班固律师事务所</a>
                    <a href="#">刘镕诚律师</a>
                </span>
            </p>
            <p>
            	<span>免责声明：本站只起到物流信息平台作用，内容的真实准确性以及物流过程中出现的任何风险均由发布者负责，与平台无关。</span>
            </p>
            <p>
            	<span class="pr5"> 备案：<a href="#">粤ICP备17120651号</a></span>
                <span class="h_ge">|</span>
                <span class="pr5 red"> 增值电信业务许可证：<a href="#" class="red">粤ICP备17120651号</a></span>
            </p>
            <p>
            	<span class="pr5">客服1：<img src="images/zym/a01.png" /></span>
                <span class="pr5">客服2：<img src="images/zym/a01.png" /></span>
                <span class="pr5">客服3：<img src="images/zym/a01.png" /></span>
                <span class="pr5">商务洽谈：<img src="images/zym/a01.png" /></span>
            </p>
            <p>
            	<span class="pr5">Copyright © 2007-2017 www.huoyuntong.top All rights reserved.</span>
                <span class="pr5">建议使用1440*900分辨率访问货运通物流平台</span>
            </p>
        </div>
   </div>
  </div>
</body>
<script>
//随屏滚动的图片漂浮广告 开始

function fahuoa(){
	window.location="jbyh_logOn.action";
}
		var id=function(o){return document.getElementById(o)}
		var scroll=function (o){
		var space=id(o).offsetTop;
		id(o).style.top=space+'px';
		void function(){
		var goTo = 0;
		var roll=setInterval(function(){
		var height =document.documentElement.scrollTop+document.body.scrollTop+space;
		var top = parseInt(id(o).style.top);
		if(height!= top){
		goTo = height-parseInt((height - top)*0.9);
		id(o).style.top=goTo+'px';
		}
		//else{if(roll) clearInterval(roll);}
		},50);
		}()
		}
		scroll('advertisement_01');
		scroll('advertisement_02');
	//随屏滚动的图片漂浮广告 结束
	//关闭广告
	$("#close").click(function(){
 			 $(".advertisement").hide();
		});
	//控制物流向上滚动
	var box=document.getElementById("div1"),can=true;
	box.innerHTML+=box.innerHTML;
	box.onmouseover=function(){can=false};
	box.onmouseout=function(){can=true};
	new function (){
	 var stop=box.scrollTop%178==0&&!can;
	 if(!stop)box.scrollTop==parseInt(box.scrollHeight/2)?box.scrollTop=0:box.scrollTop++;
	 setTimeout(arguments.callee,box.scrollTop%178?10:2000);
	};
	//控制图片向上滚动
	var picture=document.getElementById("picture"),can=true;
	picture.innerHTML+=picture.innerHTML;
	picture.onmouseover=function(){can=false};
	picture.onmouseout=function(){can=true};
	new function (){
	 var stop=picture.scrollTop%90==0&&!can;
	 if(!stop)picture.scrollTop==parseInt(picture.scrollHeight/2)?picture.scrollTop=0:picture.scrollTop++;
	 setTimeout(arguments.callee,picture.scrollTop%90?5:1500);
	};
	//选择地址
	 $('#demo2').citys({
            required:false,
            nodata:'disabled',
            onChange:function(data){
                var text = data['direct']?'(直辖市)':'';
                $('#tc_from').val(data['province']+text+' '+data['city']+' '+data['area']);
            }
 	});
</script>
</html>
