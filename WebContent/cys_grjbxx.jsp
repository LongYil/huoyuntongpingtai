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
	<script type="text/javascript" src="js/lzx/area.js"></script>
	<style type="text/css">
		.mycombox{
		border:1px #95b8e7 solid;
		height:25px;
		border-radius:4px;
		font-size:12px;
		}
		.tou{
		margin-right:10px;
		margin-left:20px;
		}
	</style>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="会员基本信息">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/cys_updategly.action" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="info" value="${jbyh.yhxm}" style="width:40%" data-options="label:'用户姓名',required:true" >
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="info" value="${cysgly.gsmc}" style="width:40%" data-options="label:'公司名称',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="info"  value="${cysgly.yhyx}" style="width:40%" data-options="label:'Email:',required:true,validType:'email'">
			</div>
			<div style="margin-bottom:20px" id="area_address">
				<input class="easyui-textbox" id="gsdz" value="${cysgly.szsf}${cysgly.szcs}${cysgly.szx}" style="width:40%" data-options="label:'公司地址:',required:true">
				<span class="tou">修改</span>
				<select  class="mycombox" name="province" style="width:15%">
				</select>
				<select  class="mycombox" name="city" style="width:15%">
				</select>	
				<select  class="mycombox" name="area" style="width:15%">
				</select>
			</div>
			<input type="hidden" name="info" class="szsf" value="${cysgly.szsf}">
			<input type="hidden" name="info" class="szcs" value="${cysgly.szcs}">
			<input type="hidden" name="info" class="szx" value="${cysgly.szx}">
			
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="info" value="${cysgly.xxdz}" style="width:91%;height:60px" data-options="label:'详细地址:',multiline:true">
			</div>
			
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
	var cfsf ;
	var cfcs ;
	var cfx ;
	
	var dz;
	$('#area_address').citys({
        required:false,
        nodata:'disabled',
        onChange:function(data){
        	cfsf = data['province'];
        	cfcs = data['city'];
        	cfx = data['area'];
			dz = cfsf+""+cfcs+""+cfx;
			
			$('#gsdz').textbox('setValue',dz);
			$(".szsf").val(cfsf);
			$(".szcs").val(cfcs);
			$(".szx").val(cfx);
        }
	});
	

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