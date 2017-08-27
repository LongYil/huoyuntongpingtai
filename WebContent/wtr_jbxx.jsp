<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>会员基本信息</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>

</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="会员基本信息">
		<form id="ff" action="${pageContext.request.contextPath}/wtr_updateWtrInfo.action" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="info" value="${jbyh.yhxm}" style="width:40%" data-options="label:'用户姓名',required:true" >
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="info" value="${wtr.gsmc}" style="width:40%" data-options="label:'公司名称',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="info"  value="${wtr.yhyx}" style="width:40%" data-options="label:'Email:',required:true,validType:'email'">
			</div>
			<div style="margin-bottom:20px" id="area_address">
				<select class="easyui-combobox" name="info" label="个人地址-省" style="width:30%">
				<option value="ar">${wtr.yhsf}</option><option value="bg">英国</option>
				<option value="ca">俄罗斯</option><option value="zh-cht">美国</option>
				</select>
				<select class="easyui-combobox" name="info" label="个人地址-市" style="width:30%">
				<option value="ar">${wtr.yhcs}</option><option value="bg">英国</option>
				<option value="ca">俄罗斯</option><option value="zh-cht">美国</option>
				</select>
				<select class="easyui-combobox" name="info" label="个人地址-县" style="width:30%">
				<option value="ar">${wtr.yhx}</option><option value="bg">英国</option>
				<option value="ca">俄罗斯</option><option value="zh-cht">美国</option>
				</select>
			</div>
			
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="info" value="${wtr.yhbz}" style="width:91%;height:60px" data-options="label:'备注:',multiline:true">
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
					var flag = $(this).form('enableValidation').form('validate');
					if(flag){
						$.messager.alert('提示','保存成功!');
						return $(this).form('enableValidation').form('validate');
					}else{
						$.messager.alert('温馨提示','信息不完整，请填写完整信息!','warning');
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