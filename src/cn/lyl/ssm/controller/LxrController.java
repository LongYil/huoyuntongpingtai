package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Lxr;
import cn.lyl.ssm.service.impl.LxrServc;

@Controller
public class LxrController extends BasicController<LxrServc> {

	private List<Lxr> listlxr = new ArrayList<Lxr>();
	
	@RequestMapping("/lxr_save")
	public void save(String[] info,Lxr lxr,HttpServletRequest request){
		lxr.setLxrdz(info[0]+info[1]+info[2]);
		lxr.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		System.out.println(lxr);
		servc.save(lxr);		
	}
	@RequestMapping("lxr_findAll")
	public String findAll(Model model,HttpServletRequest request){
		listlxr = servc.findAll(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listlxr", listlxr);
		return "wtr_lxrgl";
	}
}
