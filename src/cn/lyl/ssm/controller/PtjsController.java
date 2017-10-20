package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Ptjs;
import cn.lyl.ssm.service.impl.PtjsServc;

@Controller
public class PtjsController extends BasicController<PtjsServc> {
	
	private List<Ptjs> listjs = new ArrayList<Ptjs>();
	
	@RequestMapping("ptjs_save")
	public void save(Ptjs ptjs) {
		servc.save(ptjs);
	}
	
	@RequestMapping("ptjs_findAll")
	public String findAll(Model model) {
		listjs = servc.findAll("");
		model.addAttribute("listjs",listjs);
		return "pt_jsgl";
	}
	
	@RequestMapping("ptjs_tjzh")
	public String tjzh(Model model) {
		listjs = servc.findAll("");
		model.addAttribute("listjs",listjs);
		return "pt_tjzh";
	}
}
