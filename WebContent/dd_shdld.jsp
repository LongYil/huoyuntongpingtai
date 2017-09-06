<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>设置收货代理点</title>
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
	margin-right:15px;
	}
	</style>
</head>
<body style="padding:0px;margin:0px;">
	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="收货代理点">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/dd_disanbu.action" class="easyui-form" method="post" data-options="novalidate:true">
			<div style="margin-bottom:20px"   id="area_address1">
				<span class="tou">选择：</span>
				<select  class="mycombox" name="shid" id="shid" style="width:50%">
					<c:forEach items="${listhygly}" var="item" begin="0" step="1" varStatus="status">
						<option value="${item.glybh}">${item.gsmc}公司——${item.szsf}-${item.szcs}-${item.szx}-${item.szjdh}-${item.lxdh}</option>
					</c:forEach>
				</select>
			</div>
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>

	function submitForm(){
		var a = $("#ff").form('enableValidation').form('validate');
		if(a){
			var shid = $("#shid").val();
			tijiao(shid);
		}else{
			$.messager.alert('温馨提示','信息填写不完整，请填写完整信息!','warning');
		}
	}
		function clearForm(){
			$('#ff').form('clear');
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
		rqt.open("POST","dd_disanbu.action?shid="+encodeURI(encodeURI(arg0)),false);
		rqt.send("");
	   };
		
	   function getresult(){
		   if(rqt.readyState == 4){
			   if(rqt.status == 200){
				   var temp = rqt.responseText;
				   if(temp=="1"){
						$.messager.alert('提示','订单已成功提交并付款成功。');
				   }else if(temp=="2"){
					    $.messager.alert('提示','订单已成功提交，因您的账户余额不足，付款失败，你可以充值后再付款，或者在货运代理点现金付款。');
				   }else{
					    $.messager.alert('提示','订单已成功提交，您选择了到付业务，货款需收货人在收货时支付。');
				   }
				};
			   }
		}
		
		
	</script>
</body>
</html>