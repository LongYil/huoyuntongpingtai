<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>添加联系人</title>
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
	</style>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="添加联系人">
		<form id="ff" action="${pageContext.request.contextPath}/lxr_save.action" class="easyui-form" method="post" data-options="novalidate:true">
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="lxrxm" style="width:40%" data-options="label:'姓名',required:true">	
			</div>
			
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="lxrdh" style="width:40%" data-options="label:'电话',required:true">	
			</div>
			
			<div style="margin-bottom:20px"   id="area_address">
				<span class="tou" style="margin-right:56px;">地址</span>
				<select  class="mycombox" name="province" style="width:19%">
				</select>
				<select  class="mycombox" name="city" style="width:19%">
				</select>	
				<select  class="mycombox" name="area" style="width:19%">
				</select>						
			</div>

		<input type="hidden" name="info" id="ddsf"/>
        <input type="hidden" name="info" id="ddcs"/>
        <input type="hidden" name="info" id="ddx"/>
        
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
	var ddsf;
	var ddcs;
	var ddx;
	
	$('#area_address').citys({
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