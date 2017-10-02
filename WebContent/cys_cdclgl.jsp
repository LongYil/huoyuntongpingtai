<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>车辆管理</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/basic/locale/easyui-lang-zh_CN.js"></script>	
	<style>
		.cdmc{
		margin-left:140px;
		font-size:18px;
		color:#0248b5;
		font-weight:bold;
		}
	</style>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:760px;height:40px;margin-top:20px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="addPanel()">添加车辆</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="shanchu()">删除车辆</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="shuaxin()">刷新</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;" onclick="sxcd()">返回</a>
<span class="cdmc">车队名称:${cdmc}</span>
<input type="hidden" value="${cdclid}" class="cdclid"/>
<input type="hidden" value="${cdmc}" class="cdclmc"/>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:840px;height:580px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有车辆">
		<table id="dg" class="easyui-datagrid" border="0" title="车辆信息" style="width:835px;height:545px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'">车辆编号</th>
				<th data-options="field:'c',width:80,align:'center'">所属车队</th>
				<th data-options="field:'d',width:80,align:'center'">车牌号</th>
				<th data-options="field:'e',width:80,align:'center'">车辆类型</th>
				<th data-options="field:'f',width:80,align:'center'">车辆长度</th>
				<th data-options="field:'g',width:80,align:'center'">车辆宽度</th>
				<th data-options="field:'h',width:80,align:'center'">车辆高度</th>
				<th data-options="field:'i',width:80,align:'center'">载物体积</th>
				<th data-options="field:'j',width:80,align:'center'">随车联系人</th>
				<th data-options="field:'k',width:80,align:'center'">随车联系电话</th>
				<th data-options="field:'l',width:80,align:'center'">车辆品牌</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listclxx}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
				    <td>${item.id}</td>
				    <td>${cdmc}</td>
					<td>${item.cph}</td>
					<td>${item.cllx}</td>
					<td>${item.clcd}</td>
					<td>${item.clkd}</td>
					<td>${item.clgd}</td>
					<td>${item.cltj}</td>
					<td>${item.sclxr}</td>
					<td>${item.sclxdh}</td>
					<td>${item.clpp}</td>
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
			title: '添加车辆',
			content: '<iframe src="cys_cdtjcl.jsp" frameborder="0" style="margin-left:20px;padding:5px;width:800px;height:530px;"></iframe>',
			closable: true
		});
	}
	
	function shanchu(){
		var row = $('#dg').datagrid('getSelected');
		var name = row.d;
		var id = row.b;
		if (row){
			$.messager.confirm("确认","是否删除车辆:"+name, function (r) {  
		        if (r) {
		        	tijiao(id);			        	
		        }  
		    }); 
		}
	}
	
	function shuaxin(){
		var id = $(".cdclid").val();
		var mc = $(".cdclmc").val();
		window.location="clxx_glyFindById.action?id="+id+"&&mc="+mc;
	}
	
	function sxcd(){
		window.location = "yscd_cysFindAll.action";
	}
	
	var rqt = null;
	function tijiao(arg0){
		if(window.XMLHttpRequest){//非IE浏览器
			rqt = new XMLHttpRequest();
		}else if(window.ActiveXObject){
			try{
				rqt = new ActiveXObject("Msxml2.XMLHTTP");
			}catch(e){
				try{
					rqt = new ActiveXObject("Microsoft.XMLHTTP");
				}catch(e){		
				}
			}
		}
		rqt.onreadystatechange = getresult;
		rqt.open("POST","clxx_cysyhSccl.action?id="+encodeURI(encodeURI(arg0)),false);
		rqt.send("");
	};
			
	function getresult(){
	   if(rqt.readyState == 4){
		   if(rqt.status == 200){
			   var temp = rqt.responseText;
			   if(temp=="true"){
					var a = $.messager.alert('提示','车辆删除成功。');
					setTimeout("yanchishuaxin()",1500);
			   }else{
				    $.messager.alert('提示','车辆删除失败，请重试!','warning'); 
			   }
			};
		}
	}

	function yanchishuaxin(){
		var id = $(".cdclid").val();
		var mc = $(".cdclmc").val();
		window.location="clxx_glyFindById.action?id="+id+"&&mc="+mc;
	}
	
	</script>
</body>
</html>