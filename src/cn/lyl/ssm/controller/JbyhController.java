package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.JbyhServc;

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
	private Cysgly cysgly;
	@Autowired
	private CysglyServc cysglyServc;
	
	@RequestMapping("/jbyh_login")
	public String login(Model model,Jbyh jbyh,HttpServletRequest request){
		int[] info = servc.login(jbyh);
		this.jbyh = servc.find(String.valueOf(info[1]));
		model.addAttribute("jbyh", this.jbyh);
		request.getSession().setAttribute("jbyh", this.jbyh);
		request.getSession().setAttribute("yhbh", info[1]);
		switch(info[0]){
		case 1:
			return "pt_ptgly";
		case 2:
			return "wtr_index";
		case 3:
			return "cys_grindex";
		case 4:
			cysgly = cysglyServc.find(String.valueOf(info[1]));
			request.getSession().setAttribute("cysgly",cysgly);
			return "cys_cdindex";
		case 5:
			cysgly = cysglyServc.find(String.valueOf(info[1]));
			request.getSession().setAttribute("cysgly",cysgly);
			return "cys_cdindex";
		default:
			return "success";
		}
	}
	
	
	
}
