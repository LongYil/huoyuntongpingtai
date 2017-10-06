<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>申诉订单</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:640px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有订单">
		<table id="dg" class="easyui-datagrid" border="0" style="width:825px;height:600px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'" hidden="hidden">委托人编号</th>
				<th data-options="field:'c',width:80,align:'center'" hidden="hidden">发货代理点编号</th>
				<th data-options="field:'b',width:80,align:'center'" hidden="hidden">收货代理点编号</th>
				<th data-options="field:'e',width:80,align:'center'" hidden="hidden">承运商编号</th>
				<th data-options="field:'x',width:100,align:'center'">退款状态</th>
				<th data-options="field:'y',width:100,align:'center'">申请退款金额</th>
				<th data-options="field:'z',width:100,align:'center'">实际退款金额</th>
				<th data-options="field:'g',width:100,align:'center'">货物名称</th>
				<th data-options="field:'i',width:200,align:'center'">出发地址</th>
				<th data-options="field:'j',width:200,align:'center'">到达地址</th>
				<th data-options="field:'k',width:80,align:'center'">总件数</th>
				<th data-options="field:'l',width:80,align:'center'">总重量</th>
				<th data-options="field:'m',width:80,align:'center'">总体积</th>
				<th data-options="field:'ni',width:80,align:'center'">货款费用</th>
				<th data-options="field:'n',width:80,align:'center'">预计运费</th>
				<th data-options="field:'o',width:80,align:'center'">实付运费</th>
				<th data-options="field:'p',width:80,align:'center'">发货人姓名</th>
				<th data-options="field:'q',width:120,align:'center'">发货人电话</th>
				<th data-options="field:'r',width:80,align:'center'">收货人姓名</th>
				<th data-options="field:'s',width:120,align:'center'">收货人电话</th>
				<th data-options="field:'t',width:120,align:'center'">订单发起时间</th>
				<th data-options="field:'u',width:120,align:'center'">预计到达时间</th>
				<th data-options="field:'v',width:120,align:'center'">实际到达时间</th>
			<c:if test="${temp=='1'}">
				<th data-options="field:'zz',width:80,align:'center'">操作</th>
			</c:if>				
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listddvo}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
					<td hidden="hidden">${item.dd.wtrbh}</td>
					<td hidden="hidden">${item.dd.fhdld}</td>
					<td hidden="hidden">${item.dd.shdld}</td>
					<td hidden="hidden">${item.dd.cys}</td>
					<td>${item.jyzt}</td>
					<td>${item.ycdd.sqje}</td>
					<td>${item.ycdd.sjje}</td>
					<td>${item.dd.hwmc}</td>
					<td>${item.dd.cfsf}${item.dd.cfcs}${item.dd.cfx}${item.dd.cfjd}</td>
					<td>${item.dd.ddsf}${item.dd.ddcs}${item.dd.ddx}${item.dd.ddjd}</td>
					<td>${item.dd.zjs}</td>
					<td>${item.dd.zzl}</td>
					<td>${item.dd.ztj}</td>
					<td>${item.dd.hkfy}</td>
					<td>${item.dd.yjyf}</td>
					<td>${item.dd.sfyf}</td>
					<td>${item.dd.fhrxm}</td>
					<td>${item.dd.fhrdh}</td>
					<td>${item.dd.shrxm}</td>
					<td>${item.dd.shrdh}</td>
					<td>${item.dd.fqsj}</td>
					<td>${item.dd.yjsdsj}</td>
					<td>${item.dd.sjsdsj}</td>
					<td>
					<a href="javascript:void(0)" class="easyui-linkbutton" onClick="chuli('${item.dd.id}')">&nbsp;处&nbsp;理&nbsp;</a>
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