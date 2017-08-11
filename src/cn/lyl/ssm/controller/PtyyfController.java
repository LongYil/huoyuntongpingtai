package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptgly;
import cn.lyl.ssm.po.Ptyyf;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtglyServc;
import cn.lyl.ssm.service.impl.PtyyfServc;

@Controller
@RequestMapping("/ptyyf")
public class PtyyfController extends BasicController<PtyyfServc> {
	@Autowired
	Ptgly ptgly;
	@Autowired
	private PtglyServc ptglyServc;
	@Autowired
	private JbyhServc jbyhServc;
	
	@RequestMapping("/save")
	public String save(Jbyh jbyh,Ptyyf ptyyf){
		
		ptyyf.setYhbh(jbyh.getYhbh());
		ptgly.setGlybh(jbyh.getYhbh());
		ptgly.setGlylx("超级管理员");
		
		jbyhServc.save(jbyh);
		servc.save(ptyyf);
		ptglyServc.save(ptgly);
		return "success";
	}
}
