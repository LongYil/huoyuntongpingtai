<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>选择货运代理点及承运商</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
  <form id="ff" name="myform" action="${pageContext.request.contextPath}/dd_dierbu.action" class="easyui-form" method="post" data-options="novalidate:true">
	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="border:0px solid #ffffff;padding:0px;width:830px;height:630px;margin-left:-20px;margin-bottom:0px;">
	<div title="选择货运代理点及承运商" style="border:0px solid #ffffff;">
		<table id="dg" class="easyui-datagrid" border="0" style="width:820px;height:530px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'">选择</th>
				<th data-options="field:'c',width:150,align:'center'">发货代理点名称</th>
				<th data-options="field:'d',width:150,align:'center'">发货代理点地址</th>
				<th data-options="field:'e',width:150,align:'center'">发货代理点电话</th>
				<th data-options="field:'h',width:150,align:'center'">承运商公司名称</th>
				<th data-options="field:'i',width:150,align:'center'">承运商地址</th>
				<th data-options="field:'j',width:150,align:'center'">承运商电话</th>
				<th data-options="field:'k',width:150,align:'center'">运输车队电话</th>
				<th data-options="field:'l',width:80,align:'center'">预计费用</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listYsdw}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
				    <td><input type="checkbox" value="${item.id}" name="ysdwid"/></td>
					<td>${item.fhdldmc}</td>
					<td>${item.fhdz}</td>
					<td>${item.cysdh}</td>
					<td>${item.cysmc}</td>
					<td>${item.cysdz}</td>
					<td>${item.cysdh}</td>
					<td>${item.cyscddh}</td>
					<td>${item.yjfy}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
			<div style="text-align:center;padding:5px 0">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">下一步</a>
			</div>
		</div>
  </form>
	</div>
	
	<script type="text/javascript">
		function submitForm(){
			myform.submit();
		}
		
	</script>
</body>
</html>