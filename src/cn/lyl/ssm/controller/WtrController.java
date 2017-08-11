package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Wtr;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.WtrServc;

@Controller
public class WtrController extends BasicController<WtrServc> {
	
	@Autowired
	private JbyhServc jbyhServc;
	
	@RequestMapping("/wtr_save")
	public String save(Jbyh jbyh,Wtr wtr){
		jbyhServc.save(jbyh);
		wtr.setYhbh(jbyh.getYhbh());
		servc.save(wtr);
		return "wtr_index";
	}
}
