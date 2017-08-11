package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Hydld;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.service.impl.HydldServc;
import cn.lyl.ssm.service.impl.HyglyServc;
import cn.lyl.ssm.service.impl.JbyhServc;

@Controller
public class HyglyController extends BasicController<HyglyServc> {
	@Autowired
	private HydldServc hydldServc;
	@Autowired
	private JbyhServc jbyhServc;
	
	@RequestMapping("/hy_save")
	public String save(Jbyh jbyh,Hydld hydld,Hygly hygly){
		jbyhServc.save(jbyh);
		hydld.setYhbh(jbyh.getYhbh());
		hygly.setYhbh(jbyh.getYhbh());
		servc.save(hygly);
		hydldServc.save(hydld);		
		
		return "hy_index";
	}
}
