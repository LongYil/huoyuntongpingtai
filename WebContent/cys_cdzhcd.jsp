<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>车队管理</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<style type="text/css">
		.cdmc{
		margin-left:120px;
		font-size:18px;
		color:#0248b5;
		font-weight:bold;
		}
	</style>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:700px;height:40px;margin-top:20px;padding-left:20px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="addPanel()">添加车队</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="addPanel()">删除车队</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="sxcd()">刷新</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;" onclick="fanhui()">返回</a>

<span class="cdmc">帐号名称:${zhmc}</span>
<input type="hidden" class="glyid"  value="${glyid}"/>
<input type="hidden" class="cdclmc" value="${zhmc}"/>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有车队">
		<table id="dg" class="easyui-datagrid" style="width:830px;height:580px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'id',width:100,align:'center'">车队编号</th>
				<th data-options="field:'b',width:150,align:'center'">车队名称</th>
				<th data-options="field:'c',width:150,align:'center'">车队联系人</th>
				<th data-options="field:'d',width:150,align:'center'">车队联系电话</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listcd}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td>${item.cdbh}</td>
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
		var index = 0;
		function addPanel(){
			index++;
			$('#tt').tabs('add',{
				title: '添加车队',
				content: '<iframe src="yscd_jbyhFindAllCd.action" frameborder="0" style="padding:5px;width:820px;height:575px;"></iframe>',
				closable: true
			});
		}

		function shanchu(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				$.messager.alert('Info', row.a+":"+row.b+":"+row.c);
			}
		}

		function fanhui(){
			window.location="cys_findAllGly.action";
		}

		function sxcd(){
			var id = $(".glyid").val();
			var mc = $(".zhmc").val();
			window.location = "yscd_cysFindByGlyid.action?id="+id+"&mc="+mc;
		}
	</script>
</body>
</html>