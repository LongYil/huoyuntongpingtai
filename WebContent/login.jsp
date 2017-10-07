<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" href="css/zym/login.css"/>
</head>
<body>
<div class="hopemodelpage">
    <header>
        <div class="header_left">
            <a href="index.html"><img class="huoyun_logo" src="images/zym/huoyun_logo.png"></a>
            <span id="login_title">登录</span>
        </div>
        <div class="header_right">
            <a href="#">客服中心</a>
            |
            <a href="#"> 使用帮助</a>
        </div>
    </header>
</div>

    <div class="container">
        <div class="hopemodelpage">
             <div class="container_left">
                <div class="container_text">
                    货运通物流平台
                    <br/><br/>
                    专业的一站式物流服务
                </div>
                <img class="people" src="images/zym/people.jpg"/>
            </div>
             <div class="container_right">
                <div class="login_list01">
                    <div class="login_box">会员登录</div>
                    <div class="extra_r fr"><a href="${pageContext.request.contextPath}/jbyh_preregister.action" target="_blank">免费注册</a></div>
                </div>
                <div class="text_uid cl">
                    <form method="POST" name="frm1" action="${pageContext.request.contextPath}/jbyh_login.action" onsubmit="return checkform(this)">
                        <ul class="login_namewar">
                            <li>
                                <label class="login_name"></label>
                                <input name="yhsj" id="txtUid" class="login_text" placeholder="请输入您的手机号" autocomplete="off" type="text">
                            </li>
                            <li>
                                <label class="login_pwd"></label>
                                <input name="yhmm" id="txtPwd" class="login_text2" type="password" placeholder="请输入您的密码">
                            </li>
<!--                             <li style="overflow: hidden;"> -->
<!--                                 <input name="txtCode" id="txtCode"  class="login_text3 fl" placeholder="请输入验证码" type="text"> -->
<!--                                 <div class="login_text4 fl"> -->
<!--                                     <img class="code" id="checkCode" style="float: left;" onclick="createCode()"> -->
<!--                                     <a style="cursor:pointer;" onclick="createCode()">换一张</a> -->
<!--                                 </div> -->
<!--                             </li> -->
                        </ul>
                        <div class="rem_password">
                            <div class="fl remember">
                                <input name="cbIsRemberPwd" id="cbIsRemberPwd" class="jzmm fl" checked="checked" type="checkbox">
                                <label class="fl" for="cbIsRemberPwd">记住密码</label>
                            </div>
                            <div class="fr rememr">
                                <a href="#" target="_blank">忘记密码?</a>
                            </div>
                        </div>
                        <div class="login_btn">
                            <input name="btnLogin" value="登   录" id="btnLogin" class="btnnew" type="submit" onclick="fn()" >
                        </div>
                    </form>
                    <div class="service fr"><a>服务热线：400-010-5656</a></div>
                </div>
            </div>
        </div>
    </div>
<div class="hopemodelpage">
    <footer>
        <div class="foot_login">
            <a href="#" target="_blank">关于我们</a> |
            <a href="#" target="_blank">挑错有礼</a> |
            <a href="#" target="_blank">诚聘英才</a> |
            <a href="#" target="_blank">服务与产品</a> |
            <a href="#" target="_blank">使用与帮助</a> |
            <a href="#" target="_blank">服务条款</a> |
            <a href="#" target="_blank">加盟我们</a> |
            <a href="#" target="_blank">付款方式</a> |
            <a href="#" target="_blank">友情链接</a> |
            <a href="#" target="_blank">客服中心</a> |
            <a href="#" target="_blank">联系我们</a>
            <br>
            <div class="foot_login3">
                <span>货运通物流平台版权所有 © 2017-2019 客服免费电话:400-010-5656   备案：粤ICP备17120651号</span>
            </div>
        </div>
    </footer>
</div>
</body>
<script src="js/zym/jquery-1.8.3.js" type="text/javascript"></script>
<script type="text/javascript">
    //表单不为空认证
    function checkform(frm){
        var flag=true;
        if(frm.txtUid.value=="")
        {
            alert("姓名不能为空");
            frm.txtUid.focus();
            flag=false;
        }else{
            if(frm.txtPwd.value=="") {
                alert("密码不能为空");
                flag = false;
            }
        }
//         if(frm.txtCode.value=="") {
//                 alert("验证码不能为空");
//                 flag = false;
//             }
//         validateCode();
        return flag;
    }
    //判断验证码是否正确，若错误则给出提示
    function validateCode()
    {
        var txtCode = document.getElementById("txtCode").value;
        if (txtCode.toUpperCase() != code.toUpperCase())
        {
            alert("验证码输入有误！");
            createCode();
        }
    }
    //换验证码
    var code;
    function createCode() {
        code = "";
        var codeLength = 6; //验证码的长度
        var checkCode = document.getElementById("checkCode");
        var codeChars = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                'a','b','c','d','e','f','g','h','i','j','k','l',
                'm','n','o','p','q','r','s','t','u','v','w','x','y','z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
        //所有候选组成验证码的字符，当然也可以用中文的
        for (var i = 0; i < codeLength; i++)
        {
            var charNum = Math.floor(Math.random() * 52);
            code += codeChars[charNum];
        }
        if (checkCode)
        {
            checkCode.className = "code";
            checkCode.innerHTML = code;
        }
    }
    //记住密码
    var user = document.getElementsByTagName("txtUid"),
            pass = document.getElementsByTagName("txtPwd"),
            check = document.getElementsByTagName("cbIsRemberPwd"),
            loUser = localStorage.getItem("user") || "";
    loPass = localStorage.getItem("pass") || "";
    user.value = loUser;
    pass.value = loPass;
    if(loUser !== "" && loPass !== ""){
        check.setAttribute("checked","");
    }
    function fn(){
        if(check.checked){
            localStorage.setItem("user",user.value);
            localStorage.setItem("pass",pass.value);
        }else{
            localStorage.setItem("user","");
            localStorage.setItem("pass","");
        }
    }
</script>
</html>