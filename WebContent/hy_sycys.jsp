<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>所有承运商</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<style>
		.cdmc{
		margin-left:140px;
		font-size:24px;
		color:#0248b5;
		font-weight:bold;
		}
	</style>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
<section style="width:760px;height:40px;margin-top:20px;padding-left:40px;">

<a href="javascript:void(0)" class="easyui-linkbutton" style="width:100px;margin-right:20px;" onclick="chakanchedui()">查看所有车队</a>

</section>
	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有承运商">
		<table id="dg" class="easyui-datagrid" style="width:1078px;height:560px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'id',width:80,align:'center'" hidden="hidden">承运商编号</th>
				<th data-options="field:'c',width:150,align:'center'">公司名称</th>
				<th data-options="field:'d',width:120,align:'center'">公司邮箱</th>
				<th data-options="field:'e',width:120,align:'center'">联系电话</th>
				<th data-options="field:'f',width:150,align:'center'">所在省份</th>
				<th data-options="field:'g',width:150,align:'center'">所在城市</th>
				<th data-options="field:'h',width:150,align:'center'">所在县</th>
				<th data-options="field:'i',width:150,align:'center'">所在街道号</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listgly}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
				    <td hidden="hidden">${item.cysbh}</td>
				    <td>${item.gsmc}</td>
					<td>${item.yhyx}</td>
					<td>${item.lxdh}</td>
					<td>${item.szsf}</td>
					<td>${item.szcs}</td>
					<td>${item.szx}</td>
					<td>${item.szjdh}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
	<script type="text/javascript">
		var index = 0;
		function getSelected(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				$.messager.alert('Info', row.a+":"+row.b+":"+row.c);
			}
		}
		
		function chakanchedui(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var mc = row.c;
				window.location = "yscd_hyFindByGlyid.action?id="+id+"&mc="+mc;
			}
		}

		

		
		
	</script>
</body>
</html>