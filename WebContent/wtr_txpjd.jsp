<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>填写评价</title>
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

	<div class="easyui-panel" style="width:100%;max-width:780px;max-height:600px;padding:30px 60px;border:0px solid #ffffff;">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/pj_save.action" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px" >
				<span>评价发货代理点</span><br><br>
				评价类型:&nbsp;&nbsp;<input type="radio" name="cysPja" value="1">好评<input type="radio" name="cysPja" value="2">中评<input type="radio" name="cysPja" value="3">差评<br/><br/>
				<input class="easyui-textbox" name="cysPjb" style="width:91%;height:60px" data-options="label:'评价描述:',multiline:true">
			</div>
			
			<div style="margin-bottom:20px" >
				<span>评价承运商</span><br><br>
				评价类型:&nbsp;&nbsp;<input type="radio" name="fhdldPja" value="1">好评<input type="radio" name="fhdldPja" value="2">中评<input type="radio" name="fhdldPja" value="3">差评<br/><br/>
				<input class="easyui-textbox" name="fhdldPjb" style="width:91%;height:60px" data-options="label:'评价描述:',multiline:true">
			</div>
			
			<div style="margin-bottom:20px" >
				<span>评价收货代理点</span><br><br>
				评价类型:&nbsp;&nbsp;<input type="radio" name="shdldPja" value="1">好评<input type="radio" name="shdldPja" value="2">中评<input type="radio" name="shdldPja" value="3">差评<br/><br/>
				<input class="easyui-textbox" name="shdldPjb" style="width:91%;height:60px" data-options="label:'评价描述:',multiline:true">
			</div>
			
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
		var index = 0;
		function submitForm(){
			var a = $("#ff").form('enableValidation').form('validate');
			$('#ff').form('submit',{
				onSubmit:function(){
						$.messager.alert('提示','评价成功!');
						setTimeout("yanchishuaxin()",1500);
						return $(this).form('enableValidation').form('validate');
				}
			});
		}
		
		function clearForm(){
			$('#ff').form('clear');
		}
		function yanchishuaxin(){
			parent.parent.To('dd_findAll.action?yhlx=1&id=5');
		}
	</script>
</body>
</html>