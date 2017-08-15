package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.service.impl.WlxServc;

@Controller
public class WlxController extends BasicController<WlxServc> {
	private List<Wlx> listwlx = new ArrayList<Wlx>();
	
	@RequestMapping("/wlx_save")
	public void save(Wlx wlx,HttpServletRequest request){
		wlx.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		servc.save(wlx);
	}
	
	@RequestMapping("/wlx_findAll")
	public String findAll(Model model,HttpServletRequest request){
		listwlx = servc.findAll(request.getSession().getAttribute("yhbh").toString());
		System.out.println("正在查询线路"+listwlx.size());
		model.addAttribute("listwlx", listwlx);
		return "cys_xlgl";
	}
}
