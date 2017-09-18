<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>所有车队</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
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

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:637px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有车队">
		<table id="dg" class="easyui-datagrid" style="width:820px;height:600px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'e',width:150,align:'center'">承运商公司名称</th>
				<th data-options="field:'f',width:150,align:'center'">承运商电话</th>
				<th data-options="field:'b',width:150,align:'center'">车队名称</th>
				<th data-options="field:'c',width:150,align:'center'">车队联系人</th>
				<th data-options="field:'d',width:150,align:'center'">车队联系电话</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listcdvo}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
				    <td>${item.gsmc}</td>
				    <td>${item.lxdh}</td>
					<td>${item.yscd.cdmc}</td>
					<td>${item.yscd.cdlxr}</td>
					<td>${item.yscd.cdlxdh}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>

</body>
</html>