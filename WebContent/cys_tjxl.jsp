<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>添加线路</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="添加线路">
		<form id="ff" class="easyui-form" method="post" data-options="novalidate:true">
	
			<div style="margin-bottom:20px">
				<select class="easyui-combobox" name="language" label="出发省份" style="width:30%">
				<option value="ar">中国</option>
				<option value="bg">英国</option>
				</select>
				<select class="easyui-combobox" name="language" label="出发城市" style="width:30%">
				<option value="ar">中国</option>
				<option value="bg">英国</option>
				</select>	
				<select class="easyui-combobox" name="language" label="出发县" style="width:30%">
				<option value="ar">中国</option>
				<option value="bg">英国</option>
				</select>							
			</div>
			<div style="margin-bottom:20px">
				<select class="easyui-combobox" name="language" label="到达省份" style="width:30%">
				<option value="ar">中国</option>
				<option value="bg">英国</option>
				</select>
				<select class="easyui-combobox" name="language" label="到达城市" style="width:30%">
				<option value="ar">中国</option>
				<option value="bg">英国</option>
				</select>	
				<select class="easyui-combobox" name="language" label="到达县" style="width:30%">
				<option value="ar">中国</option>
				<option value="bg">英国</option>
				</select>							
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="price" style="width:40%" data-options="label:'重货价格',required:true">
				<select class="easyui-combobox" name="language" label="重货单位" style="width:30%">
				<option value="ar">中国</option>
				<option value="bg">英国</option>
				</select>						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="price" style="width:40%" data-options="label:'轻货价格',required:true">
				<select class="easyui-combobox" name="language" label="轻货单位" style="width:30%">
				<option value="ar">中国</option>
				<option value="bg">英国</option>
				</select>						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="speed" style="width:40%" data-options="label:'运输时效(X天/次)',required:true">
				<input class="easyui-textbox" name="send" style="width:40%" data-options="label:'发车频率',required:true">
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