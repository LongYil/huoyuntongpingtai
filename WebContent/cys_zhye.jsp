<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>账户余额</title>
	<link rel="stylesheet" type="text/css" href="js/basic/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/basic/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="js/basic/demo/demo.css">
	<script type="text/javascript" src="js/basic/jquery.min.js"></script>
	<script type="text/javascript" src="js/basic/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/lzx/area.js"></script>
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
<body style="padding:0px;margin:0px;">
<div class="easyui-panel" style="width:100%;height:678px;max-width:830px;max-height:540px;border:0px solid #ffffff;">
    <div class="zhyediv" >
        <div class="zhyediv_header">
            	财务信息
        </div>
        <div class="zhyediv_content">
            <div class="zhyediv_content_header">
                <span class="zhye">可用余额:</span>
                <span class="ye" id="sum_01" >${ptzh.zhye}</span>
                <span class="dw">物流币</span>
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
</body>
</html>