<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>添加角色</title>
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

	<div class="easyui-panel"  style="width:100%;max-width:830px;max-height:678px;padding:30px 60px;" title="添加角色">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/dd_diyibu.action" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px">
				<span class="tou">帐号管理</span>
				<select  class="mycombox" name="hwlx" style="width:10%">
					<option value="1">可用</option>
					<option value="2">不可用</option>
				</select>
			</div>

			
			

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