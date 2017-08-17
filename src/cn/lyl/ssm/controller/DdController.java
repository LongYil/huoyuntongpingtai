package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.service.impl.DdServc;

@Controller
public class DdController extends BasicController<DdServc> {
	
	@RequestMapping("dd_save")
	public void save(Dd dd,HttpServletRequest request){
		
		
	}
}
