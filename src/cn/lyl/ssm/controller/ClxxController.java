package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Clxx;
import cn.lyl.ssm.service.impl.ClxxServc;

@Controller
public class ClxxController extends BasicController<ClxxServc> {
	@Autowired
	private Clxx clxx;
	
	@RequestMapping("/clxx_save")
	public void save(Clxx clxx,HttpServletRequest request){
		clxx.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		System.out.println(clxx);
		servc.save(clxx);
	}
	
	@RequestMapping("/clxx_gr_find")
	public String find(Model model,HttpServletRequest request){
		clxx = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("clxx",clxx);
		return "cys_grclgl";
	}
}
