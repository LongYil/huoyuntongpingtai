package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Wtr;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.WtrServc;

/**
 * <p>Title:WtrController</p>
 * <p>Description: 委托人控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:27:35
 */
@Controller
public class WtrController extends BasicController<WtrServc> {
	
	@Autowired
	private JbyhServc jbyhServc;
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Wtr wtr;
	@RequestMapping("/wtr_save")
	public String save(Jbyh jbyh,Wtr wtr){
		jbyhServc.save(jbyh);
		wtr.setYhbh(jbyh.getYhbh());
		servc.save(wtr);
		return "wtr_index";
	}
	@RequestMapping("/wtr_findWtrInfo")
	public String findWtrInfo(Model model,HttpServletRequest request){
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		wtr = servc.find(request.getSession().getAttribute("yhbh").toString());
		
		model.addAttribute("wtr",wtr);
		return "wtr_jbxx";
	}
	@RequestMapping("wtr_updateWtrInfo")
	public void updateWtrInfo(String[] info,HttpServletRequest request){
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		wtr = servc.find(request.getSession().getAttribute("yhbh").toString());
		jbyh.setYhxm(info[0]);
		wtr.setGsmc(info[1]);
		wtr.setYhyx(info[2]);
		wtr.setYhsf(info[3]);
		wtr.setYhcs(info[4]);
		wtr.setYhx(info[5]);
		wtr.setYhbz(info[6]);
		
		
		jbyhServc.update(jbyh);
		servc.update(wtr);
	}
}
