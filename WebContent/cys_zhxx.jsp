<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>会员银行账号信息</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="会员银行账户信息">
		<form id="ff" action="${pageContext.request.contextPath}/yhzh_saveorupdate.action" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px">
				<select class="easyui-combobox" name="yhlx" label="银行类型" style="width:40%">
				<option value="${yhzh.yhlx}">${yhzh.yhlx}</option>
				<option value="中国工商银行">中国工商银行</option>
				<option value="中国农业银行">中国农业银行</option>
				<option value="中国邮政银行">中国邮政银行</option>
				</select>
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="ckrxm" value="${yhzh.ckrxm}" style="width:40%" data-options="label:'持卡人姓名',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="yhzh" value="${yhzh.yhzh}" style="width:40%" data-options="label:'银行卡号',required:true">
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