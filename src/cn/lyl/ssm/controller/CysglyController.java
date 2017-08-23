package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

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
import cn.lyl.ssm.utils.AssembleCysgly;
import cn.lyl.ssm.vo.CysglyVo;

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
	@Autowired
	private AssembleCysgly assembleCysgly;
	
	private List<Cysgly> listgly = new ArrayList<Cysgly>();
	private List<Jbyh> listjbyh = new ArrayList<Jbyh>();
	private List<CysglyVo> listvo = new ArrayList<CysglyVo>();
	
	//承运商的保存方法
	@RequestMapping("/cysgly_save")
	public String save(Jbyh jbyh,Cys cys,Cysgly cysgly,HttpServletRequest request){
		int type = jbyh.getYhlx();
		jbyhServc.save(jbyh);
		cys.setLxdh(jbyh.getYhsj());
		cysgly.setLxdh(jbyh.getYhsj());
		cys.setYhbh(jbyh.getYhbh());
		cysgly.setYhbh(jbyh.getYhbh());
		if(type==3){
			cys.setHylx(1);
			cysgly.setHylx(1);
		}else{
			cys.setHylx(2);
			cysgly.setHylx(2);
			cysgly.setCysbh(jbyh.getYhbh());
		}
		cysServc.save(cys);
		servc.save(cysgly);
		request.getSession().setAttribute("yhbh", jbyh.getYhbh());
		request.getSession().setAttribute("jbyh", jbyh);
		request.getSession().setAttribute("cysgly", cysgly);
		
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
	public void addGly(Jbyh jbyh,Cysgly cysgly,HttpServletRequest request){
		jbyhServc.save(jbyh);
		cysgly.setCysbh(jbyh.getYhbh());
		cysgly.setHylx(3);//会员类型为3，表示该管理员是承运商分管理员
		cysgly.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		servc.save(cysgly);
	}
	//查询所有管理员
	@RequestMapping("/cys_findAllGly")
	public String findAllGly(Model model,HttpServletRequest request){
		listgly = servc.findAll(request.getSession().getAttribute("yhbh").toString());
		listjbyh = jbyhServc.findAllGly(listgly);
		listvo = assembleCysgly.getAllVo(listjbyh, listgly);
		model.addAttribute("listvo", listvo);
		return "cys_cdzhgl";
	}
	
}
