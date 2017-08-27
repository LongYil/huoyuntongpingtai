<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 个人承运商主界面 -->
<!DOCTYPE html>
<html>
<head>
    <title>欢迎注册货运通平台会员</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/lzx/Carhost.css">
    <link rel="stylesheet" href="css/lzx/all.css">
    <script type="text/javascript" src="js/lzx/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="js/lzx/area.js"></script>
</head>
<body>
<div class="top">
    <img src="images/lzx/货运通logo.png" alt="logo" width="180" class="logo">
    <img src="images/lzx/xian.gif" alt="xian" class="xian" height="80">
    <span class="zhu">会员注册</span>
    <div class="nav">
        <a href="#">返回主页</a>|
        <a href="#">帮助中心</a>
    </div>
    <div class="help">
        如注册遇到问题，请拨打客服热线：
        <img src="images/lzx/icon_phone.gif" width="19" height="13"/>
        <span style="color: #f60">400-000-1111</span>
    </div>
</div>
<div class="main">
    <div class="sel">
        <a href="#"><span style="font-size: 14px; color: Black">① 选择会员类型</span></a>
    </div>
    <div class="active">
        <a href="#"><span>② 填写帐户信息</span></a>
    </div>
    <span class="need">
       <span class="need1">*</span>
        <span class="need2">表示必填项!</span>
    </span>
    <div class="info">
        <div class="info-top">
        <img src="images/lzx/icon1.gif" alt="灯泡">
            <span class="info-top1">
                感谢您注册<span class="imp1">&nbsp;承运商（个人）</span>， 请您准确填写注册信息。如需改变注册会员类型，请点击<a href="#" class="imp2">上一步</a>选择会员类型！
            </span>
            <span class="info-top2">
                <p><span class="imp1"> &nbsp;&nbsp;&nbsp;* </span>您可以用“会员登录名”使用
                    <a href="#" class="lian">货运通网</a>、
                    <a href="#" class="lian">货运通配货软件</a>、
                    <a href="#" class="lian">手机配货网</a>、
                    <a href="#" class="lian">手机配货软件</a>、
                    <a href="#" class="lian">北斗GPS定位监控系统</a>
                    以及其他物通服务。
                </p>
            <p><span class="imp1">&nbsp;&nbsp;&nbsp;* </span>若您长时间收取不到验证信息，请拨打客服电话400-000-1111协助完成身份验证。</p>
            <p><span class="imp1">&nbsp;&nbsp;&nbsp;* </span> 提醒：物流公司必须提供真实网点信息和具有物流公司的相关资质。</p>
            </span>
            <p class="yours"><img src="images/lzx/icon2.gif" alt="箭头">&nbsp;&nbsp;填写您的帐户信息</p>
        </div>
        <form action="${pageContext.request.contextPath}/cysgly_save.action" method="post" name="myform">
        <div class="write">
            <span class="write-1">会员登录名：</span> <span class="write-2">*</span>
            <div class="write-3"><input id="user" type="text" name="yhm" class="in" onblur="checkUser()" style="height: 26px;width: 200px"/></div>
            <img src="images/lzx/false.png" height="15" style="margin-top: 5px;" class="false" id="false1">
            <img src="images/lzx/true.gif" class="true" id="true1"/>
            <div id="user_prompt" class="prompt">
                <span class="prompt1"></span>
                <p>•&nbsp;&nbsp;由4-18个字母或数字组成（不区分大小写)</p>
                <p>•&nbsp;&nbsp;不能用中文，注册成功后不可修改</p>
            </div>
        </div>
        <div class="write" style="margin-top: 0px">
            <span class="write-1">输入登录密码：</span> <span class="write-2">*</span>
            <div class="write-3"><input id="pwd" type="password" name="yhmm" class="in" onblur="checkPwd()" style="height: 26px;width: 200px"/></div>
            <img src="images/lzx/false.png" height="15" style="margin-top: 5px;" class="false" id="false2">
            <img src="images/lzx/true.gif"  class="true" id="true2"/>
            <div id="pwd_prompt" class="prompt">
                <span class="prompt2"></span>
                <p>•&nbsp;&nbsp;密码长度6～16个字符，字母区分大小写</p>
            </div>
        </div>
        <div class="write" style="margin-top: 0px">
            <span class="write-1">确认登录密码：</span> <span class="write-2">*</span>
            <div class="write-3"><input id="repwd" type="password" class="in" onblur="checkRepwd()" style="height: 26px;width: 200px"/></div>
            <img src="images/lzx/false.png" height="15" style="margin-top: 5px;" class="false" id="false3">
            <img src="images/lzx/true.gif"  class="true" id="true3"/>
            <div id="repwd_prompt" class="prompt">
                <span class="prompt3"></span>
                <p>•&nbsp;&nbsp;请重复输入一次相同的登录密码</p>
            </div>
        </div>
        <div class="write" style="margin-top: 0px">
            <span class="write-1">车辆所有人：</span> <span class="write-2">*</span>
            <div class="write-3"><input id="name" type="text" name="yhxm" class="in" onblur="checkName()" style="height: 26px;width: 200px"/></div>
            <img src="images/lzx/false.png" height="15" style="margin-top: 5px;" class="false" id="false4">
            <img src="images/lzx/true.gif"  class="true" id="true4"/>
            <div id="name_prompt" class="prompt" style="margin-top: 2px">
                <span class="prompt2"></span>
                <p>•&nbsp;&nbsp;请填写您真实中文姓名</p>
            </div>
        </div>
        <div class="write" style="margin-top: 0px">
            <span class="write-1">注册人手机：</span> <span class="write-2">*</span>
            <div class="write-3"><input id="phone" type="text" name="yhsj" class="in" onblur="checkPhone()" style="height: 26px;width: 200px"/></div>
            <img src="images/lzx/false.png" height="15" style="margin-top: 5px;" class="false" id="false5">
            <img src="images/lzx/true.gif"  class="true" id="true5"/>
            <div id="phone_prompt" class="prompt" style="margin-top: 2px">
                <span class="prompt2"></span>
                <p>•&nbsp;&nbsp;请填写正确的电话号码</p>
            </div>
        </div>
        <input type="hidden" name="yhlx" value="3"/><!-- 个人车主承运商 -->
        <input type="hidden" name="szsf" id="szsf"/>
        <input type="hidden" name="szcs" id="szcs"/>
        <input type="hidden" name="szx" id="szx"/>
        <div class="write"  id="area_address">
            <span class="write-1">车辆所在地：</span> <span class="write-2">*</span>
            <!--<input id="area" type="text" class="in" onblur="checkArea()" style="height: 26px;width: 200px"/>-->
            <div class="write-4"><select name="province" style="margin-left: 10px;height: 30px;float: left"></select>
            <select name="city" style="height: 30px;float: left"></select>
            <select name="area" style="height: 30px;float: left"></select>
            </div>
            <span id="place" style="float: left;margin-top: 5px;margin-left: 10px">请选择车辆所在地</span>
            <script type="text/javascript">
            var szsf;
            var szcs;
            var szx;
                $('#area_address').citys({
                    required:false,
                    nodata:'disabled',
                    onChange:function(data){
                        var text = data['direct']?'(直辖市)':'';
                        $('#place').text('当前选中地区：'+data['province']+text+' '+data['city']+' '+data['area']);
                        $('#pla').val('当前选中地区：'+data['province']+text+' '+data['city']+' '+data['area']);
                        szsf = data['province'];
                        szcs = data['city'];
                        szx = data['area'];
						$("#szsf").val(szsf);
						$("#szcs").val(szcs);
						$("#szx").val(szx);
                    }
                });
            </script>
            <script type="text/javascript" src="js/lzx/Carhost2.js"></script>
            <img src="images/lzx/false.png" height="15" style="margin-top: 5px;" class="false" id="false7">
            <img src="images/lzx/true.gif"  class="true" id="true7"/>
            <div id="area_prompt" class="prompt" style="margin-top: 2px;width: 150px">
                <span class="prompt3"></span>
                <p>•&nbsp;&nbsp;请点击选择车辆所在地</p>
            </div>
        </div>
        <div class="write" style="margin-top: 0px">
            <span class="write-1">邀请码:&nbsp;</span> <span class="write-2">&nbsp; </span>
            <div class="write-3"><input id="invite" type="text" class="in" onblur="checkArea()" style="height: 26px;width: 200px;margin-left: 10px"/></div>
            <img src="images/lzx/false.png" height="15" style="margin-top: 5px;" class="false" id="false8">
            <img src="images/lzx/true.gif"  class="true" id="true8"/>
            <div id="invite_prompt" class="prompt" style="margin-top: 2px">
                <span class="prompt3"></span>
                <p>•&nbsp;&nbsp;如没有邀请码，此栏可以不填。</p>
            </div>
        </div>
        <div class="write" style="margin-top: 0px">
            <span class="write-1">手机验证码：</span> <span class="write-2">*</span>
            <div class="write-3"><input id="yan" type="text" class="in" onblur="checkPhone()" style="height: 26px;width: 100px;margin-left: 10px"/><input type="button" value="获取短信验证码" class="message"></div>
            <img src="images/lzx/false.png" height="15" style="margin-top: 5px;" class="false" id="false9">
            <img src="images/lzx/true.gif"  class="true" id="true9"/>
            <div id="yan_prompt" class="prompt" style="margin-top: 2px">
                <span class="prompt3"></span>
                <p>•&nbsp;&nbsp;请准确填写验证码。</p>
            </div>
        </div>
            <input name="submit" type="submit" value="同意条款并注册" class="submit"/>
        </form>
        <div class="info-foot">
                <a href="#">《货运通平台服务协议》</a><a href="#">《网络用户信息保密协议》</a>
            <p>
                <span class="special">特别提醒：</span>您在本网站注册或留言时使用的公司信息、姓名、电话、所在区域或加盟意向等信息，将被推荐给本网站的物信通会员，以便为您提供及时、优质的物流服务和项目。请仔细阅读上述协议。
            </p>
        </div>
    </div>
</div>
<div class="footer">
    <div class="footer-1">
    <a href="#">关于我们</a> |
    <a href="#" class="active">挑错有礼</a> |
    <a href="#">诚聘英才</a> |
    <a href="#">服务与产品</a> |
    <a href="#">使用与帮助</a> |
    <a href="#">服务条款</a> |
    <a href="#">加盟我们</a> |
    <a href="#">付款方式</a> |
    <a href="#">友情链接</a> |
    <a href="#">客服中心</a> |
    <a href="#">联系我们</a>
    </div>
    <div class="footer-2">
        <p>货运通平台版权所有 © 2017-2030 客服免费电话:400-000-1111 许可证号 京ICP备00000111号</p>
    </div>
</div>
</body>
</html>