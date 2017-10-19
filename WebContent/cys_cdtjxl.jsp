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

	<div class="easyui-panel" style="width:100%;max-width:810px;max-height:600px;padding:30px 60px;border:0px solid #ffffff;">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/wlx_glySave.action" class="easyui-form" method="post" data-options="novalidate:true">
			<div style="margin-bottom:20px"   id="area_address1">
				<span class="tou">出发地址</span>
				<select  class="mycombox" name="province" style="width:19%">
				</select>
				<select  class="mycombox" name="city" style="width:19%">
				</select>	
				<select  class="mycombox" name="area" style="width:19%">
				</select>
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
				<input class="easyui-textbox" name="zhjg" style="width:40%" data-options="label:'重货价格',required:true">(单位:元/千克)						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="qhjg" style="width:40%" data-options="label:'轻货价格',required:true">(单位:元/立方米)						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="yssx" style="width:40%" data-options="label:'运输时效',required:true">(单位:天)
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="fcpl" style="width:40%" data-options="label:'发车频率',required:true">(单位:天/次)
			</div>

		<input type="hidden" name="cfsf" id="cfsf"/>
        <input type="hidden" name="cfcs" id="cfcs"/>
        <input type="hidden" name="cfx" id="cfx"/>
        
		<input type="hidden" name="ddsf" id="ddsf"/>
        <input type="hidden" name="ddcs" id="ddcs"/>
        <input type="hidden" name="ddx" id="ddx"/>
        
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
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
			var a = $("#ff").form('enableValidation').form('validate');
			$('#ff').form('submit',{
				onSubmit:function(){
					if(a){
						$.messager.alert('提示','保存成功!');
						setTimeout("yanchishuaxin()",1500);
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
		
		function yanchishuaxin(){
			parent.sxxl();
		}
	</script>
</body>
</html>