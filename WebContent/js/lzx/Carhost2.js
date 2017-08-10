$(function () {
    $("#area_address").css("margin-top","0px");
    var ok1=false;
    var ok2=false;
    var ok3=false;
    var ok4=false;
    var ok5=false;
    var ok7=false;
    var ok8=true;
// 验证用户名
    $("#user").focus(function () {
        $("#user_prompt").show();
        $("#true1").hide();
    }).blur(function () {
        var user = $("#user").val();
        var reg = /^[\w_]{4,18}$/;
        if (reg.test(user) == false) {
            $("#user_prompt").show();
            $("#true1").hide();
            $("#false1").show();
            return false;
        } else {
            $("#user_prompt").hide();
            $("#false1").hide();
            $("#true1").show();
            ok1=true;
        }
    });
// 验证登录密码
    $("#pwd").focus(function () {
        $("#pwd_prompt").show();
        $("#true2").hide();
    }).blur(function () {
        var pwd = $("#pwd").val();
        var reg = /^[a-zA-Z0-9]{6,16}$/;
        if (reg.test(pwd) == false) {
            $("#pwd_prompt").show();
            $("#true2").hide();
            $("#false2").show();
            return false;
        } else {
            $("#pwd_prompt").hide();
            $("#false2").hide();
            $("#true2").show();
            ok2=true;
        }
    });
    //验证确认密码
    $("#repwd").focus(function(){
        $("#repwd_prompt").show();
        $("#true3").hide();
    }).blur(function(){
        var $pwd = $("#pwd"); //输入密码
        var $repwd = $("#repwd");  //再次输入密码
        $("#repwd_prompt").hide();
        if ($pwd.val() != "") {
            if ($pwd.val() != $repwd.val()) {
                $("#repwd_prompt").show();
                $("#false3").show();
                $("#true3").hide();
                return false;
            }else{
                $("#repwd_prompt").hide();
                $("#false3").hide();
                $("#true3").show();
                ok3=true;
            }
        }
    });
// 验证注册人姓名
    $("#name").focus(function () {
        $("#name_prompt").show();
        $("#true4").hide();
    }).blur(function () {
        var name = $("#name").val();
        var reg = /^[\u4e00-\u9fa5]{2,15}$/;
        if (reg.test(name) == false) {
            $("#name_prompt").show();
            $("#true4").hide();
            $("#false4").show();
            return false;
        } else {
            $("#name_prompt").hide();
            $("#false4").hide();
            $("#true4").show();
            ok4=true;
        }
    });
    // 验证注册人手机
    $("#phone").focus(function () {
        $("#phone_prompt").show();
        $("#true5").hide();
    }).blur(function () {
        var phone = $("#phone").val();
        var reg = /^1(3|4|5|7|8)\d{9}$/;
        if (reg.test(phone) == false) {
            $("#phone_prompt").show();
            $("#true5").hide();
            $("#false5").show();
            return false;
        } else {
            $("#phone_prompt").hide();
            $("#false5").hide();
            $("#true5").show();
            ok5=true;
        }
    });
    // 验证公司名称
    /*// 总部所在地
     $("#area").focus(function () {
     $("#area_prompt").show();
     $("#area_prompt").css("margin-left","35px");
     $("#true7").hide();
     }).blur(function () {
     var company = $("#area").val();
     if (company=="") {
     $("#area_prompt").hide();
     $("#area_prompt").css("margin-left","10px");
     $("#true7").hide();
     $("#false7").hide();
     return false;
     } else {
     $("#area_prompt").hide();
     $("#false7").hide();
     $("#true7").show();
     ok7=true;
     }
     });*/
    // 邀请码
    $("#invite").focus(function () {
        $("#invite_prompt").show();
        $("#invite_prompt").css("margin-left","35px");
        $("#true8").hide();
    }).blur(function () {
        $("#invite_prompt").hide();
        $("#false8").hide();
        $("#true8").hide();
    });
    // 验证码
    $("#yan").focus(function () {
        $("#yan_prompt").show();
        $("#yan_prompt").css("margin-left","35px");
        $("#true9").hide();
    }).blur(function () {
        $("#yan_prompt").hide();
        $("#false9").hide();
        $("#true9").hide();
    });
    $("select[name=province]").click(function () {
        $("#area_prompt").hide();
        $("#false7").hide();
        $("#true7").hide();
    });
    //提交按钮,所有验证通过方可提交
    $('.submit').click(function(){
        var place = document.getElementById("place").innerHTML;
        /*var province=$('select[name="province"] option').val();
         var city=$('select[name="city"] option').val();*/
        var user = $("#user").val();
        var pwd = $("#pwd").val();
        var repwd = $("#repwd").val();
        var name = $("#name").val();
        var phone = $("#phone").val();
        var company = $("#company").val();
        var yan = $("#yan").val();
        if(user==""){
            $("#user_prompt").show();
            $("#true1").hide();
            $("#false1").show();
            ok1=false;
        }else if(pwd==""){
            $("#pwd_prompt").show();
            $("#true2").hide();
            $("#false2").show();
            ok2=false;
        }else if(repwd==""){
            $("#repwd_prompt").show();
            $("#true3").hide();
            $("#false3").show();
            ok3=false;
        }else if(name==""){
            $("#name_prompt").show();
            $("#true4").hide();
            $("#false4").show();
            ok4=false;
        }else if(phone==""){
            $("#phone_prompt").show();
            $("#true5").hide();
            $("#false5").show();
            ok5=false;
        }
        else if(yan==""){
            $("#yan_prompt").show();
            $("#true9").hide();
            $("#false9").show();
            ok8=false;
        }
        if(place=="请选择公司所在地") {
            $("#area_prompt").show();
            $("#false7").show();
            $("#true7").hide();
            ok7 = false;
        }else if(place.length<15) {
            $("#area_prompt").show();
            $("#false7").show();
            $("#true7").hide();
            ok7 = false;
        }else{
            $("#area_prompt").hide();
            $("#false7").hide();
            $("#true7").show();
            ok7 = true;
        }
        if(ok1 && ok2 && ok3 && ok4 && ok5 && ok7 && ok8){
            $('myform').submit();
        }else{
            alert("请填写好资料再提交！");
            return false;
        }
    });
});