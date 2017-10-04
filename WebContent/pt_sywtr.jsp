<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>所有委托人</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/basic/locale/easyui-lang-zh_CN.js"></script>
	<style type="text/css">
		.cdmc{
		margin-left:120px;
		font-size:18px;
		color:#0248b5;
		font-weight:bold;
		}
	</style>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
<section style="width:780px;height:40px;margin-top:20px;padding-left:10px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:110px;margin-right:14px;" onclick="dingdan()">查看所有订单</a>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:838px;height:580px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有委托人">
		<table id="dg" class="easyui-datagrid" border="0px" style="width:830px;height:540px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'b',width:60,align:'center'" hidden="hidden">用户id</th>
				<th data-options="field:'c',width:120,align:'center'">公司名称</th>
				<th data-options="field:'d',width:120,align:'center'">公司联系人</th>
				<th data-options="field:'e',width:120,align:'center'">公司联系电话</th>
				<th data-options="field:'f',width:120,align:'center'">公司邮箱</th>
				<th data-options="field:'g',width:300,align:'center'">公司地址</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listvo}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td hidden="hidden">${item.wtr.yhbh}</td>
					<td>${item.wtr.gsmc}</td>
					<td>${item.yhxm}</td>
					<td>${item.lxdh}</td>
					<td>${item.wtr.yhyx}</td>
					<td>${item.wtr.yhsf}${item.wtr.yhcs}${item.wtr.yhx}${item.wtr.xxdz}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>

	<script type="text/javascript">

		function dingdan(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.b;
				var mc = row.d;
				window.location = "dd_ptFindWtrdd.action?id="+id+"&mc="+mc;
			}
		}
		
		function fanhui(){
			window.location = "cys_findAll.action";
		}
		
	</script>
</body>
</html>