package cn.lyl.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Ptyyf;
import cn.lyl.ssm.service.impl.PtyyfServc;

@RequestMapping("/ptyyf")
public class PtyyfController extends BasicController<PtyyfServc> {
	
	@RequestMapping("/save")
	public void save(){
		Ptyyf p = new Ptyyf();
		p.setYhbh(666);
		servc.save(p);
	}
}
