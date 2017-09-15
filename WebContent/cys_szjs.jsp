<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>设置角色</title>
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
	<div class="easyui-panel"  style="width:100%;max-width:830px;max-height:678px;padding:30px 60px;" title="设置角色">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/cysjs_gxjs.action" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-left:230px;margin-bottom:30px;">
				<span class="tou">选择角色</span>
				<select  class="mycombox" name="jsbh" style="width:30%">
					<c:forEach items="${listjs}" var="item" begin="0" step="1" varStatus="status">
						<option value="${item.id}">${item.jsmc}</option>
					</c:forEach>
				</select>
			</div>

		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">保存</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
	
	function submitForm(){
		var a = $("#ff").form('enableValidation').form('validate');
		$('#ff').form('submit',{
			onSubmit:function(){
				if(a){
					$.messager.alert('提示','保存成功!');
					return $(this).form('enableValidation').form('validate');
				}else{
					$.messager.alert('温馨提示','信息填写不完整，请填写完整信息!','warning');
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