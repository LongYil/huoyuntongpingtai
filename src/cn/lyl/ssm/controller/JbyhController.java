package cn.lyl.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
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
	
	@RequestMapping("/jbyh_login")
	public String login(Jbyh jbyh){
		int type = servc.login(jbyh);
		System.out.println(type);
		switch(type){
		case 1:
			return "pt_ptgly";
		case 2:
			return "wtr_index";
		case 3:
			return "cys_grindex";
		case 4:
			return "cys_cdindex";
		case 5:
			return "hy_index";
		default:
			return "success";
		}
	}
	
	
	
}
