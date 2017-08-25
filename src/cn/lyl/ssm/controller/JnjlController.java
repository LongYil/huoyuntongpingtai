package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jnjl;
import cn.lyl.ssm.service.impl.JnjlServc;

/**
 * <p>Title:JnjlController</p>
 * <p>Description:保证金缴纳记录控制器</p>
 * @author 李银龙
 *		2017年8月25日
 *		上午10:18:01
 */
@Controller
public class JnjlController extends BasicController<JnjlServc> {
	
	private List<Jnjl> listJnjl = new ArrayList<Jnjl>();
	
	@RequestMapping("jnjl_cysFindAllJnjl")
	public String cysFindAllJnjl(Model model,HttpServletRequest request){

		listJnjl.clear();
		listJnjl = servc.cysFindAllJnjl(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listJnjl",listJnjl);
		
		return "cys_bzjjnjl";
	}

}
