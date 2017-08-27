<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <title>登录</title>
 </head>
 <body style="margin:0px;">
  <div style="width:260px;height:100px;border-radius:5px;border:#cfd9e7 2px solid;margin:0 auto;margin-top:200px;padding:50px;">
	
	<form action="${pageContext.request.contextPath}/jbyh_login.action"  method="post">
	<table style="text-align:center;">
		<tr>
			<td colspan="2" style="font-size:24px;color:#096883;padding-bottom:14px;">货运通物流平台</td>
		</tr>
		<tr>
			<td>手机号</td><td><input type="text" name="yhsj" style="font-size:16px;"/></td>
		</tr>
		<tr>
			<td>密码</td><td><input type="text" name="yhmm"  style="font-size:16px;"/></td>
		</tr>
		<tr>
			<td>&nbsp;</td><td><input type="submit" value="登录" style="width:70px;height:30px;"/></td>
		</tr>
	</table>
    </form>  
  </div>
 </body>
</html>
