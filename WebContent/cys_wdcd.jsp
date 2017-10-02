<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>我的车队</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/basic/locale/easyui-lang-zh_CN.js"></script>	
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:700px;height:40px;margin-top:20px;padding-left:20px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:100px;" onclick="sxcd()">刷新</a>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:840px;height:580px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有车队">
		<table id="dg" class="easyui-datagrid" border="0" style="width:830px;height:545px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'id',width:100,align:'center'" hidden="hidden">车队编号</th>
				<th data-options="field:'b',width:150,align:'center'">车队名称</th>
				<th data-options="field:'c',width:150,align:'center'">车队联系人</th>
				<th data-options="field:'d',width:150,align:'center'">车队联系电话</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listcd}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td hidden="hidden">${item.cdbh}</td>
					<td>${item.cdmc}</td>
					<td>${item.cdlxr}</td>
					<td>${item.cdlxdh}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
	<script type="text/javascript">

		function sxcd(){
			window.location = "yscd_cysglyFindAll.action";
		}
		
	</script>
</body>
</html>