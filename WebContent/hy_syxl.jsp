<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>所有线路</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<style type="text/css">
	</style>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:832px;height:660px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有线路">
		<table id="dg" class="easyui-datagrid" style="width:820px;height:620px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'">公司名称</th>
				<th data-options="field:'c',width:80,align:'center'">公司电话</th>
				<th data-options="field:'d',width:80,align:'center'">车队名称</th>
				<th data-options="field:'e',width:80,align:'center'">车队电话</th>
				<th data-options="field:'f',width:80,align:'center'">出发省份</th>
				<th data-options="field:'g',width:80,align:'center'">出发城市</th>
				<th data-options="field:'h',width:80,align:'center'">出发县</th>
				<th data-options="field:'i',width:80,align:'center'">到达省份</th>
				<th data-options="field:'j',width:80,align:'center'">到达城市</th>
				<th data-options="field:'k',width:80,align:'center'">到达县</th>
				<th data-options="field:'l',width:80,align:'center'">重货价格</th>
				<th data-options="field:'m',width:80,align:'center'">重货单位</th>
				<th data-options="field:'n',width:80,align:'center'">轻货价格</th>
				<th data-options="field:'o',width:80,align:'center'">轻货单位</th>
				<th data-options="field:'q',width:80,align:'center'">运输时效（X天/次）</th>
				<th data-options="field:'p',width:80,align:'center'">发车频率</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listwlxvo}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
				    <td>${item.gsmc}</td>
				    <td>${item.gsdh}</td>
				    <td>${item.cdmc}</td>
				    <td>${item.cddh}</td>
					<td>${item.wlx.cfsf}</td>
					<td>${item.wlx.cfcs}</td>
					<td>${item.wlx.cfx}</td>
					<td>${item.wlx.ddsf}</td>
					<td>${item.wlx.ddcs}</td>
					<td>${item.wlx.ddx}</td>
					<td>${item.wlx.zhjg}</td>
					<td>千克</td>
					<td>${item.wlx.qhjg}</td>
					<td>立方米</td>
					<td>${item.wlx.yssx}</td>
					<td>${item.wlx.fcpl}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>

	<script type="text/javascript">

		function getSelected(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				$.messager.alert('Info', row.a+":"+row.b+":"+row.c);
			}
		}
		function sxxl(){
			var id = $(".cdxlid").val();
			var mc = $("cdxlmc").val();
			window.location="wlx_glyfindByYhbh.action";
		}

	</script>
</body>
</html>