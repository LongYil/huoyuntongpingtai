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

<section style="width:760px;height:40px;margin-top:20px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="tianjia()">添加帐号</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="shanchu()">删除帐号</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:110px;margin-right:20px;" onclick="chakanchengyunshang()">查看承运商</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:110px;margin-right:20px;" onclick="chakanxianlu()">查看所有线路</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:110px;margin-right:20px;" onclick="chakanchedui()">查看所有车队</a>
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
					<td hidden="hidden">${item.hygly.glybh}</td>
					<td>${item.yhm}</td>
					<td>${item.hygly.lxdh}</td>
					<td>${item.yhxm}</td>
					<td>${item.hygly.gsmc}</td>
					<td>${item.hygly.yhyx}</td>
					<td>${item.hygly.szsf}</td>
					<td>${item.hygly.szcs}</td>
					<td>${item.hygly.szx}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>



	<script type="text/javascript">
		var index = 0;
		function tianjia(){
			index++;
			$('#tt').tabs('add',{
				title: '添加帐号',
				content: '<iframe src="hy_tjzh.jsp" frameborder="0" style="padding:5px;width:820px;height:500px;"></iframe>',
				closable: true
			});
		}
		
		function chakanchengyunshang(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var mc1 = row.b;
				var mc2 = row.d;
				window.location = "hy_hyglyFindAllCysByglyid.action?id="+id+"&mc1="+mc1+"&mc2="+mc2;
			}
		}
		
		function chakanxianlu(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var mc1 = row.b;
				var mc2 = row.d;
				window.location = "wlx_hyFindByGlyid.action?id="+id+"&mc1="+mc1+"&mc2="+mc2;
			}
		}
		
		function chakanchedui(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var mc1 = row.b;
				var mc2 = row.d;
				window.location = "yscd_hyFindYscdByGlyid.action?id="+id+"&mc1="+mc1+"&mc2="+mc2;
			}
		}
		
		function shuaxin(){
			window.location = "hy_hyFindAllGly.action";
		}
		
		
		function shanchu(){
			var row = $('#dg').datagrid('getSelected');
			if (row){
				var id = row.id;
				var name = row.b;
				$.messager.confirm("确认","是否删除帐号:"+name, function (r) {  
			        if (r) {  
			        	window.location = "hy_hyDeleteGly.action?id="+id; 
			        }  
			    });  
			}
		}
		

		
		
	</script>
</body>
</html>