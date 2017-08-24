package cn.lyl.ssm.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.service.impl.BzjServc;

@Controller
public class BzjController extends BasicController<BzjServc> {
	
	@RequestMapping("/bzj_checkAndSave")
	public void checkAndSave(String info,PrintWriter arg,HttpServletRequest request) throws Exception{
		boolean result = servc.checkAndSave(info,request.getSession().getAttribute("yhbh").toString());
		arg.write(String.valueOf(result));
	}
}
