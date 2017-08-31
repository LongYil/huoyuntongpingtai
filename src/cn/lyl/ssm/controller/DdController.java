package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.service.impl.DdServc;
import cn.lyl.ssm.vo.Ysdw;

/**
 * <p>Title:DdController</p>
 * <p>Description: 订单控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:26:12
 */
@Controller
@Scope(value="prototype")
public class DdController extends BasicController<DdServc> {
	
	private List<Ysdw> listYsdw = new ArrayList<Ysdw>();
	
	@RequestMapping("dd_diyibu")//第一步
	public String diyibu(Model model,Dd dd,HttpServletRequest request) throws Exception{
		listYsdw.clear();
		listYsdw.addAll(servc.findBestYsdw(dd));
		request.getSession().setAttribute("listYsdw",listYsdw);
		model.addAttribute("listYsdw",listYsdw);
		return "dd_xzly";
	}
	
	@RequestMapping("dd_dierbu")//第二步
	public String dierbu(String id){
		System.out.println(id);
		return "dd_yhdd";
	}
	
	
}
