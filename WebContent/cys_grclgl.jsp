<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>车辆信息</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="车辆信息">
		<form id="ff" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="cph" style="width:40%" data-options="label:'车牌号',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="cllx" style="width:40%" data-options="label:'车辆类型',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="clcd" style="width:40%" data-options="label:'车辆长度',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="clkd" style="width:40%" data-options="label:'车辆宽度',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="cltj" style="width:40%" data-options="label:'车辆体积 ',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="sclxr" style="width:40%" data-options="label:'随车联系人',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="sclxdh" style="width:40%" data-options="label:'随车联系电话',required:true">	
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="clpp" style="width:40%" data-options="label:'车辆品牌',required:true">	
			</div>
			
			






		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
		function submitForm(){
			$('#ff').form('submit',{
				onSubmit:function(){
					return $(this).form('enableValidation').form('validate');
				}
			});
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
</body>
</html>