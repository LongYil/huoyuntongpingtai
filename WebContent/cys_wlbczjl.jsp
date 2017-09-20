<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>物流币充值记录</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/lzx/area.js"></script>
	<style type="text/css">

	</style>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:820px;max-height:560px;">
		<table id="dg" class="easyui-datagrid" border="0" style="width:810px;height:525px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'b',width:200,align:'center'">交易时间</th>
				<th data-options="field:'c',width:120,align:'center'">交易类型</th>
				<th data-options="field:'d',width:120,align:'center'">交易金额</th>
				<th data-options="field:'e',width:120,align:'center'">交易状态</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listvo}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td>${item.jysj}</td>
					<td>${item.jylx}</td>
					<td>${item.jyje}</td>
					<td>${item.jyzt}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
	</div>
	<script>
	
	</script>

</body>
</html>