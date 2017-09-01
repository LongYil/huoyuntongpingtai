<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>保证金</title>
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

<section style="width:600px;height:40px;margin-top:20px;padding-left:40px;">
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="jiaona()">缴纳保证金</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="jiedong()">申请解冻</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="jilu()">缴纳记录</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="jiedongjilu()">解冻记录</a>
<a href="javascript:void(0)" class="easyui-linkbutton" style="width:80px;margin-right:20px;" onclick="shuaxin()">刷新</a>
</section>

	<div id="tt" class="easyui-tabs" data-options="tools:'#tab-tools'" style="padding:0px;width:835px;height:620px;margin-left:-20px;margin-bottom:0px;">
		<div title="保证金">
		<div class="zhyediv" >
        <div class="zhyediv_header">
            	保证金
        </div>
        <div class="zhyediv_content">
            <div class="zhyediv_content_header">
                <span class="zhye">已缴纳保证金金额:</span>
                <span class="ye" id="sum_01" >${bzj.bzjje}</span>
                <span class="dw">物流币</span>
                <a class="record" href="javascript:void(0)" onclick="jiaonajilu()">缴纳记录</a>
                <input type="button" value="立即缴纳" onClick="jiaona()"/>
            </div>
            
            <div class="zhyediv_content_header">
                <span class="zhye">已申请解冻金额:</span>
                <span class="ye" id="sum_01" >${bzj.ysqje}</span>
                <span class="dw">物流币</span>
                <a class="record" href="javascript:void(0)" onclick="jiedongjilu()">解冻记录</a>
                <input type="button" value="申请解冻" onClick="jiedong()"/>
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
                                        <td >可用余额</td>
                                        <td >购买物流币/赠送物流币</td>
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
		function jiaona(){
			index++;
			$('#tt').tabs('add',{
				title: '缴纳保证金',
				content: '<iframe src="cys_bzjjn.jsp" frameborder="0" style="padding:5px;width:820px;height:500px;"></iframe>',
				closable: true
			});
		}
		function jilu(){
			index++;
			$('#tt').tabs('add',{
				title: '缴纳记录',
				content: '<iframe src="jyjl_FindJnjl.action" frameborder="0" style="width:828px;height:580px;"></iframe>',
				closable: true
			});
		}
			
		function jiedong(){
			index++;
			$('#tt').tabs('add',{
				title: '申请解冻',
				content: '<iframe src="bzj_cysSqjd.action" frameborder="0" style="width:828px;height:580px;"></iframe>',
				closable: true
			});
		}
		
		function jiedongjilu(){
			index++;
			$('#tt').tabs('add',{
				title: '解冻记录',
				content: '<iframe src="jyjl_FindJdjl.action" frameborder="0" style="width:828px;height:580px;"></iframe>',
				closable: true
			});
		}
		
		function shuaxin(){
			window.location="bzj_cysFind.action";
		}

	</script>
</body>
</html>