<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 平台管理员主页面 -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>会员中心首页</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="js/basic/mycss.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout" style="width:1040px;margin:0 auto;">
	<div data-options="region:'north',border:false" style="height:150px;background:#B3DFDA;">
    <div style="width:1040px; height:75px;background-image:url(js/basic/ads1.png);"></div>
	<div style="width:1040px; height:75px;background-image:url(js/basic/head.png);">
    	<a href="javascript:void(0)" class="logo"></a>
    	<div class="info"><span class="info1">平台管理员：</span><span class="info2">${jbyh.yhxm}</span>&nbsp;&nbsp;<span class="info3">您好！</span></div>
    </div>
    </div>
	
	<div data-options="region:'west',split:true,title:'货运通物流平台'" style="width:195px;padding:10px;">
	<ul class="menubox">
		<li class="fatheritem">
        	<dl class="biaotia1">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/icon/yonghuxinxi.png" class="menuicon">用户信息</a>
            </li>
            </dl>
			<ul class="menu1">
				<li><a href="javascript:void(0)" onClick="To('pt_findPtglyInfo.action')"><img src="js/basic/icon/jibenxinxi.png" class="itemicon">基本信息</a></li>
                <li><a href="javascript:void(0)" onClick="To('pt_findAll.action')"><img src="js/basic/icon/zhanghaoguanli.png" class="itemicon">帐号管理</a></li>
				<li><a href="javascript:void(0)" onClick="To('yhzh_find.action')"><img src="js/basic/icon/zhanghuguanli.png" class="itemicon">账户管理</a></li>
			</ul>
		</li>

		<li class="fatheritem">
        	<dl class="biaotia2">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/caidanicon.png" class="menuicon">会员管理</a>
            </li>
            </dl>
			<ul class="menu1">
				<li><a href="javascript:void(0)"  onClick="To('cys_findAll.action')"><img src="js/basic/icon/chengyunshang.png" class="itemicon">承运商</a></li>
                <li><a href="javascript:void(0)" onClick="To('hy_findAll.action')"><img src="js/basic/icon/huoyundailidian.png" class="itemicon">货运代理点</a></li>
                <li><a href="javascript:void(0)" onClick="To('wtr_findAllWtr.action')"><img src="js/basic/icon/weituoren.png" class="itemicon">委托人</a></li>
			</ul>
		</li>
		
		<li class="fatheritem">
        	<dl class="biaotia2">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/caidanicon.png" class="menuicon">订单处理</a>
            </li>
            </dl>
			<ul class="menu1">
				<li><a href="javascript:void(0)"  onClick="To('dd_ptFindAllYcdd.action?id=6')"><img src="js/basic/icon/chengyunshang.png" class="itemicon">申诉订单</a></li>
				<li><a href="javascript:void(0)"  onClick="To('dd_ptFindAllYcdd.action?id=7')"><img src="js/basic/icon/chengyunshang.png" class="itemicon">已处理</a></li>
			</ul>
		</li>
		
		<li class="fatheritem">
        	<dl class="biaotia2">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/caidanicon.png" class="menuicon">财务管理</a>
            </li>
            </dl>
			<ul class="menu1">
				<li><a href="javascript:void(0)" onClick="To('Jyjl_ptFindAllJdsq.action')"><img src="js/basic/icon/chengyunshang.png" class="itemicon">解冻保证金</a></li>
                <li><a href="javascript:void(0)" onClick="To('Jyjl_ptFindAllCzsq.action')"><img src="js/basic/icon/huoyundailidian.png" class="itemicon">充值物流币</a></li>
                <li><a href="javascript:void(0)" onClick="To('Jyjl_ptFindAllTxsq.action')"><img src="js/basic/icon/huoyundailidian.png" class="itemicon">提现物流币</a></li>
			</ul>
		</li>
 		<li class="fatheritem">
        	<dl class="biaotia3">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/icon/xitongguanli.png" class="menuicon">系统管理</a>
            </li>
            </dl>
			<ul class="menu1">
				<li><a href="javascript:void(0)"><img src="js/basic/icon/jueseguanli.png" class="itemicon">角色管理</a></li>
<!--                 <li><a href="javascript:void(0)"><img src="js/basic/icon/xitongrizhi.png" class="itemicon">系统日志</a></li> -->
                <li><a href="javascript:void(0)"   onClick="Go('jbyh_logOff.action')"><img src="js/basic/icon/tuichu.png" class="itemicon">退出</a></li>
			</ul>
		</li>
	</ul>
	</div>
	
	<div data-options="region:'south',border:false" style="height:40px;padding:10px;border:1px #95b8e7 solid;color:#535666;border-top:0px solid #fff;" class="foot">
		<p style="padding:0px;margin:0px;text-align:center;">Copyright©2017-2019&nbsp;&nbsp;www.huoyuntong.top&nbsp;&nbsp;All&nbsp;Rights&nbsp;Reserved&nbsp;&nbsp;许可证号：粤ICP备17120651号</p>
	</div>
	
	
	<div data-options="region:'center',title:'我的桌面'">
    	<iframe class="zhuomian" frameborder="0" style="width:840px;height:640px;margin:0px;pading:0px;">	
        </iframe>
    </div>

</body>
<script>

function To(url){
	$(".zhuomian").attr("src",url);
}

function Go(url){
	window.location=url;
}

$(function m(){
	$(".biaotia1").nextAll().hide();
	$(".biaotia2").nextAll().hide();
	$(".biaotia3").nextAll().hide();
});

$(".biaotia1").click(function m1(){
	m();
	$(this).nextAll().show();	
});

$(".biaotia2").click(function m1(){
	m();
	$(this).nextAll().show();
});

$(".biaotia3").click(function m1(){
	m();
	$(this).nextAll().show();
});



function m(){
	$(".biaotia1").nextAll().hide();
	$(".biaotia2").nextAll().hide();
	$(".biaotia3").nextAll().hide();
}

</script>
</html>