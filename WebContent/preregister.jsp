<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>欢迎注册货运通物流平台会员</title>
<script src="js/basic/jquery.min.js" type="text/javascript"></script>
<script src="js/basic/jscarousel.js" type="text/javascript"></script>
<script src="js/cy/register.js" type="text/javascript"></script>
<link href="css/cy/register.css" type="text/css" rel="stylesheet" />
</head>

<body>
<div id="top">
<img src="images/cy/logo.png"></div>
<div id="xuanxiangka">
   <div id="kind">①选择会员类型</div>
   <div id="information">②填写账户信息</div>
   <div id="tip">* 表示必填项！</div>
</div>
<div id="biaoge">
<table cellspacing="0" >
   <tbody>
      <tr>
        <td   colspan="4" align="left">
        尊敬的用户，欢迎您注册货运通物流平台会员。首先，
        <font class="red" >请选择适合的会员类型注册</font>
        <hr>
        </td>
      </tr>
      
      <tr>
        <td  colspan="4" height="5" align="left"></td>
      </tr>
      <tr class="light">
        <td>
          <strong>
            <input id="wuliu" value="1" type="radio" name="leixing">
          </strong>
        </td>	
        <td class="bigger">运输车队</td>
        <td>提供物流运输服务且具备营运资格的车队。<br>可免费发布车辆信息，线路信息，免费查询货源信息。</font></td>
      </tr>
      <tr>
        <td class="" colspan="4" height="15"></td>
      </tr>
      <tr class="light">
        <td>
          <strong>
            <input id="chezhu" value="2" type="radio" name="leixing">
          </strong>
        </td>
        <td class="bigger">车主</td>
        <td>提供物流运输服务且具备营运资格的个体车主。<br>可免费发布车辆信息，线路信息，免费查询货源信息。</td>
      </tr>
      <tr>
        <td class="" colspan="4" height="15"></td>
      </tr>
      <tr class="light">
        <td>
          <strong>
            <input id="huoyun" value="3" type="radio" name="leixing">
          </strong>
        </td>
        <td class="bigger">货运代理点</td>
        <td>专为发货企业、运输车辆提供物流配货，找车服务的单位或个体。<br>可免费发布运输线路信息和货源信息，免费查询车源货源信息。</td>
      </tr>
      <tr>
        <td class="" colspan="4" height="15"></td>
      </tr>
      <tr class="light">
        <td>
          <strong>
            <input id="huoyun" value="4" type="radio" name="leixing">
          </strong>
        </td>
        <td class="bigger">发货企业或个人</td>
        <td>需要发货的企业或个人。<br>可免费发布国内外货物运输信息，免费查询运输车辆及物流公司信息。</td>
      </tr>
      <tr>
        <td class="" colspan="4" height="15"></td>
      </tr>      
   </tbody>
</table>
</div>
<br><br>
<div class="bt_next">
   <input id="bt_next"  type="button" onClick="xiayibu()">
</div>
<br><br><br>
<div id="foot">
<a>关于我们</a> | <a>挑错有礼</a> | <a>诚聘英才</a> | <a>服务与产品</a> | <a>使用与帮助</a> | <a>服务条款</a> | <a>加盟我们</a> | <a>付款方式</a> | <a>友情链接</a> | <a>客服中心</a> | <a>联系我们</a>
<p>货运通物流平台版权所有 © 2016-2017 客服免费电话:400-010-5656 许可证号 粤ICP备08010544号</p>
</div>
</body>
<script type="text/javascript">
	
	
	function xiayibu(){
		var type = $("input[name='leixing']:checked").val();
		switch(type){
		case "1":
			window.location="cys_cdregist.jsp";
			break;
		case "2":
			window.location="cys_grregist.jsp";
			break;
		case "3":
			window.location="hy_regist.jsp";
			break;
		case "4":
			window.location="wtr_regist.jsp";
			break;
		default:
				;
		}
	}
	
</script>
</html>