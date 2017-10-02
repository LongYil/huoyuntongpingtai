<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>所有车辆</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<style>
		.cdmc{
		margin-left:400px;
		font-size:18px;
		color:#0248b5;
		font-weight:bold;
		}	
	</style>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
<section style="width:760px;height:40px;margin-top:20px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;" onclick="sxcd()">返回</a>
<span class="cdmc">车队名称:${cdmc}</span>
<input type="hidden" value="${glybh}" class="glybh"/>
<input type="hidden" value="${zhmc}" class="zhmc"/>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:580px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有车辆">
		<table id="dg" class="easyui-datagrid" border="0" title="车辆信息" style="width:820px;height:540px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'">车辆编号</th>
				<th data-options="field:'c',width:80,align:'center'">所属车队</th>
				<th data-options="field:'d',width:80,align:'center'">车牌号</th>
				<th data-options="field:'e',width:80,align:'center'">车辆类型</th>
				<th data-options="field:'f',width:80,align:'center'">车辆长度</th>
				<th data-options="field:'g',width:80,align:'center'">车辆宽度</th>
				<th data-options="field:'h',width:80,align:'center'">车辆高度</th>
				<th data-options="field:'i',width:80,align:'center'">车辆体积</th>
				<th data-options="field:'j',width:80,align:'center'">随车联系人</th>
				<th data-options="field:'k',width:80,align:'center'">随车联系电话</th>
				<th data-options="field:'l',width:80,align:'center'">车辆品牌</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listclxx}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
				    <td>${item.id}</td>
				    <td>${cdmc}</td>
					<td>${item.cph}</td>
					<td>${item.cllx}</td>
					<td>${item.clcd}</td>
					<td>${item.clkd}</td>
					<td>${item.clgd}</td>
					<td>${item.cltj}</td>
					<td>${item.sclxr}</td>
					<td>${item.sclxdh}</td>
					<td>${item.clpp}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>



	<script type="text/javascript">

		function sxcd(){
			var id = $(".glybh").val();
			var mc = $(".zhmc").val();
			window.location = "yscd_hyFindByGlyid.action?id="+id+"&mc="+mc;
		}
	</script>
</body>
</html>