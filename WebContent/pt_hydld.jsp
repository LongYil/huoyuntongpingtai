<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>所有代理点</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/basic/locale/easyui-lang-zh_CN.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:760px;height:40px;margin-top:20px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:110px;margin-right:20px;" onclick="zidaili()">查看子代理点</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="dingdan()">查看订单</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;" onclick="shuaxin()">刷新</a>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:580px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有代理点">
		<table id="dg" class="easyui-datagrid" border="0" style="width:825px;height:540px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'id',width:60,align:'center'" hidden="hidden">用户id</th>
				<th data-options="field:'e',width:120,align:'center'">公司名称</th>
				<th data-options="field:'f',width:300,align:'center'">公司地址</th>				
				<th data-options="field:'c',width:120,align:'center'">联系人</th>
				<th data-options="field:'d',width:120,align:'center'">联系电话</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listvo}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td hidden="hidden">${item.hydld.yhbh}</td>
					<td>${item.hydld.gsmc}</td>
					<td>${item.hydld.szsf}${item.hydld.szcs}${item.hydld.szx}${item.hydld.xxdz}</td>					
					<td>${item.yhxm}</td>
					<td>${item.lxdh}</td>

				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
	<script type="text/javascript">
		function zidaili(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var mc = row.e;
				window.location = "hy_ptFndHygly.action?id="+id+"&mc="+mc;
			}
		}
		function dingdan(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var mc = row.e;
				window.location = "hy_ptFindHydd.action?id="+id+"&mc="+mc;
			}
		}
		
		function shuaxin(){
			window.location = "hy_findAll.action";
		}	
		
	</script>
</body>
</html>