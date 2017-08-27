<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>添加车队</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/lzx/area.js"></script>
	<style type="text/css">
	.mycombox{
	border:1px #95b8e7 solid;
	height:25px;
	border-radius:4px;
	font-size:12px;
	}
	.tou{
	margin-right:32px;
	}
	</style>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:820px;max-height:600px;padding:10px 10px;">
		<form id="ff" action="${pageContext.request.contextPath}/yscd_jbyhAddCdToGly.action" class="easyui-form" method="post" data-options="novalidate:true">
			<table id="dg" class="easyui-datagrid" style="width:785px;height:500px"
				data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
			<thead>
				<tr>
					<th data-options="field:'a',width:50,align:'center'">序号</th>
					<th data-options="field:'f',width:50,align:'center'">选择</th>
					<th data-options="field:'id',width:150,align:'center'">车队编号</th>
					<th data-options="field:'b',width:180,align:'center'">车队名称</th>
					<th data-options="field:'c',width:180,align:'center'">车队联系人</th>
					<th data-options="field:'d',width:180,align:'center'">车队联系电话</th>
				</tr>
			</thead>
			<tbody>
					<c:forEach items="${listcd}" var="item" begin="0" step="1" varStatus="status">
					<tr>
					    <td>${status.index+1}</td>
					    <td><input type="checkbox" name="cdbh" value="${item.cdbh}"/></td>
						<td>${item.cdbh}</td>
						<td>${item.cdmc}</td>
						<td>${item.cdlxr}</td>
						<td>${item.cdlxdh}</td>
					</tr>
					</c:forEach>
			</tbody>
			</table>
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
	
		function submitForm(){
			$('#ff').form('submit',{
				onSubmit:function(){
					
					var flag = $(this).form('enableValidation').form('validate');
					if(flag){
						$.messager.alert('提示','保存成功!');
						return $(this).form('enableValidation').form('validate');
					}else{
						$.messager.alert('温馨提示','信息不完整，请填写完整信息!','warning');
						return false;
					}
				}
			});
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>

</body>
</html>