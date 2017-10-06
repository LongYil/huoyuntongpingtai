<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    	<div class="info"><span class="info1">货运代理点：</span><span class="info2">${jbyh.yhxm}</span>&nbsp;&nbsp;<span class="info3">您好！</span></div>
    </div>
    </div>
	<div data-options="region:'west',split:true,title:'货运通物流平台'" style="width:200px;padding:10px;">
	<ul class="menubox">
		<li class="fatheritem">
        	<dl class="biaotia1">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/icon/yonghuxinxi.png" class="menuicon">用户信息</a>
            </li>
            </dl>
			<ul class="menu1">
				<li><a href="javascript:void(0)"  onClick="To('hy_dld_findInfo.action')"><img src="js/basic/icon/jibenxinxi.png" class="itemicon">基本信息</a></li>
                <li name="zhgl" style="display:${hyjs.zhgl}"><a href="javascript:void(0)"  onClick="To('hy_hyFindAllGly.action')"><img src="js/basic/icon/zhanghaoguanli.png" class="itemicon">帐号管理</a></li>
                <li name="zhxx" style="display:${hyjs.zhxx}"><a href="javascript:void(0)" onClick="To('yhzh_find.action')"><img src="js/basic/icon/zhanghuguanli.png" class="itemicon">账户信息</a></li>
			</ul>
		</li>

		<li class="fatheritem">
        	<dl class="biaotia2">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/icon/chengyunshang.png" class="menuicon">承运商</a>
            </li>
            </dl>
			<ul class="menu1">
				<li name="sycys" style="display:${hyjs.sycys}"><a href="javascript:void(0)" onClick="To('cys_hyglyFindAllCys.action')"><img src="js/basic/icon/yunshuchedui.png" class="itemicon">所有承运商</a></li>
                <li name="sycd" style="display:${hyjs.sycd}"><a href="javascript:void(0)" onClick="To('yscd_hyFindAllYscd.action')"><img src="js/basic/icon/chengyunshang.png" class="itemicon">所有车队</a></li>
                <li name="syxl" style="display:${hyjs.syxl}"><a href="javascript:void(0)" onClick="To('wlx_dldFindByYhbh.action')"><img src="js/basic/icon/yunshuxianlu.png" class="itemicon">所有线路</a></li>
				<li><a href="javascript:void(0)" onClick="To('cys_hyglyFindAllCys.action')"><img src="js/basic/icon/yunshuchedui.png" class="itemicon">我的承运商</a></li>
                <li><a href="javascript:void(0)" onClick="To('yscd_hyFindAllYscd.action')"><img src="js/basic/icon/chengyunshang.png" class="itemicon">我的车队</a></li>
                <li><a href="javascript:void(0)" onClick="To('wlx_dldFindByYhbh.action')"><img src="js/basic/icon/yunshuxianlu.png" class="itemicon">我的线路</a></li>
			</ul>
		</li>

 		<li class="fatheritem">
        	<dl class="biaotia3">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/icon/dingdanguanli.png" class="menuicon">订单管理</a>
            </li>
            </dl>
			<ul class="menu1">
				<li><a href="javascript:void(0)" onClick="To('dd_findAllShAndFh.action')"><img src="js/basic/icon/quanbudingdan.png" class="itemicon">全部订单</a></li>
                <li><a href="javascript:void(0)" onClick="To('dd_findAll.action?yhlx=2&id=1')"><img src="js/basic/icon/yijiedan.png" class="itemicon">待处理订单</a></li>
                <li><a href="javascript:void(0)" onClick="To('dd_findAll.action?yhlx=2&id=2')"><img src="js/basic/icon/yijiedan.png" class="itemicon">已处理</a></li>
                <li><a href="javascript:void(0)" onClick="To('dd_findAll.action?yhlx=2&id=3')"><img src="js/basic/icon/yunshuzhong.png" class="itemicon">运输中</a></li>
                <li><a href="javascript:void(0)" onClick="To('dd_findAll.action?yhlx=2&id=4')"><img src="js/basic/icon/yunshuzhong.png" class="itemicon">已送达</a></li>
                <li><a href="javascript:void(0)" onClick="To('dd_findAll.action?yhlx=2&id=5')"><img src="js/basic/icon/yiqianshou.png" class="itemicon">已签收</a></li>
                <li><a href="javascript:void(0)" onClick="To('dd_findAll.action?yhlx=3&id=4')"><img src="js/basic/icon/yiqianshou.png" class="itemicon">代收货</a></li>
                <li><a href="javascript:void(0)" onClick="To('dd_findAll.action?yhlx=3&id=5')"><img src="js/basic/icon/yiqianshou.png" class="itemicon">已代收</a></li>
                <li><a href="javascript:void(0)" ><img src="js/basic/icon/dingdanchaxun.png" class="itemicon">订单查询</a></li>
			</ul>
		</li>
  
   		<li class="fatheritem">
        	<dl class="biaotia4">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/icon/caiwuguanli.png" class="menuicon">财务管理</a>
            </li>
            </dl>
			<ul class="menu1">
				<li><a href="javascript:void(0)" onClick="To('ptzh_cysfind.action')"><img src="js/basic/icon/yuechaxun.png" class="itemicon">余额查询</a></li>
				<li name="bzj" style="display:${hyjs.bzj}"><a href="javascript:void(0)"  onClick="To('bzj_cysFind.action')"><img src="js/basic/icon/baozhengjin.png" class="itemicon">保证金</a></li>
				<li name="wlb" style="display:${hyjs.wlb}"><a href="javascript:void(0)"  onClick="To('ptzh_find.action')"><img src="js/basic/icon/baozhengjin.png" class="itemicon">物流币</a></li>
				<li><a href="javascript:void(0)" onClick="To('jyjl_cysFindAll.action')"><img src="js/basic/icon/chongzhi.png" class="itemicon">交易记录</a></li>
			</ul>
		</li>
  
     	<li class="fatheritem">
        	<dl class="biaotia5">
            <li style="background-color:#dce8f3;">
            <a href="javascript:void(0)" ><img src="js/basic/icon/xitongguanli.png" class="menuicon">系统管理</a>
            </li>
            </dl>
			<ul class="menu1">
				<li name="jsgl" style="display:${hyjs.jsgl}"><a href="javascript:void(0)" onClick="To('hyjs_findAll.action')"><img src="js/basic/icon/jueseguanli.png" class="itemicon">角色管理</a></li>
                <li name="xtrz" style="display:${hyjs.xtrz}"><a href="javascript:void(0)"><img src="js/basic/icon/xitongrizhi.png" class="itemicon">系统日志</a></li>
                <li><a href="javascript:void(0)" onClick="Go('jbyh_logOff.action')"><img src="js/basic/icon/tuichu.png" class="itemicon">退出</a></li>
			</ul>
		</li>
	</ul>
	</div>

	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
	<div data-options="region:'center',title:'我的桌面'" style="padding:0px;">
    	<iframe class="zhuomian" frameborder="0" style="width:830px;height:640px;margin:0px;pading:0px;">
        
        
        
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
	$(".biaotia4").nextAll().hide();
	$(".biaotia5").nextAll().hide();
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

$(".biaotia4").click(function m1(){
	m();
	$(this).nextAll().show();
});

$(".biaotia5").click(function m1(){
	m();
	$(this).nextAll().show();
});

function m(){
	$(".biaotia1").nextAll().hide();
	$(".biaotia2").nextAll().hide();
	$(".biaotia3").nextAll().hide();
	$(".biaotia4").nextAll().hide();
	$(".biaotia5").nextAll().hide();
}

</script>
</html>