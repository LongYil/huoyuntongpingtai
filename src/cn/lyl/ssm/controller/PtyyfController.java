package cn.lyl.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptyyf;
import cn.lyl.ssm.service.impl.PtyyfServc;

@Controller
@RequestMapping("/ptyyf")
public class PtyyfController extends BasicController<PtyyfServc> {
	
	@RequestMapping("/save")
	public String save(Jbyh jbyh,Ptyyf ptyyf){
		
		servc.save(ptyyf);
		
		System.out.println(ptyyf);
		return "success";
	}
}
