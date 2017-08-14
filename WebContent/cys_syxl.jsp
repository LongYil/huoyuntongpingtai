<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>所有订单</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:500px;height:40px;margin-top:20px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="addPanel()">添加线路</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;" onclick="getSelected()">删除线路</a>
</section>





	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有线路">
		<table id="dg" class="easyui-datagrid" title="运输线路" style="width:1040px;height:590px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">Item ID</th>
				<th data-options="field:'b',width:80,align:'center'">Product</th>
				<th data-options="field:'c',width:80,align:'center'">List Price</th>
				<th data-options="field:'d',width:80,align:'center'">Unit Cost</th>
				<th data-options="field:'e',width:80,align:'center'">Attribute</th>
				<th data-options="field:'f',width:80,align:'center'">Status</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td >1</td>
				<td >苹果</td>
				<td >10.5</td>
				<td >200</td>
				<td >安徽</td>
				<td >运输中</td>
			</tr>
		</tbody>
		</table>
		</div>
	</div>



	<script type="text/javascript">
		var index = 0;
		function addPanel(){
			index++;
			$('#tt').tabs('add',{
				title: '编辑信息',
				content: '<iframe src="add.html" frameborder="0" style="padding:5px;width:830px;height:500px;"></iframe>',
				closable: true
			});
		}
		function getSelected(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				$.messager.alert('Info', row.a+":"+row.b+":"+row.c);
			}
		}
	</script>
</body>
</html>