package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Clxx;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.service.impl.ClxxServc;

/**
 * <p>Title:ClxxController</p>
 * <p>Description: 车辆信息控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:25:52
 */
@Controller
public class ClxxController extends BasicController<ClxxServc> {
	@Autowired
	private Clxx clxx;
	@Autowired
	private Cysgly cysgly;

	
	@RequestMapping("/clxx_save")
	public void save(Clxx clxx,HttpServletRequest request){
		clxx.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		System.out.println(clxx);
		servc.save(clxx);
	}
	
	@RequestMapping("/clxx_gr_find")
	public String find(Model model,HttpServletRequest request){
		clxx = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("clxx",clxx);
		return "cys_grclgl";
	}
	@RequestMapping("/clxx_glyFindById")
	public String glyFindById(String id,String mc,Model model,HttpServletRequest request){
		
		request.getSession().setAttribute("cdclid",id);
		model.addAttribute("cdmc",mc);
		return "cys_cdclgl";
	}
	@RequestMapping("clxx_cd_save")
	public void cd_save(Clxx clxx,HttpServletRequest request){
		cysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		clxx.setCdbh(Integer.parseInt(request.getSession().getAttribute("cdclid").toString()));
		clxx.setYhbh(cysgly.getYhbh());
		clxx.setCysbh(cysgly.getCysbh());
		servc.save(clxx);
	}
	
}
