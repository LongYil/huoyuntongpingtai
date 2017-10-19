<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<div class="easyui-panel" style="border:0px #ffffff solid;width:100%;max-width:830px;max-height:480px;padding:30px 60px;" title="充值物流币">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/jyjl_cysSave.action" class="easyui-form" method="post" data-options="novalidate:true">
			<div style="margin-bottom:20px">
				<span>请汇款到如下账户:</span>						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" readOnly="true" value="${yhzh.yhlx}" style="width:40%" data-options="label:'收款银行',required:true">						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" readOnly="true" value="${yhzh.ckrxm }" style="width:40%" data-options="label:'收款人姓名',required:true">						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" readOnly="true" value="${yhzh.yhzh}" style="width:40%" data-options="label:'收款人账号',required:true">					
			</div>
			
			<div style="margin-bottom:20px">
				<span>请填写汇款信息:</span>						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="jyje" style="width:40%" data-options="label:'充值金额',required:true">(单位:元)						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="jyrxm" style="width:40%" data-options="label:'汇款人姓名',required:true">						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="jyrid" style="width:40%" data-options="label:'汇款人身份证',required:true">					
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