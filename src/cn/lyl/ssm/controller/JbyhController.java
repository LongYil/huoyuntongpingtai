package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Cysqx;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptgly;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.CysqxServc;
import cn.lyl.ssm.service.impl.HyglyServc;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtglyServc;

/**
 * <p>Title:JbyhController</p>
 * <p>Description: 基本用户控制器</p>
 * @author 李银龙
 *		2017年7月21日
 *		上午9:27:10
 */
@Controller
public class JbyhController extends BasicController<JbyhServc> {
	
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Cysqx cysqx;
	@Autowired
	private CysqxServc cysqxServc;
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private Hygly hygly;
	@Autowired
	private HyglyServc hyglyServc;
	@Autowired
	private Ptgly ptgly;
	@Autowired
	private PtglyServc ptglyServc;
	
	@RequestMapping("/jbyh_login")
	public String login(Model model,Jbyh jbyh,HttpServletRequest request) throws Exception{
		
		if(jbyh.getYhmm()!=null&&jbyh.getYhmm()!="") {
			request.getSession().invalidate();	
			jbyh.setYhmm(md5Encrypt.to32MD5(jbyh.getYhmm()));
			int[] info = servc.login(jbyh);
			this.jbyh = servc.find(String.valueOf(info[1]));
			model.addAttribute("jbyh",this.jbyh);
			request.getSession().setAttribute("jbyh", this.jbyh);
			request.getSession().setAttribute("yhbh", info[1]);
			switch(info[0]){
			case 1:
				ptgly = ptglyServc.find(String.valueOf(this.jbyh.getYhbh()));
				request.getSession().setAttribute("ptgly", ptgly);
				request.getSession().setAttribute("tempptgly", ptgly);
				System.out.println(ptgly);
				return "pt_index";
			case 2:
				return "wtr_index";
			case 3:
				return "cys_grindex";
			case 4:
				cysgly = cysglyServc.find(String.valueOf(info[1]));
				request.getSession().setAttribute("cysgly",cysgly);
				cysqx = cysqxServc.find(String.valueOf(cysgly.getJsbh()));
				model.addAttribute("cysqx",cysqx);
				
				return "cys_cdindex";
			case 5:
				cysgly = cysglyServc.find(String.valueOf(info[1]));
				request.getSession().setAttribute("cysgly",cysgly);
				cysqx = cysqxServc.find(String.valueOf(cysgly.getJsbh()));
				model.addAttribute("cysqx",cysqx);
				
				return "cys_cdindex";
			case 6:
				hygly = hyglyServc.find(String.valueOf(info[1]));
				request.getSession().setAttribute("hygly",hygly);
				return "hy_index";
			default:
				return "login";
			}
		}else {
			jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
			switch(jbyh.getYhlx()){
			case 1:
				ptgly = ptglyServc.find(String.valueOf(this.jbyh.getYhbh()));
				request.getSession().setAttribute("ptgly", ptgly);
				request.getSession().setAttribute("tempptgly", ptgly);
				model.addAttribute("jbyh",jbyh);
				return "pt_index";
			case 2:
				model.addAttribute("jbyh",jbyh);
				return "wtr_index";
			case 3:
				model.addAttribute("jbyh",jbyh);
				return "cys_grindex";
			case 4:
				cysgly = cysglyServc.find(String.valueOf(jbyh.getYhbh()));
				request.getSession().setAttribute("cysgly",cysgly);
				cysqx = cysqxServc.find(String.valueOf(cysgly.getJsbh()));
				model.addAttribute("cysqx",cysqx);
				model.addAttribute("jbyh",jbyh);
				return "cys_cdindex";
			case 5:
				cysgly = cysglyServc.find(String.valueOf(jbyh.getYhbh()));
				request.getSession().setAttribute("cysgly",cysgly);
				cysqx = cysqxServc.find(String.valueOf(cysgly.getJsbh()));
				model.addAttribute("cysqx",cysqx);
				model.addAttribute("jbyh",jbyh);
				return "cys_cdindex";
			case 6:
				hygly = hyglyServc.find(String.valueOf(jbyh.getYhbh()));
				request.getSession().setAttribute("hygly",hygly);
				model.addAttribute("jbyh",jbyh);
				return "hy_index";
			default:
				return "login";
			}
		}
		
	}
	
	@RequestMapping("jbyh_logOff")//注销离开
	public String logOff(HttpServletRequest request) {
		request.getSession().invalidate();
		return "index";
	}
	
	@RequestMapping("jbyh_logOn")
	public String logOn() {//登录
		return "login";
	}
	
	@RequestMapping("jbyh_preregister")
	public String preregister() {
		return "preregister";
	}
	
	@RequestMapping("index")
	public String index() {
		jbyh = servc.find("1");
		if(jbyh!=null) {
			return "index";
		}else {
			return "pt_start";
		}		
	}
	
	
	
	
	
	
	
	
	
}
