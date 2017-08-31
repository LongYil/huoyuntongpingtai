package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Bzj;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Hydld;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.service.impl.BzjServc;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.HydldServc;
import cn.lyl.ssm.service.impl.HyglyServc;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtzhServc;

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
	@Autowired
	private Bzj bzj;
	@Autowired
	private BzjServc bzjServc;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private PtzhServc ptzhServc;
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private List<Hygly> listdld = new ArrayList<Hygly>();
	
	
	@RequestMapping("/hy_save")//货运代理点用户注册方法
	public String save(Model model,Jbyh jbyh,Hydld hydld,Hygly hygly,HttpServletRequest request){
		boolean temp = false;
		try{
			String info = request.getSession().getAttribute("jbyh").toString();
		}catch(Exception e){
			temp = true;
		}
		if(temp){
			jbyhServc.save(jbyh);
			bzj.setYhbh(jbyh.getYhbh());
			bzj.setBzjje(0);
			bzjServc.save(bzj);
			ptzh.setYhbh(jbyh.getYhbh());
			ptzh.setZhye(2000.0f);
			ptzhServc.save(ptzh);
			hydld.setYhbh(jbyh.getYhbh());
			hygly.setYhbh(jbyh.getYhbh());
			hygly.setGlylx(1);
			hygly.setGlybh(jbyh.getYhbh());
			hygly.setLxdh(jbyh.getYhsj());
			servc.save(hygly);
			hydldServc.save(hydld);
			request.getSession().setAttribute("jbyh", jbyh);
			request.getSession().setAttribute("yhbh", jbyh.getYhbh());
			model.addAttribute("jbyh",jbyh);
		}else{
			;
		}
		
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
	public String findInfo(Model model,HttpServletRequest request) throws Exception{
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		hygly = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("jbyh",jbyh);
		model.addAttribute("hygly",hygly);
		return "hy_jbxx";
	}
	
	@RequestMapping("hy_cysFindDld")
	public String cysFindDld(Model model,HttpServletRequest request) throws Exception{
		cysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		hygly = servc.find(String.valueOf(cysgly.getDlbh()));
		model.addAttribute("hygly",hygly);
		return "cys_dld";
	}
	
	@RequestMapping("hy_findAllDldb")
	public String findAllDldb(Model model){//查找所有代理点
		listdld.clear();
		listdld = servc.findAll("");
		model.addAttribute("listdld",listdld);
		return "cys_dldszbdld";
	}
	@RequestMapping("hy_findAllDldsy")
	public String findAllDldsy(Model model){//查找所有代理点
		listdld.clear();
		listdld = servc.findAll("");
		model.addAttribute("listdld",listdld);
		return "cys_dldszsydld";
	}
	
	@RequestMapping("hy_findByGlybh")
	public String findByGlybh(String id,Model model) throws Exception{
		cysgly = cysglyServc.findByGlyid(id);
		if(cysgly.getDlbh()==0){
			hygly.setGsmc("");
		}else{
			hygly = servc.find(String.valueOf(cysgly.getDlbh()));
		}
		model.addAttribute("hygly",hygly);
		return "dld";
	}
	
	@RequestMapping("hy_yszdld")//承运商管理员给所拥有的帐号预设置代理点 id为帐号的id
	public String yszdld(Model model,String id,HttpServletRequest request){
		request.getSession().setAttribute("temphyid", id);
		listdld.clear();
		listdld = servc.findAll("");
		model.addAttribute("listdld",listdld);
		return "dld_sz";
	}
	
	@RequestMapping("hy_szdld")//承运商管理员给所拥有的帐号设置代理点
	public void szdld(String id,HttpServletRequest request) throws Exception{
		String cysglyid = request.getSession().getAttribute("temphyid").toString();
		cysgly = cysglyServc.findByGlyid(cysglyid);
		cysgly.setDlbh(Integer.parseInt(id));
		cysglyServc.update(cysgly);
	}
	
	
	
}