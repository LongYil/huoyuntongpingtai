<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>账号信息</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="账号信息">
		<form id="ff" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px">
				<input class="easyui-textbox" disabled="true" value="个人车主" style="width:40%;font-weight:bold;" data-options="label:'用户类型',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" disabled="true" value="${jbyh.yhm}" style="width:40%" data-options="label:'用户名',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" disabled="true" value="${jbyh.yhsj}" style="width:40%" data-options="label:'手机号',required:true">
			</div>
			
<!-- 			<div style="margin-bottom:20px"> -->
<!-- 				<input class="easyui-textbox" value="" style="width:91%;height:60px" data-options="label:'说明:',multiline:true"> -->
<!-- 			</div> -->
		</form>

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