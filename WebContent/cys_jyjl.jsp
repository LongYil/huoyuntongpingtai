<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>交易记录</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="交易记录">
		<table id="dg" class="easyui-datagrid" style="width:830px;height:580px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'id',width:60,align:'center'">交易时间</th>
				<th data-options="field:'b',width:120,align:'center'">交易类型</th>
				<th data-options="field:'c',width:120,align:'center'">交易金额</th>
				<th data-options="field:'d',width:120,align:'center'">交易装填</th>
				<th data-options="field:'e',width:120,align:'center'">交易人姓名</th>
				<th data-options="field:'g',width:120,align:'center'">交易人身份证号</th>
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
					<td>${item.jyrxm}</td>
					<td>${item.jyrid}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>

</body>
</html>