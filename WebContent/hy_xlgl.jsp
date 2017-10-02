<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>运输线路</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<style type="text/css">
		.cdmc{
		margin-left:400px;
		font-size:18px;
		color:#0248b5;
		font-weight:bold;
		height:40px;
		line-height:40px;
		}
	</style>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:760px;height:40px;margin-top:10px;margin-bottom:10px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;" onclick="fanhui()">返回</a>
<span class="cdmc">车队名称:${cdxlmc}</span>
<input type="hidden" value="${glybh}" class="glybh"/>
<input type="hidden" value="${zhmc}" class="zhmc"/>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:580px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有线路">
		<table id="dg" class="easyui-datagrid" border="0" style="width:820px;height:540px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'">出发省份</th>
				<th data-options="field:'c',width:80,align:'center'">出发城市</th>
				<th data-options="field:'d',width:80,align:'center'">出发县</th>
				<th data-options="field:'e',width:80,align:'center'">到达省份</th>
				<th data-options="field:'f',width:80,align:'center'">到达城市</th>
				<th data-options="field:'g',width:80,align:'center'">到达县</th>
				<th data-options="field:'h',width:80,align:'center'">重货价格</th>
				<th data-options="field:'i',width:80,align:'center'">重货单位</th>
				<th data-options="field:'j',width:80,align:'center'">轻货价格</th>
				<th data-options="field:'k',width:80,align:'center'">轻货单位</th>
				<th data-options="field:'l',width:80,align:'center'">运输时效（X天/次）</th>
				<th data-options="field:'m',width:80,align:'center'">发车频率</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listwlx}" var="item" begin="0" step="1" varStatus="status">
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
		
		function fanhui(){
			var id = $(".glybh").val();
			var mc = $(".zhmc").val();
			window.location = "cys_hyglyFindAllCys.action?id="+id+"&mc="+mc;
		}
	</script>
</body>
</html>