package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Hydld;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.service.impl.HydldServc;
import cn.lyl.ssm.service.impl.HyglyServc;
import cn.lyl.ssm.service.impl.JbyhServc;

/**
 * <p>Title:HyglyController</p>
 * <p>Description: 货运代理点管理员控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:26:30
 */
@Controller
public class HyglyController extends BasicController<HyglyServc> {
	@Autowired
	private HydldServc hydldServc;
	@Autowired
	private JbyhServc jbyhServc;
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Hydld hydld;
	@Autowired
	private Hygly hygly;
	
	
	@RequestMapping("/hy_save")
	public String save(Jbyh jbyh,Hydld hydld,Hygly hygly){
		jbyhServc.save(jbyh);
		hydld.setYhbh(jbyh.getYhbh());
		hygly.setYhbh(jbyh.getYhbh());
		hygly.setGlylx(1);
		servc.save(hygly);
		hydldServc.save(hydld);
		return "hy_index";
	}
	@RequestMapping("/hy_dld_update")
	public void update(String info[],HttpServletRequest request) throws Exception{
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		hygly = servc.find(request.getSession().getAttribute("yhbh").toString());
		hydld = hydldServc.find(request.getSession().getAttribute("yhbh").toString());
		
		jbyh.setYhxm(info[0]);
		hygly.setYhbz(info[6]);
		hygly.setYhyx(info[2]);
		hydld.setGsmc(info[1]);
		hygly.setGsmc(info[1]);
		hydld.setSzsf(info[3]);
		hygly.setSzsf(info[3]);
		hydld.setSzcs(info[4]);
		hygly.setSzcs(info[4]);
		hydld.setSzx(info[5]);
		hygly.setSzx(info[5]);
		
		jbyhServc.save(jbyh);
		hydldServc.save(hydld);
		servc.save(hygly);		
	}
	
	@RequestMapping("/hy_dld_findInfo")
	public String findInfo(Model model,HttpServletRequest request){
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		hygly = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("jbyh",jbyh);
		model.addAttribute("hygly",hygly);
		return "hy_jbxx";
	}
	
	
	
	
	
	
	
	
	
	
	
}
