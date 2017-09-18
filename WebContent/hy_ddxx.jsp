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

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:640px;margin-left:-20px;margin-bottom:0px;">
	<div title="所有订单">
		<table id="dg" class="easyui-datagrid" style="width:820px;height:600px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:80,align:'center'">序号</th>
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
				<th data-options="field:'w',width:120,align:'center'">操作</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${listdd}" var="item" begin="0" step="1" varStatus="status">
				<tr>
				    <td>${status.index+1}</td>
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
					<td><a href="javascript:void(0)" class="easyui-linkbutton" onClick="queren('${item.id}')">确认接单</a></td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
	<script type="text/javascript">
		function queren(arg){
			var row = $('#dg').datagrid('getSelected');
			var hwmc = row.g;
			var fhname = row.p;
			var cfdz = row.i;
			var dddz = row.j;
			var fkf = row.ei;
			var fkzt = row.ej;
			var info = "货物名称:"+hwmc+"<br/>发货人姓名:"+fhname+"<br/>出发地址:"+cfdz+"<br/>到达地址:"+dddz+"<br/>";
			$.messager.confirm('确认接单', '是否确认接单 ?<br/>'+info, function(r){
				if (r){
					if(fkf=="1"){//付款方式为 发付，无需代理点付款  检查是否已付款 若未付款  将从代理点账户扣除货款
						if(fkzt=="2"){//用户已付款，直接提交   只需修改订单状态为 已接单 即可 
							tijiao(arg);
						}else{//用户未付款，确认提交订单将从 代理点 账户扣除货款费用
							$.messager.confirm("确认","该订单未付款,请确认您已收到用户的现金货款,确认接单将从您的平台账户扣除货款。", function (r) {  
						        if (r) {  
						        	tijiao(arg);
						        }else{
						        	;
						        }
						    }); 	
						}		
					}else{//付款方式为到付 由发货代理点先代替付款   
						$.messager.confirm("确认","该订单付款方式为到付,确认接单平台将从您的账户扣除货款，订单确认签收后，平台将退还该货款。", function (r) {  
					        if (r) {  
					        	tijiao(arg);
					        }else{
					        	;
					        }
					    });
					}	
				}
			});
		}
	
		
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
			rqt.open("POST","dd_hydldJd.action?id="+encodeURI(encodeURI(arg0)),false);
			rqt.send("");
			};
			
			function getresult(){
			   if(rqt.readyState == 4){
				   if(rqt.status == 200){
					   var temp = rqt.responseText;
					   if(temp=="1"){
							var a = $.messager.alert('提示','接单成功。');
							setTimeout("yanchishuaxin()",1500);
					   }else{
						    $.messager.alert('提示','您的账户余额不足，接单失败，请充值后重试!','warning'); 
					   }
					};
				   }
			}

			function yanchishuaxin()
			{
			window.location.href="dd_findAll.action?yhlx=2&id=1";
			}
	</script>
</body>
</html>