<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>用户订单</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/basic/locale/easyui-lang-zh_CN.js"></script>	
</head>
<body style="padding-top:0px; padding-bottom:0px;">

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:680px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有订单">
		<form action="${pageContext.request.contextPath}/dd_cysjd.action" method="post" name="myform">
		<table id="dg" class="easyui-datagrid" style="width:830px;height:580px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'ab',width:80,align:'center'">选择</th>
				<th data-options="field:'b',width:80,align:'center'" hidden="hidden">委托人编号</th>
				<th data-options="field:'c',width:80,align:'center'" hidden="hidden">发货代理点编号</th>
				<th data-options="field:'b',width:80,align:'center'" hidden="hidden">收货代理点编号</th>
				<th data-options="field:'e',width:80,align:'center'" hidden="hidden">承运商编号</th>
				<th data-options="field:'ei',width:80,align:'center'" hidden="hidden">付款方</th>
				<th data-options="field:'ej',width:80,align:'center'" hidden="hidden">付款状态</th>
				<th data-options="field:'f',width:80,align:'center'">订单状态</th>
				<th data-options="field:'g',width:100,align:'center'">货物名称</th>
				<th data-options="field:'i',width:200,align:'center'">出发地址</th>
				<th data-options="field:'j',width:200,align:'center'">到达地址</th>
				<th data-options="field:'k',width:80,align:'center'">总件数</th>
				<th data-options="field:'l',width:80,align:'center'">总重量</th>
				<th data-options="field:'m',width:80,align:'center'">总体积</th>
				<th data-options="field:'n',width:80,align:'center'">预计运费</th>
				<th data-options="field:'o',width:80,align:'center'">实付运费</th>
				<th data-options="field:'p',width:80,align:'center'">发货人姓名</th>
				<th data-options="field:'q',width:120,align:'center'">发货人电话</th>
				<th data-options="field:'r',width:80,align:'center'">收货人姓名</th>
				<th data-options="field:'s',width:120,align:'center'">收货人电话</th>
				<th data-options="field:'t',width:120,align:'center'">订单发起时间</th>
				<th data-options="field:'u',width:120,align:'center'">预计到达时间</th>
				<th data-options="field:'v',width:120,align:'center'">实际到达时间</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listdd}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
				    <td><input type="checkbox" name="id" value="${item.id}"></td>
					<td hidden="hidden">${item.wtrbh}</td>
					<td hidden="hidden">${item.fhdld}</td>
					<td hidden="hidden">${item.shdld}</td>
					<td hidden="hidden">${item.cys}</td>
					<td hidden="hidden">${item.fkf}</td>
					<td hidden="hidden">${item.fkzt}</td>
					<td>${item.ddzt}</td>
					<td>${item.hwmc}</td>
					<td>${item.cfsf}${item.cfcs}${item.cfx}${item.cfjd}</td>
					<td>${item.ddsf}${item.ddcs}${item.ddx}${item.ddjd}</td>
					<td>${item.zjs}</td>
					<td>${item.zzl}</td>
					<td>${item.ztj}</td>
					<td>${item.yjyf}</td>
					<td>${item.sfyf}</td>
					<td>${item.fhrxm}</td>
					<td>${item.fhrdh}</td>
					<td>${item.shrxm}</td>
					<td>${item.shrdh}</td>
					<td>${item.fqsj}</td>
					<td>${item.yjsdsj}</td>
					<td>${item.sjsdsj}</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		<div style="text-align:center;padding:5px 0;margin-top:15px;">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
		</div>
		</form>
	</div>
	<script type="text/javascript">
		function submitForm(){
			$.messager.confirm('开始运输', '是否确认接单 ?', function(r){
			        if(r){
			        	$.messager.alert('温馨提示','提交成功!');
			        	setTimeout("yanchishuaxin()",2000);
					}else{
						;
					}
			});
		}

		function yanchishuaxin(){
			myform.submit();
		}
		
		
	</script>
</body>
</html>