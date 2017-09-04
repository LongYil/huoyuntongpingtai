<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>货运代理点信息</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/lzx/area.js"></script>
	<style type="text/css">
		p{
			margin-left:200px;
			font-size:17px;
			color:#535666;
		}
		.info{
			color:#4592ec;
			margin-left:5px;
		}
		
	</style>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:10px 60px;" title="货运代理点信息">
		<div title="账号代理点">
		
			<c:if test="${hygly.gsmc==''}">
				<p><span>对不起！您还没有为该帐号设置货运代理点。</span></p>
			</c:if>
			<c:if test="${hygly.gsmc!=''}">
				<p><span>代理点名称:</span><span class="info">${hygly.gsmc}</span></p>
				<p><span>代理点地址:</span><span class="info">${hygly.szsf}${hygly.szcs}${hygly.szx}${hygly.szjdh}</span></p>
				<p><span>代理点电话:</span><span class="info">${hygly.lxdh}</span></p>
				<p><span>代理点邮箱:</span><span class="info">${hygly.yhyx }</span></p>		
			</c:if>
			
		</div>
	</div>
</body>
</html>