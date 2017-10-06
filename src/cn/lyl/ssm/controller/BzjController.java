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

/**
 * <p>Title:BzjController</p>
 * <p>Description:保证金控制器 </p>
 * @author 李银龙
 *		2017年8月26日
 *		下午8:46:54
 */
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
	
	@RequestMapping("bzj_cysSqjd")//申请解冻保证金方法，查询用户的保证金金额
	public String cysSqjd(Model model,HttpServletRequest request) throws Exception{
		bzj = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("bzj",bzj);
		return "cys_bzjjd";
	}
	
	@RequestMapping("bzj_cysFqjd")//承运商发起解冻保证金的申请，若成功发起，返回true，否则返回false
	public void cysFqjd(String info,HttpServletRequest request,PrintWriter out) throws Exception{		
		boolean result = servc.cysFqjd(info, request.getSession().getAttribute("yhbh").toString());
		out.write(String.valueOf(result));
	}

}
