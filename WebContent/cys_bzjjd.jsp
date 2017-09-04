<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>解冻保证金</title>
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
	.maxnum{
		font-size:16px;
		color:red;
	}
	</style>
</head>
<body style="padding:0px;margin:0px;">

	<div class="easyui-panel" style="width:100%;max-width:840px;max-height:600px;padding:30px 60px;" title="解冻保证金">
		<form id="ff" name="myform" class="easyui-form" method="post" data-options="novalidate:true">
			
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="zhjg" id="jine" style="width:40%;margin-left:100px;" data-options="label:'解冻金额：',required:true">&nbsp;&nbsp;(单位：物流币)
				最大解冻金额为:&nbsp;<span class="maxnum">${bzj.ksqje}</span>&nbsp;物流币				
			</div>
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	<script>
		function submitForm(){
			shenqing();
		}
		
		function clearForm(){
			$('#ff').form('clear');
		}
		
		function shenqing(){
			var num = $("#jine").val();
			tijiao(num);
		}
		
		var rqt = null;
		function tijiao(arg0){
		if(window.XMLHttpRequest){//非IE浏览器
			rqt = new XMLHttpRequest();
		}else if(window.ActiveXObject){
			try{
				rqt = new ActiveXObject("Msxml2.XMLHTTP");
			}catch(e){
				try{
					rqt = new ActiveXObject("Microsoft.XMLHTTP");
				}catch(e){		
				}
			}
		}
		rqt.onreadystatechange = getresult;
		rqt.open("POST","bzj_cysFqjd.action?info="+encodeURI(encodeURI(arg0)),false);
		rqt.send("");
	   };
		
	   function getresult(){
		   if(rqt.readyState == 4){
			   if(rqt.status == 200){
				   var temp = rqt.responseText;
				   if(temp=="true"){
						$.messager.alert('提示','保证金解冻申请已成功发起，我们将尽快对您的申请进行处理，请耐心等待。');
				   }else{
					   $.messager.alert('提示','解冻金额不得大于已缴纳保证金!','warning'); 
				   }
				};
			   }
		}

	</script>
</body>
</html>