<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>用户订单</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:500px;height:40px;margin-top:20px;padding-left:40px;">
<a href="#" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="addPanel()">创建订单</a>
</section>





	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有线路">
		<table id="dg" class="easyui-datagrid" title="运输线路" style="width:1040px;height:590px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'">货物名称</th>
				<th data-options="field:'c',width:80,align:'center'">货物类型</th>
				<th data-options="field:'b',width:80,align:'center'">出发省份</th>
				<th data-options="field:'c',width:80,align:'center'">出发城市</th>
				<th data-options="field:'d',width:80,align:'center'">出发县</th>
				<th data-options="field:'b',width:80,align:'center'">出发街道</th>
				<th data-options="field:'e',width:80,align:'center'">到达省份</th>
				<th data-options="field:'f',width:80,align:'center'">到达城市</th>
				<th data-options="field:'g',width:80,align:'center'">到达县</th>
				<th data-options="field:'g',width:80,align:'center'">到达街道</th>
				<th data-options="field:'h',width:80,align:'center'">总件数</th>
				<th data-options="field:'i',width:80,align:'center'">总体积</th>
				<th data-options="field:'j',width:80,align:'center'">预计运费</th>
				<th data-options="field:'k',width:80,align:'center'">发货人姓名</th>
				<th data-options="field:'l',width:80,align:'center'">发货人电话</th>
				<th data-options="field:'m',width:80,align:'center'">收货人姓名</th>
				<th data-options="field:'m',width:80,align:'center'">收货人电话</th>
				<th data-options="field:'m',width:80,align:'center'">是否代收货款</th>
				<th data-options="field:'m',width:80,align:'center'">是否上门提货</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listwlx}" var="item" begin="0" step="2" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td>${item.cfsf}</td>
					<td>${item.cfcs}</td>
					<td>${item.cfx}</td>
					<td>${item.ddsf}</td>
					<td>${item.ddcs}</td>
					<td>${item.ddx}</td>
					<td>${item.zhjg}</td>
					<td>千克</td>
					<td>${item.qhjg}</td>
					<td>立方米</td>
					<td>${item.yssx}</td>
					<td>${item.fcpl}</td>
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
				title: '添加线路',
				content: '<iframe src="cys_tjxl.jsp" frameborder="0" style="padding:5px;width:830px;height:500px;"></iframe>',
				closable: true
			});
		}

	</script>
</body>
</html>