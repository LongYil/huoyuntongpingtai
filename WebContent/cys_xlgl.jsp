<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>运输线路管理</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:500px;height:40px;margin-top:20px;padding-left:40px;">
<a href="#" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="addPanel()">添加线路</a>
<a href="#" class="easyui-linkbutton" style="width:80px;" onclick="addPanel()">删除线路</a>
</section>





	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有线路">
		<table id="dg" class="easyui-datagrid" title="运输线路" style="width:1040px;height:590px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'">出发省份</th>
				<th data-options="field:'c',width:80,align:'center'">出发城市</th>
				<th data-options="field:'d',width:80,align:'center'">出发县</th>
				<th data-options="field:'e',width:80,align:'center'">到达省</th>
				<th data-options="field:'f',width:80,align:'center'">到达城市</th>
				<th data-options="field:'g',width:80,align:'center'">到达县</th>
				<th data-options="field:'h',width:80,align:'center'">重货价格</th>
				<th data-options="field:'i',width:80,align:'center'">重货单位</th>
				<th data-options="field:'j',width:80,align:'center'">轻货价格</th>
				<th data-options="field:'k',width:80,align:'center'">轻货单位</th>
				<th data-options="field:'k',width:80,align:'center'">运输时效（X天/次）</th>
				<th data-options="field:'k',width:80,align:'center'">发车频率</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td >1</td>
				<td >广东</td>
				<td >佛山</td>
				<td >三水</td>
				<td >广东</td>
				<td >茂名</td>
				<td >茂南</td>
				<td >100</td>
				<td >千克</td>
				<td >100</td>
				<td >千克</td>
				<td >2</td>
				<td >1天/次</td>
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
				title: '添加线路',
				content: '<iframe src="cys_tjxl.jsp" frameborder="0" style="padding:5px;width:830px;height:500px;"></iframe>',
				closable: true
			});
		}

	</script>
</body>
</html>