<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>添加订单</title>
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

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="添加订单">
		<form id="ff" action="${pageContext.request.contextPath}/wlx_save.action" class="easyui-form" method="post" data-options="novalidate:true">
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="zhjg" style="width:40%" data-options="label:'货物名称',required:true">					
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="zhjg" style="width:40%" data-options="label:'货物类型',required:true">					
			</div>
			<div style="margin-bottom:20px"   id="area_address1">
				<span class="tou">出发地址</span>
				<select  class="mycombox" name="province" style="width:19%">
				</select>
				<select  class="mycombox" name="city" style="width:19%">
				</select>	
				<select  class="mycombox" name="area" style="width:19%">
				</select>
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="zhjg" style="width:40%" data-options="label:'出发街道',required:true">					
			</div>
			
			<div style="margin-bottom:20px"   id="area_address2">
				<span class="tou">到达地址</span>
				<select  class="mycombox" name="province" style="width:19%">
				</select>
				<select  class="mycombox" name="city" style="width:19%">
				</select>	
				<select  class="mycombox" name="area" style="width:19%">
				</select>						
			</div>
<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="zhjg" style="width:40%" data-options="label:'到达街道',required:true">					
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="zhjg" style="width:40%" data-options="label:'总件数',required:true">(单位:件)						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="qhjg" style="width:40%" data-options="label:'总重量',required:true">(单位:千克)						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="yssx" style="width:40%" data-options="label:'总体积',required:true">(单位:立方米)
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="fcpl" style="width:40%" data-options="label:'预计运费',required:true">(单位:元)
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="fcpl" style="width:40%" data-options="label:'发货人姓名',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="fcpl" style="width:40%" data-options="label:'发货人电话',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="fcpl" style="width:40%" data-options="label:'收货人姓名',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="fcpl" style="width:40%" data-options="label:'收货人电话',required:true">
			</div>
			<div style="margin-bottom:20px" id="area_address">
				<select class="easyui-combobox" name="info" label="是否代收货款" style="width:30%">
				<option value="ar">是</option><option value="bg">否</option>
				</select>
			</div>
        <div style="margin-bottom:20px" id="area_address">
				<select class="easyui-combobox" name="info" label="是否上门提货" style="width:30%">
				<option value="ar">是</option><option value="bg">否</option>
				</select>
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
					$.messager.alert('提示','保存成功!');
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