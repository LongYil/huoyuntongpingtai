<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>帐号管理</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/basic/locale/easyui-lang-zh_CN.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:780px;height:40px;margin-top:20px;padding-left:10px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:14px;" onclick="addPanel()">添加帐号</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:14px;" onclick="shanchu()">删除帐号</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:14px;" onclick="shezhijuese()">设置角色</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:110px;margin-right:14px;" onclick="chakanchedui()">查看所有车队</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:110px;margin-right:14px;" onclick="chakandailidian()">查看所属代理点</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:110px;margin-right:14px;" onclick="shezhidailidian()">设置代理点</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;" onclick="shuaxin()">刷新</a>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有帐号">
		<table id="dg" class="easyui-datagrid" style="width:830px;height:580px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'id',width:60,align:'center'" hidden="hidden">用户id</th>
				<th data-options="field:'b',width:120,align:'center'">用户名(帐户名)</th>
				<th data-options="field:'ba',width:120,align:'center'">用户角色</th>
				<th data-options="field:'c',width:120,align:'center'">用户手机号</th>
				<th data-options="field:'d',width:120,align:'center'">用户姓名</th>
				<th data-options="field:'e',width:120,align:'center'">公司名称</th>
				<th data-options="field:'g',width:120,align:'center'">用户邮箱</th>
				<th data-options="field:'h',width:150,align:'center'">用户地址（省）</th>
				<th data-options="field:'i',width:150,align:'center'">用户地址（市）</th>
				<th data-options="field:'j',width:150,align:'center'">用户地址（县/区）</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listvo}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td hidden="hidden">${item.yhbh}</td>
					<td>${item.yhm}</td>
					<td>${item.jsmc}</td>
					<td>${item.yhsj}</td>
					<td>${item.yhxm}</td>
					<td>${item.gsmc}</td>
					<td>${item.yhyx}</td>
					<td>${item.szsf}</td>
					<td>${item.szcs}</td>
					<td>${item.szx}</td>
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
				title: '添加帐号',
				content: '<iframe src="cysjs_findAllYhjs.action" frameborder="0" style="padding:5px;width:820px;height:500px;"></iframe>',
				closable: true
			});
		}
		function chakanchedui(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var mc = row.b;
				window.location = "yscd_cysFindByGlyid.action?id="+id+"&mc="+mc;
			}
		}
		
		function shezhijuese(){
			var row = $('#dg').datagrid('getSelected');
			var id = row.id;
			if (row){
				$('#tt').tabs('add',{
					title: '设置角色',
					content: '<iframe src="cysjs_szjs.action?id='+id+'" frameborder="0" style="padding:5px;width:820px;height:500px;"></iframe>',
					closable: true
				});
			}
		}
		
		function shuaxin(){
			window.location = "cys_findAllGly.action";
		}
		
		
		function shanchu(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var name = row.b;
				$.messager.confirm("确认","是否删除帐号:"+name, function (r) {  
			        if (r) {  
			        	window.location = "cys_deleteGly.action?id="+id; 
			        }  
			    });  
			}
		}
		
		function chakandailidian(){
			index++;
			var row = $('#dg').datagrid('getSelected');
			var id = row.id;
			$('#tt').tabs('add',{
				title: '代理点信息',
				content: '<iframe src="hy_findByGlybh.action?id='+id+'" frameborder="0" style="padding:5px;width:820px;height:500px;"></iframe>',
				closable: true
			});
		}
		function shezhidailidian(){
			index++;
			var row = $('#dg').datagrid('getSelected');
			var id = row.id;
			$('#tt').tabs('add',{
				title: '设置代理点',
				content: '<iframe src="hy_yszdld.action?id='+id+'" frameborder="0" style="padding:5px;width:820px;height:500px;"></iframe>',
				closable: true
			});
		}
		
		
	</script>
</body>
</html>