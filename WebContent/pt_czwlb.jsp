<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>充值物流币</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding-top:0px; padding-bottom:0px;">
	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:640px;margin-left:-20px;margin-bottom:0px;">
	<div title="充值物流币">
		<table id="dg" class="easyui-datagrid" border="0" style="width:825px;height:600px"
			data-options="singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'a',width:40,align:'center'">序号</th>
				<th data-options="field:'b',width:80,align:'center'" hidden="hidden">用户编号</th>
				<th data-options="field:'id',width:80,align:'center'" hidden="hidden">交易记录编号</th>
				<th data-options="field:'c',width:100,align:'center'">用户姓名</th>
				<th data-options="field:'d',width:120,align:'center'">联系电话</th>
				<th data-options="field:'e',width:150,align:'center'">充值时间</th>
				<th data-options="field:'f',width:80,align:'center'">充值金额</th>
				<th data-options="field:'g',width:180,align:'center'">证件号</th>
				<th data-options="field:'v',width:150,align:'center'">操作</th>
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
					<td>${item.jyjl.jysj}</td>
					<td>${item.jyjl.jyje}</td>
					<td>${item.jyjl.jyrid}</td>
					<td>
					<a href="javascript:void(0)" class="easyui-linkbutton" onClick="tongyi('${item.jyjl.id}')">同意申请</a>
					<a href="javascript:void(0)" class="easyui-linkbutton" onClick="bohui('${item.jyjl.id}')">驳回申请</a>
					</td>			
				</tr>
				</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
</body>
	<script type="text/javascript">
	var rqt;
	function tongyi(arg0){
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
		rqt.open("POST","jyjl_ptCzwlb.action?id="+encodeURI(encodeURI(arg0)),false);
		rqt.send("");
	   };
	   function getresult(){
		   if(rqt.readyState == 4){
			   if(rqt.status == 200){
				   var temp = rqt.responseText;
				   if(temp=="true"){
						$.messager.alert('提示','操作成功');
						setTimeout("yanchishuaxin()",1500);
				   }else{
					   $.messager.alert('提示','操作失败!','warning'); 
				   }
				};
			   }
		}		
	   
	   
	function bohui(arg0){
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
		rqt.onreadystatechange = getresult1;
		rqt.open("POST","jyjl_ptBhsq.action?id="+encodeURI(encodeURI(arg0)),false);
		rqt.send("");
	   };
	   function getresult1(){
		   if(rqt.readyState == 4){
			   if(rqt.status == 200){
				   var temp = rqt.responseText;
				   if(temp=="true"){
						$.messager.alert('提示','操作成功');
						setTimeout("yanchishuaxin()",1500);
				   }else{
					   $.messager.alert('提示','操作失败!','warning'); 
				   }
				};
			   }
		}		
	   
	   function yanchishuaxin(){
		   window.location="Jyjl_ptFindAllCzsq.action";
	   }
	   
	   
	</script>
</html>