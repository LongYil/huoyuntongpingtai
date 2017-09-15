package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Hyjs;
import cn.lyl.ssm.service.impl.HyjsServc;

@Controller
public class HyjsController extends BasicController<HyjsServc> {
	
	@Autowired
	private Hygly hygly;
	@Autowired
	private Hyjs hyjs;
	
	private List<Hyjs> listjs = new ArrayList<>();
	@RequestMapping("hyjs_save")
	public void save(Hyjs hyjs,HttpServletRequest request) {
		hygly = (Hygly) request.getSession().getAttribute("hygly");
		hyjs.setYhbh(hygly.getYhbh());
		servc.save(hyjs);
	}
	
	@RequestMapping("hyjs_findAll")
	public String findAll(Model model,HttpServletRequest request) {
		listjs.clear();
		hygly = (Hygly) request.getSession().getAttribute("hygly");
		listjs = servc.findAll(String.valueOf(hygly.getYhbh()));
		model.addAttribute("listjs",listjs);
		return "hy_jsgl";
	}
	@RequestMapping("hyjs_xzjs")
	public String xzjs(Model model,HttpServletRequest request) {
		listjs.clear();
		hygly = (Hygly) request.getSession().getAttribute("hygly");
		listjs = servc.findAll(String.valueOf(hygly.getYhbh()));
		model.addAttribute("listjs",listjs);
		return "hy_tjzh";
	}
	
	@RequestMapping("hyjs_cszj1")//重置角色第一步
	public String czjs1(Model model,String id,HttpServletRequest request) throws Exception {
		hyjs = servc.find(id);
		request.getSession().setAttribute("hyjs_id",id);
		model.addAttribute("jsmc",hyjs.getJsmc());
		return "hy_czjs";
	}
	
	@RequestMapping("hyjs_cszj2")//重置角色第一步
	public void czjs2(Hyjs hyjs,Model model,HttpServletRequest request) throws Exception {
		hygly = (Hygly) request.getSession().getAttribute("hygly");
		hyjs.setId(Integer.parseInt(request.getSession().getAttribute("hyjs_id").toString()));
		hyjs.setYhbh(hygly.getYhbh());
		servc.save(hyjs);
	}
	
	
}
