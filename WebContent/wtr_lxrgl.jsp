<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>联系人管理</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:500px;height:40px;margin-top:20px;padding-left:40px;">
<a href="#" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="addPanel()">添加联系人</a>
<a href="#" class="easyui-linkbutton" style="width:80px;" onclick="addPanel()">删除联系人</a>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有联系人">
		<table id="dg" class="easyui-datagrid" title="联系人" style="width:810px;height:590px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:100,align:'center'">联系人姓名</th>
				<th data-options="field:'c',width:200,align:'center'">联系人电话</th>
				<th data-options="field:'d',width:200,align:'center'">联系人地址</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listlxr}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td>${item.lxrxm}</td>
					<td>${item.lxrdh}</td>
					<td>${item.lxrdz}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>

	<script type="text/javascript">
		var index = 0;
		function addPanel(){
			index++;
			$('#tt').tabs('add',{
				title: '添加联系人',
				content: '<iframe src="wtr_tjlxr.jsp" frameborder="0" style="padding:5px;width:830px;height:500px;"></iframe>',
				closable: true
			});
		}

	</script>
</body>
</html>