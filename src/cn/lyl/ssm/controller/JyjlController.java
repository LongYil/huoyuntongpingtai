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
	
	@RequestMapping("jyjl_cysFindAll")//承运商查找所有交易记录
	public String cysFindAll(Model model,HttpServletRequest request){
		listvo.clear();
		listvo = servc.cysFindAll(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listvo",listvo);
		return "cys_jyjl";
	}
	
	@RequestMapping("jyjl_FindJnjl")//查找保证金缴纳记录
	public String FindJnjl(Model model,HttpServletRequest request){
		listvo.clear();
		listvo = servc.FindJnjl(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listvo",listvo);
		return "cys_bzjjnjl";
	}
	
	@RequestMapping("jyjl_FindJdjl")//查找保证金解冻记录
	public String FindJdjl(Model model,HttpServletRequest request){
		listvo.clear();
		listvo = servc.FindJdjl(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listvo",listvo);
		return "cys_bzjjdjl";
	}
	
	@RequestMapping("jyjl_FindCzjl")//查找物流币充值记录
	public String FindCzjl(Model model,HttpServletRequest request){
		listvo.clear();
		listvo = servc.FindCzjl(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listvo",listvo);
		return "cys_wlbczjl";
	}
	
	@RequestMapping("jyjl_FindTxjl")
	public String FindTxjl(Model model,HttpServletRequest request){
		listvo.clear();
		listvo = servc.FindTxjl(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listvo",listvo);
		return "cys_wlbtxjl";
	}
}
