package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.service.impl.YscdServc;

/**
 * <p>Title:YscdController</p>
 * <p>Description: 运输车队控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:28:07
 */
@Controller
public class YscdController extends BasicController<YscdServc> {
	
	private List<Yscd> listcd = new ArrayList<Yscd>();
	
	@RequestMapping("/yscd_save")
	public void save(Yscd yscd,HttpServletRequest request){
		yscd.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		servc.save(yscd);
	}
	
	@RequestMapping("/yscd_cysFindAll")
	public String cysFindAll(Model model,HttpServletRequest request){
		listcd = servc.cysFindAll(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listcd",listcd);
		return "cys_cdcdgl";
	}
	
	
	
	
	
	
	
	
	
}
