package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.service.impl.WlxServc;

/**
 * <p>Title:WlxController</p>
 * <p>Description:物流线控制器 </p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:27:24
 */
@Controller
public class WlxController extends BasicController<WlxServc> {
	private List<Wlx> listwlx = new ArrayList<Wlx>();
	private String cdmc;
	
	@RequestMapping("/wlx_save")
	public void save(Wlx wlx,HttpServletRequest request){
		wlx.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		servc.save(wlx);
	}
	
	@RequestMapping("/wlx_findAll")
	public String findAll(Model model,HttpServletRequest request){
		listwlx = servc.findAll(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listwlx", listwlx);
		return "cys_xlgl";
	}
	@RequestMapping("wlx_findByGlybh")
	public String findByGlybh(String id,String mc,Model model){
		System.out.println(id);
		
		cdmc = mc;
		
		model.addAttribute("cdmc",cdmc);
		return "cys_cdxlgl";
	}
}
