<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
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
					<option value="1">水果类</option>
					<option value="2">服装类</option>
					<option value="3">电子产品类</option>
					<option value="4">机械类</option>
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
				<input class="easyui-textbox" name="zjs" style="width:20%" data-options="label:'总件数',required:true">&nbsp;(单位:件)						
			    <input class="easyui-textbox" name="zzl" style="width:20%" data-options="label:'总重量',required:true">&nbsp;(单位:千克)
			    <input class="easyui-textbox" name="ztj" style="width:20%" data-options="label:'总体积',required:true">&nbsp;(单位:立方米)
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
				<select  class="mycombox" id="dshk" name="dshk" style="width:19%" onChange="daishouhuokuan()">
					<option value="2">否</option>
					<option value="1">是</option>
				</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span class="tou" id="hkfyt">货款费用:</span><input name="hkfy" id="hkfy" style="width:19%;border:1px #95b8e7 solid;height:20px;border-radius:4px;" data-options="label:'货款金额',required:true">	
				<span id="hkfyw">(单位:元)</span>
			</div>
			<div style="margin-bottom:20px" id="area_address">
				<span class="tou" style="margin-right:32px;">付款方式</span>
				<select  class="mycombox" name="fkf" style="width:19%" >
					<option value="1">发付</option>
					<option value="2">到付</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<span class="tou" style="margin-right:8px;">是否上门提货</span>
				<select  class="mycombox" name="smth" style="width:19%">
					<option value="2">否</option>
					<option value="1">是</option>	
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
	$("#hkfyt").hide();
	$("#hkfy").hide(); 
	$("#hkfyw").hide(); 

	
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
			var a = $("#ff").form('enableValidation').form('validate');
			if(a){
				myform.submit();
			}else{
				$.messager.alert('温馨提示','信息填写不完整，请填写完整信息!','warning');
			}
		}
		function clearForm(){
			$('#ff').form('clear');
		}
		
		function daishouhuokuan(){
			var temp = $("#dshk").val();
			if(temp==1){
				$("#hkfyt").show();
				$("#hkfy").show();
				$("#hkfyw").show();
			}else{
				$("#hkfyt").hide();
				$("#hkfy").hide();
				$("#hkfyw").hide();
			}
		}
		
		
	</script>
</body>
</html>