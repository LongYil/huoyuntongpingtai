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
				<input class="easyui-textbox" name="name" style="width:40%" data-options="label:'姓名',required:true">
				<input class="easyui-textbox" name="age" style="width:40%" data-options="label:'年龄',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="email" style="width:40%" data-options="label:'Email:',required:true,validType:'email'">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="message" style="width:50%;height:60px" data-options="label:'备注:',multiline:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-datebox" name="message" style="width:50%;" data-options="label:'日期:'">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-datetimebox" name="message" style="width:50%;" data-options="label:'日期时间:'">
			</div>
			<div style="margin-bottom:20px">
				<select class="easyui-combobox" name="language" label="语言" style="width:50%">
				<option value="ar">中国</option><option value="bg">英国</option>
				<option value="ca">俄罗斯</option><option value="zh-cht">美国</option></select>
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