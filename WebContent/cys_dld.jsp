<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>设置货运代理点</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
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
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:500px;height:40px;margin-top:20px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:130px;margin-right:20px;" onclick="ben()">设置本账号代理点</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:130px;margin-right:20px;" onclick="suoyou()">设置所有账号代理点</a>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="本账号代理点" style="padding-top:30px;">
		
		<p><span>代理点名称:</span><span class="info">${hygly.gsmc}</span></p>
		<p><span>代理点地址:</span><span class="info">${hygly.szsf}${hygly.szcs}${hygly.szx}${hygly.szjdh}</span></p>
		<p><span>代理点电话:</span><span class="info">${hygly.lxdh}</span></p>
		<p><span>代理点邮箱:</span><span class="info">${hygly.yhyx }</span></p>
		
	</div>
	<script type="text/javascript">
		var index = 0;
		function ben(){
			index++;
			$('#tt').tabs('add',{
				title: '设置本账号代理点',
				content: '<iframe src="hy_findAllDldb.action" frameborder="0" style="padding:5px;width:820px;height:500px;"></iframe>',
				closable: true
			});
		}

		function suoyou(){
			index++;
			$('#tt').tabs('add',{
				title: '设置所有账号代理点',
				content: '<iframe src="hy_findAllDldsy.action" frameborder="0" style="padding:5px;width:820px;height:500px;"></iframe>',
				closable: true
			});
		}		
	</script>
</body>
</html>