<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>添加帐号</title>
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

	<div class="easyui-panel" style="border:0px solid #ffffff;width:100%;max-width:820px;max-height:500px;padding:30px 60px;">
		<form id="ff" name="myform" action="${pageContext.request.contextPath}/pt_save.action" class="easyui-form" method="post" data-options="novalidate:true">

			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="yhm" style="width:40%" data-options="label:'用户名',required:true">						
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="yhsj" style="width:40%" data-options="label:'用户手机号',required:true">					
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="yhxm" style="width:40%" data-options="label:'用户姓名',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="yhmm" style="width:40%" data-options="label:'用户密码',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="yhyx" style="width:40%" data-options="label:'Email:',required:true,validType:'email'">
			    &nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-textbox" name="gsmc" style="width:40%" data-options="label:'公司名称',required:true">
			</div>
			
			<div style="margin-bottom:20px">
				<span class="tou">帐号角色</span>
				<select  class="mycombox" name="jsbh" style="width:19%">
					<c:forEach items="${listjs}" var="item" begin="0" step="1" varStatus="status">
						<option value="${item.id}">${item.jsmc}</option>
					</c:forEach>
				</select>
			</div>
			
			<div style="margin-bottom:20px"   id="area_address1">
				<span class="tou">用户地址</span>
				<select  class="mycombox" name="province" style="width:19%">
				</select>
				<select  class="mycombox" name="city" style="width:19%">
				</select>
				<select  class="mycombox" name="area" style="width:19%">
				</select>
			</div>
		    <div style="margin-bottom:20px">
				<input class="easyui-textbox" name="xxdz" value="${wtr.xxdz}" style="width:91%;height:60px" data-options="label:'详细地址:',multiline:true">
			</div>
        <input type="hidden" name="yhlx" value="7"/><!-- 承运商（车队分） -->
        <input type="hidden" name="gssf" id="szsf"/>
        <input type="hidden" name="gscs" id="szcs"/>
        <input type="hidden" name="gsx" id="szx"/>
        
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
    var szsf;
    var szcs;
    var szx;
	$('#area_address1').citys({
	        required:false,
	        nodata:'disabled',
	        onChange:function(data){
	        	szsf = data['province'];
	        	szcs = data['city'];
	        	szx = data['area'];
				$("#szsf").val(szsf);
				$("#szcs").val(szcs);
				$("#szx").val(szx);
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