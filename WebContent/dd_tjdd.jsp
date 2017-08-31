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

	<div class="easyui-panel"  style="width:100%;max-width:840px;max-height:678px;padding:30px 60px;" title="添加订单">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/dd_diyibu.action" class="easyui-form" method="post" data-options="novalidate:true">
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="hwmc" style="width:40%" data-options="label:'货物名称',required:true">					
			</div>
			<div style="margin-bottom:20px">
				<span class="tou">货物类型</span>
				<select  class="mycombox" name="hwlx" style="width:30%">
					<option value="1">服装类</option>
					<option value="2">水果类</option>
				</select>
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
				<input class="easyui-textbox" name="cfjd" style="width:40%" data-options="label:'出发街道',required:true">					
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
				<input class="easyui-textbox" name="ddjd" style="width:40%" data-options="label:'到达街道',required:true">					
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="zjs" style="width:40%" data-options="label:'总件数',required:true">(单位:件)						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="zzl" style="width:40%" data-options="label:'总重量',required:true">(单位:千克)						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="ztj" style="width:40%" data-options="label:'总体积',required:true">(单位:立方米)
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="fhrxm" style="width:40%" data-options="label:'发货人姓名',required:true">
				&nbsp;&nbsp;<input class="easyui-textbox" name="fhrdh" style="width:40%" data-options="label:'发货人电话',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="shrxm" style="width:40%" data-options="label:'收货人姓名',required:true">
				&nbsp;&nbsp;<input class="easyui-textbox" name="shrdh" style="width:40%" data-options="label:'收货人电话',required:true">
			</div>
			<div style="margin-bottom:20px" id="area_address">
				<span class="tou" style="margin-right:8px;">是否代收货款</span>
				<select  class="mycombox" name="dshk" style="width:19%">
					<option value="1">是</option>
					<option value="2">否</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<span class="tou" style="margin-right:8px;">是否上门提货</span>
				<select  class="mycombox" name="smth" style="width:19%">
					<option value="1">是</option>
					<option value="2">否</option>
				</select>
			</div>
			
			
			<input type="hidden" name="cfsf" id="cfsf"/>
	        <input type="hidden" name="cfcs" id="cfcs"/>
	        <input type="hidden" name="cfx" id="cfx"/>
	        
			<input type="hidden" name="ddsf" id="ddsf"/>
	        <input type="hidden" name="ddcs" id="ddcs"/>
	        <input type="hidden" name="ddx" id="ddx"/>

		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">下一步</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
	
	
    var cfsf;
    var cfcs;
    var cfx;
    
    var ddsf;
    var ddcs;
    var ddx; 
	$('#area_address1').citys({
	        required:false,
	        nodata:'disabled',
	        onChange:function(data){
	        	cfsf = data['province'];
	        	cfcs = data['city'];
	        	cfx = data['area'];
				$("#cfsf").val(cfsf);
				$("#cfcs").val(cfcs);
				$("#cfx").val(cfx);
	        }
	});
		$('#area_address2').citys({
	        required:false,
	        nodata:'disabled',
	        onChange:function(data){
	        	ddsf = data['province'];
	        	ddcs = data['city'];
	        	ddx = data['area'];
				$("#ddsf").val(ddsf);
				$("#ddcs").val(ddcs);
				$("#ddx").val(ddx);
	        }
	    });
	
		
		function submitForm(){
			$('#ff').form('submit',{
				onSubmit:function(){
					var flag = $(this).form('enableValidation').form('validate');
					if(flag){
						myform.submit();
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