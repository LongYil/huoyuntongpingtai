package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Cysjs;
import cn.lyl.ssm.po.Cysqx;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.CysjsServc;
import cn.lyl.ssm.service.impl.CysqxServc;
import cn.lyl.ssm.vo.CysjsVo;

@Controller
public class CysjsController extends BasicController<CysjsServc> {
	
	private List<Cysjs> listjs = new ArrayList<Cysjs>();
	private List<CysjsVo> listjsvo = new ArrayList<CysjsVo>();
	@Autowired
	private Cysjs cysjs;
	@Autowired
	private Cysqx cysqx;
	@Autowired
	private CysqxServc cysqxServc;
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private Cysgly tempcysgly;
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private CysjsVo cysjsVo;
	
	@RequestMapping("cysjs_szjs")
	public String szjs(Model model,String id,HttpServletRequest request) throws Exception {
		tempcysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		listjs.clear();
		request.getSession().setAttribute("cysjs_id", id);
		listjs = servc.findByCysId(String.valueOf(tempcysgly.getYhbh()));
		model.addAttribute("listjs",listjs);
		return "cys_szjs";
	}
	
	@RequestMapping("cysjs_gxjs")//更新角色
	public void gxjs(String jsbh,HttpServletRequest request) throws Exception {//更新角色
		cysgly = cysglyServc.findByGlyid(request.getSession().getAttribute("cysjs_id").toString());
		cysgly.setJsbh(Integer.parseInt(jsbh));
		cysglyServc.update(cysgly);
	}
	
	@RequestMapping("cysjs_findAllJs")
	public String findAllJs(Model model,HttpServletRequest request) throws Exception {
		tempcysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		
		listjsvo.clear();
		listjsvo = servc.findAllCysjs(String.valueOf(tempcysgly.getYhbh()));
		model.addAttribute("listjsvo",listjsvo);
		return "cys_jsgl";
	}
	@RequestMapping("cysjs_findAllYhjs")//查询所有用户角色
	public String findAllYhjs(Model model,HttpServletRequest request) throws Exception {
		tempcysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		listjs.clear();
		listjs = servc.findByCysId(String.valueOf(tempcysgly.getYhbh()));
		model.addAttribute("listjs",listjs);
		return "cys_cdtjzh";
	}
	
	@RequestMapping("cysjs_xgjs1")//修改角色第一步
	public String xgjs1(String id,Model model,HttpServletRequest request) throws Exception {
		cysjs = servc.find(id);
		cysqx = cysqxServc.find(String.valueOf(cysjs.getId()));
		cysjsVo.setCysqx(cysqx);
		cysjsVo.setJsmc(cysjs.getJsmc());
		
		request.getSession().setAttribute("xgjs1_id",id);
		request.getSession().setAttribute("xgjs1_id2",cysqx.getId());
		model.addAttribute("cysjsVo",cysjsVo);
		
		return "cys_xgjs";
	}
	
	@RequestMapping("cysjs_xgjs2")//修改角色第二步
	public void xgjs2(Cysqx cysqx,Cysjs cysjs,Model model,HttpServletRequest request) {
		String id = request.getSession().getAttribute("xgjs1_id").toString();
		String id2 = request.getSession().getAttribute("xgjs1_id2").toString();
		
		cysjs.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		cysjs.setId(Integer.parseInt(id));
		cysqx.setJsbh(Integer.parseInt(id));
		cysqx.setId(Integer.parseInt(id2));
		
		servc.save(cysjs);
		cysqxServc.save(cysqx);
		
	}
	
	
	
}
