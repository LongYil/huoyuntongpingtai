<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>添加车辆</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:810px;max-height:550px;padding:30px 60px;border:0px solid #ffffff;">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/clxx_cd_save.action" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="cph" value="${clxx.cph}" style="width:40%" data-options="label:'车牌号',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="cllx" value="${clxx.cllx}" style="width:40%" data-options="label:'车辆类型',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="clcd" value="${clxx.clcd}" style="width:40%" data-options="label:'车辆长度',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="clkd" value="${clxx.clkd}" style="width:40%" data-options="label:'车辆宽度',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="clgd" value="${clxx.clgd}" style="width:40%" data-options="label:'车辆高度',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="cltj" value="${clxx.cltj}" style="width:40%" data-options="label:'载物体积 ',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="sclxr" value="${clxx.sclxr}" style="width:40%" data-options="label:'随车联系人',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="sclxdh" value="${clxx.sclxdh}" style="width:40%" data-options="label:'随车联系电话',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="clpp" value="${clxx.clpp}" style="width:40%" data-options="label:'车辆品牌',required:true">	
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
		$('#ff').form('submit',{
			onSubmit:function(){
				if(a){
					$.messager.alert('提示','保存成功!');
					return $(this).form('enableValidation').form('validate');
				}else{
					$.messager.alert('温馨提示','信息填写不完整，请填写完整信息!','warning');
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