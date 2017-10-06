<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>保证金解冻申请</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:640px;margin-left:-20px;margin-bottom:0px;">
	<div title="保证金解冻申请">
		<table id="dg" class="easyui-datagrid" border="0" style="width:825px;height:600px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'" hidden="hidden">用户编号</th>
				<th data-options="field:'id',width:80,align:'center'" hidden="hidden">交易记录编号</th>
				<th data-options="field:'c',width:100,align:'center'">用户姓名</th>
				<th data-options="field:'d',width:100,align:'center'">联系电话</th>
				<th data-options="field:'e',width:100,align:'center'">未完成订单</th>
				<th data-options="field:'f',width:100,align:'center'">申请时间</th>
				<th data-options="field:'g',width:200,align:'center'">解冻金额</th>
				<th data-options="field:'h',width:200,align:'center'">已缴纳金额</th>
				<th data-options="field:'v',width:80,align:'center'">操作</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listvo}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td hidden="hidden">${item.jbyh.yhbh}</td>
					<td hidden="hidden">${item.jyjl.id}</td>
					<td>${item.jbyh.yhxm}</td>
					<td>${item.jbyh.yhsj}</td>
					<td>${item.zzjydd}</td>
					<td>${item.jyjl.jysj}</td>
					<td>${item.bzj.bzjje}</td>
					<td>${item.bzj.jyje}</td>
					<td>
					<a href="javascript:void(0)" class="easyui-linkbutton" onClick="chuli('${item.dd.id}')">批准通过</a>
					<a href="javascript:void(0)" class="easyui-linkbutton" onClick="chuli('${item.dd.id}')">驳回</a>
					</td>							
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
</body>
<script type="text/javascript">
		var index = 0;
		function chuli(id){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				index++;
				$('#tt').tabs('add',{
					title: '处理此单',
					content: '<iframe src="ycdd_fqcl.action?id='+(id)+'" frameborder="0" style="padding:5px;width:810px;height:500px;"></iframe>',
					closable: true
				});
			}
		}
		
		function shuaxin(){
			window.location = "dd_ptFindAllYcdd.action?id=6";
		}
	</script>
</html>