package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jyjl;
import cn.lyl.ssm.service.impl.JyjlServc;
import cn.lyl.ssm.vo.JyjlVo;

@Controller
public class JyjlController extends BasicController<JyjlServc>{
	
	private List<JyjlVo> listvo = new ArrayList<JyjlVo>();
	
	@RequestMapping("jyjl_cysSave")
	public void cysSave(Jyjl jyjl,Model model,HttpServletRequest request){
		jyjl.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		jyjl.setJysj(this.getDateAndTime.getNowDate());
		jyjl.setJylx(1);
		jyjl.setJyzt(1);
		servc.save(jyjl);		
	}
	
	@RequestMapping("jyjl_cysFindAll")
	public String cysFindAll(Model model,HttpServletRequest request){
		listvo = servc.cysFindAll(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listvo",listvo);
		return "cys_jyjl";
	}
	
	
	
}
