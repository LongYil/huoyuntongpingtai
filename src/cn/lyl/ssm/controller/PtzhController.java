package cn.lyl.ssm.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.service.impl.PtzhServc;

/**
 * <p>Title:PtzhController</p>
 * <p>Description:平台账户控制器 </p>
 * @author 李银龙
 *		2017年8月25日
 *		下午5:11:19
 */
@Controller
public class PtzhController extends BasicController<PtzhServc> {
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private Jbyh jbyh;
	
	@RequestMapping("ptzh_find")
	public String find(Model model,HttpServletRequest request) throws Exception{
		ptzh = servc.find(request.getSession().getAttribute("yhbh").toString());
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		model.addAttribute("ptzh",ptzh);
		model.addAttribute("jbyh",jbyh);
		return "cys_wlb";
	}
	
	@RequestMapping("ptzh_cysfind")//账户余额查询方法
	public String findYe(Model model,HttpServletRequest request) throws Exception{
		ptzh = servc.find(request.getSession().getAttribute("yhbh").toString());
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		model.addAttribute("ptzh",ptzh);
		model.addAttribute("jbyh",jbyh);
		return "cys_zhye";
	}
	
	@RequestMapping("ptzh_tixian")
	public void tixian(String info,HttpServletRequest request,PrintWriter out) throws Exception{
		boolean result = servc.tixian(info,request.getSession().getAttribute("yhbh").toString());
		out.write(String.valueOf(result));
	}
	
	@RequestMapping("ptzh_fqtx")
	public String fqtx(Model model,HttpServletRequest request) throws Exception{
		ptzh = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("ptzh",ptzh);
		return "cys_wlbtx";
	}
	
}
