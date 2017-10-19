<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Basic Window - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>Basic Window</h2>
	<p>Window can be dragged freely on screen.</p>
	<div style="margin:20px 0;">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#w').window('open')">Open</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#w').window('close')">Close</a>
	</div>
	
	<div id="w" class="easyui-window" title="选择联系人" data-options="iconCls:'icon-save'" style="width:430px;height:200px;padding:10px;">
	<div title="所有联系人">
		<table id="dg" class="easyui-datagrid" border="0" style="width:400px;height:100px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'b',width:150,align:'center'">姓名</th>
				<th data-options="field:'c',width:150,align:'center'">电话</th>
				<th data-options="field:'d',width:60,align:'center'">操作</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listcd}" var="item" begin="0" step="1" varStatus="status">
				<tr>
					<td>1</td>
					<td>李银龙</td>
					<td>18726364624</td>
					<td><button onClick="xuanze('1')">选择</button></td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
	
	
	
</body>
<script type="text/javascript">
function xuanze(arg){
	alert(arg);
}

</script>

</html>