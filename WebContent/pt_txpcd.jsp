<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>填写赔偿单</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/lzx/area.js"></script>
</head>
<body style="padding:0px;margin:0px;">
			
	<div class="easyui-panel" style="width:100%;max-width:780px;max-height:600px;padding:30px 60px;border:0px solid #ffffff;">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/ycdd_clpc.action" class="easyui-form" method="post" data-options="novalidate:true">
			
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" readOnly="true" value="${ycdd.sqje}" style="width:40%" data-options="label:'申请赔偿金额:',required:true">&nbsp;&nbsp;单位：(元)
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" style="width:40%" name="info" data-options="prompt:'0',label:'发货代理点:',required:false">&nbsp;&nbsp;单位：(元)
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" style="width:40%" name="info" data-options="prompt:'0',label:'承运商:',required:false">&nbsp;&nbsp;单位：(元)
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" style="width:40%" name="info" type="text"  data-options="prompt:'0',label:'收货代理点:',required:false">&nbsp;&nbsp;单位：(元)
			</div>
			
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
		
	</div>
	<script>
		var index = 0;
		function submitForm(){
			var a = $("#ff").form('enableValidation').form('validate');
			$('#ff').form('submit',{
				onSubmit:function(){
					if(a){
						$.messager.alert('提示','提交成功!');
						setTimeout("yanchishuaxin()",1500);
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
		
		function yanchishuaxin(){
			parent.shuaxin();
		}
		
	</script>
</body>
</html>