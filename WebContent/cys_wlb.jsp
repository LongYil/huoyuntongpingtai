<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>物流币</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<style type="text/css">
        .zhyediv{
            width:650px;
            height:300px;
            font-size:14px;
            border: solid 1px #ddd;
			margin:0 auto;
        }
        .zhyediv_header{
            width:640px;
            height:24px;
            line-height:24px;
            background: #f6f6f6;
            padding:5px 0px 5px 10px;
            font-weight:bold;
            border-bottom: solid 1px #ddd;
            color: #666;

        }
        .zhyediv_content{
            width:580px;
            height:220px;
            margin-left:10px;
            margin-top:20px;
        }
        .zhyediv_content_header{
            height:40px;
            line-height:40px;
        }
        .zhyediv_content_header input{
            float:right;
            background-color:#fa6400;;
            border:none;
            border-radius: 2px;
            width:100px;
            height:30px;
            margin:5px 0 5px 0;
            color: #FFF;
            cursor: pointer;
        }
        .ye{
            color:red;
            font-weight:bold;
        }
        .record{
            color:blue;
            font-size:12px;
            text-decoration: none;
        }
        .record:hover{
            color:red;
            text-decoration: underline;
        }
        .left_txt{
            float:left;
            margin-top:60px;
        }
        .right_table{
            float:right;
        }
        .right_table table{
            width:500px;
            border-spacing: 0;
            border-right: 1px solid #c5d3d3;
            border-bottom: 1px solid #c5d3d3;
            background: #fff;

        }
        table tr td{
            padding: 12px 35px;
        }
        .table_first{
            background-color: #e5edf2;
            vertical-align: baseline;
        }
        .tip{
            color:red;
            font-size:12px;
        }
        table tr {
            border: solid 1px #ddd;
        }
        td{
            border-top: 1px solid #c5d3d3;
            border-left: 1px solid #c5d3d3;
        }
    </style>
</head>
<body style="padding-top:0px; padding-bottom:0px;">

<section style="width:500px;height:40px;margin-top:20px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="chongzhi()">充值物流币</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="tixian()">申请提现</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="chongzhijilu()">充值记录</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="tixianjilu()">提现记录</a>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:830px;height:570px;margin-left:-20px;margin-bottom:0px;">
		<div title="物流币">
		<div class="zhyediv" >
        <div class="zhyediv_header">
            	物流币
        </div>
        <div class="zhyediv_content">
            <div class="zhyediv_content_header">
                <span class="zhye">当前账户余额:</span>
                <span class="ye" id="sum_01" >${ptzh.zhye}</span>
                <span class="dw">物流币</span>
                <a class="record" href="javascript:void(0)" onclick="tixianjilu()">提现记录</a>
                |
                <a class="record" href="javascript:void(0)" onClick="chongzhijilu()">充值记录</a>
                <input type="button" value="立即充值" onClick="chongzhi()"/>
            </div>
            <div class="zhyediv_content_content">
                <div class="left_txt">
                   	 关联账户：
                </div>
                <div class="right_table">
                         <table>
                                    <thead>
                                    <tr class="table_first">
                                        <td >账户名</td>
                                        <td >可用余额</th>
                                        <td >购买物流币/赠送物流币</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td rowspan="2">${jbyh.yhm}</td>
                                        <td rowspan="2"><span id="sum" >${ptzh.zhye}</span></td>
                                        <td >购买：<span id="buy">0</span>物流币</td>
                                    </tr>
                                    <tr>
                                        <td>赠送：<span id="give">2000</span>物流币</td>
                                    </tr>
                                    </tbody>
                                </table>
                         <div class="tip">备注:可用余额=购买物流币+赠送物流币</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
	
	</div>
	</div>

	<script type="text/javascript">
		var index = 0;
		function chongzhi(){
			index++;
			$('#tt').tabs('add',{
				title: '充值物流币',
				content: '<iframe src="yhzh_czwlb.action" frameborder="0" style="padding:5px;width:815px;height:400px;"></iframe>',
				closable: true
			});
		}
		function chongzhijilu(){
			index++;
			$('#tt').tabs('add',{
				title: '充值记录',
				content: '<iframe src="jyjl_FindCzjl.action" frameborder="0" style="width:820px;height:530px;"></iframe>',
				closable: true
			});
		}
			
		function tixian(){
			index++;
			$('#tt').tabs('add',{
				title: '申请提现',
				content: '<iframe src="ptzh_fqtx.action" frameborder="0" style="width:820px;height:400px;"></iframe>',
				closable: true
			});
		}
		
		function tixianjilu(){
			index++;
			$('#tt').tabs('add',{
				title: '提现记录',
				content: '<iframe src="jyjl_FindTxjl.action" frameborder="0" style="width:820px;height:530px;"></iframe>',
				closable: true
			});
		}

	</script>
</body>
</html>