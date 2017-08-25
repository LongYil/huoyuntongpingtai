package cn.lyl.ssm.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Bzj;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.service.impl.BzjServc;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtzhServc;

@Controller
public class BzjController extends BasicController<BzjServc> {
	@Autowired
	private Bzj bzj;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private PtzhServc ptzhServc;
	@Autowired
	private JbyhServc jbyhServc;
	
	
	@RequestMapping("/bzj_checkAndSave")
	public void checkAndSave(String info,PrintWriter arg,HttpServletRequest request) throws Exception{
		boolean result = servc.checkAndSave(info,request.getSession().getAttribute("yhbh").toString());
		arg.write(String.valueOf(result));
	}
	
	@RequestMapping("bzj_cysFind")
	public String cysFind(Model model,HttpServletRequest request) throws Exception{
		bzj = servc.find(request.getSession().getAttribute("yhbh").toString());
		ptzh = ptzhServc.find(request.getSession().getAttribute("yhbh").toString());
		jbyh = jbyhServc.find(request.getSession().getAttribute("yhbh").toString());
		
		model.addAttribute("bzj",bzj);
		model.addAttribute("ptzh",ptzh);
		model.addAttribute("jbyh",jbyh);
		return "cys_bzj";
	}
}
