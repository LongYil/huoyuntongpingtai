package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cys;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.service.impl.CysServc;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.JbyhServc;

/**
 * <p>Title:CysglyController</p>
 * <p>Description: 承运商管理员控制器</p>
 * @author 李银龙
 *		2017年8月10日
 *		下午8:31:23
 */
@Controller
@Scope(value="prototype")
public class CysglyController extends BasicController<CysglyServc> {
	@Autowired
	private JbyhServc jbyhServc;
	@Autowired
	private CysServc cysServc;
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Cysgly cysgly;
	//承运商的保存方法：
	@RequestMapping("/cysgly_save")
	public String save(Jbyh jbyh,Cys cys,Cysgly cysgly,HttpServletRequest request){
		int type = jbyh.getYhlx();
		jbyhServc.save(jbyh);
		cys.setLxdh(jbyh.getYhsj());
		cysgly.setLxdh(jbyh.getYhsj());
		cys.setHylx(String.valueOf(jbyh.getYhlx()));
		cys.setYhbh(jbyh.getYhbh());
		cysgly.setYhbh(jbyh.getYhbh());
		cysgly.setHylx(String.valueOf(jbyh.getYhlx()));

		cysServc.save(cys);
		servc.save(cysgly);
		
		request.getSession().setAttribute("yhbh", jbyh.getYhbh());
		request.getSession().setAttribute("jbyh", jbyh);
		
		if(type==3){
			return "cys_grindex";
		}else{
			return "cys_cdindex";
		}
	}
	@RequestMapping("/cys_updategly")
	public String updategly(String[] info,HttpServletRequest request){

		jbyh = jbyhServc.find(request.getSession().getAttribute("yhbh").toString());
		cysgly = servc.find(request.getSession().getAttribute("yhbh").toString());
		jbyh.setYhxm(info[0]);
		cysgly.setGsmc(info[1]);
		cysgly.setYhyx(info[2]);
		cysgly.setSzsf(info[3]);
		cysgly.setSzcs(info[4]);
		cysgly.setSzx(info[5]);
		
		System.out.println(cysgly);
		
		jbyhServc.update(jbyh);
		servc.update(cysgly);
		
		return "redirect:cys_findCysInfo.action";
	}
	//查询承运商信息
	@RequestMapping("/cys_findCysInfo")
	public String findCysInfo(Model model,String yhbh,HttpServletRequest request){
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		cysgly = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("jbyh",jbyh);
		model.addAttribute("cysgly",cysgly);
		return "cys_grjbxx";
	}
	@RequestMapping("/cys_findCysZhxx")
	public String findCysZhxx(Model model,HttpServletRequest request){
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		model.addAttribute("jbyh",jbyh);
		return "cys_zhxx";
	}
	
	@RequestMapping("/cys_addGly")
	public void addGly(){
		
	}
}
