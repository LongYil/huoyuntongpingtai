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
import cn.lyl.ssm.po.Cysqx;
import cn.lyl.ssm.po.Hydj;
import cn.lyl.ssm.po.Hydld;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Hyjs;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.service.impl.BzjServc;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.CysqxServc;
import cn.lyl.ssm.service.impl.HydjServc;
import cn.lyl.ssm.service.impl.HydldServc;
import cn.lyl.ssm.service.impl.HyglyServc;
import cn.lyl.ssm.service.impl.HyjsServc;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtzhServc;
import cn.lyl.ssm.utils.AssembleHydld;
import cn.lyl.ssm.utils.AssembleHygly;
import cn.lyl.ssm.vo.HyglyVo;

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
	private Hygly temphygly;

	private Bzj bzj;
	@Autowired
	private BzjServc bzjServc;

	private Ptzh ptzh;
	@Autowired
	private PtzhServc ptzhServc;
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private AssembleHygly assembleHygly;
	@Autowired
	private AssembleHydld assembleHydld;
	@Autowired
	private Cysqx cysqx;
	@Autowired
	private CysqxServc cysqxServc;
	@Autowired
	private Hyjs hyjs;
	@Autowired
	private HyjsServc hyjsServc;
	@Autowired
	private Hydj hydj;
	@Autowired
	private HydjServc hydjServc;
	
	private List<Jbyh> listJbyh = new ArrayList<Jbyh>();
	private List<Hygly> listdld = new ArrayList<Hygly>();
	private List<Hygly> listgly = new ArrayList<Hygly>();
	private List<Hydld> listhydld = new ArrayList<Hydld>();
	private List<HyglyVo> listvo = new ArrayList<HyglyVo>();
	
	@RequestMapping("/hy_save")//货运代理点用户注册方法
	public String save(Model model,Jbyh jbyh,Hydld hydld,Hygly hygly,HttpServletRequest request){
		boolean temp = true;

		if(jbyh.getYhm()==null) {
			temp = false;
		}else {
			;
		}
		
		if(temp){
			jbyh.setYhmm(md5Encrypt.to32MD5(jbyh.getYhmm()));
			jbyhServc.save(jbyh);
			bzj = new Bzj();
			bzj.setYhbh(jbyh.getYhbh());
			bzj.setBzjje(0);
			bzj.setYsqje(0);
			bzjServc.save(bzj);
			ptzh = new Ptzh();
			ptzh.setYhbh(jbyh.getYhbh());
			ptzh.setZhye(2000.0f);
			ptzhServc.save(ptzh);
			
			hydld.setYhbh(jbyh.getYhbh());
			hygly.setYhbh(jbyh.getYhbh());
			hygly.setGlylx(1);
			hygly.setGlybh(jbyh.getYhbh());
			hygly.setLxdh(jbyh.getYhsj());

			hydj.setYhbh(jbyh.getYhbh());
			hydj.setJjje(0);
			hydj.setHydj("青铜");
			hydjServc.save(hydj);
			
			hyjs.setBzj("inline-block");
			hyjs.setSycd("inline-block");
			hyjs.setSycys("inline-block");
			hyjs.setSyxl("inline-block");
			hyjs.setWlb("inline-block");
			hyjs.setZhgl("inline-block");
			hyjs.setZhxx("inline-block");
			hyjs.setJsgl("inline-block");
			hyjs.setXtrz("inline-block");
			hyjs.setJsmc("超级管理员");
			hyjs.setYhbh(jbyh.getYhbh());
			hyjsServc.save(hyjs);
			
			hygly.setJsbh(hyjs.getId());
			servc.save(hygly);
			hydldServc.save(hydld);
			
			request.getSession().setAttribute("jbyh", jbyh);
			request.getSession().setAttribute("yhbh", jbyh.getYhbh());
			request.getSession().setAttribute("hygly", hygly);
			model.addAttribute("jbyh",jbyh);
			model.addAttribute("hyjs",hyjs);
			model.addAttribute("hydj",hydj);
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
		hygly.setYhyx(info[2]);
		hydld.setGsmc(info[1]);
		hygly.setGsmc(info[1]);
		hydld.setSzsf(info[3]);
		hygly.setSzsf(info[3]);
		hydld.setSzcs(info[4]);
		hygly.setSzcs(info[4]);
		hydld.setSzx(info[5]);
		hygly.setSzx(info[5]);
		hydld.setXxdz(info[6]);
		hygly.setXxdz(info[6]);
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
	
	//
	@RequestMapping("hy_cysFindDld")
	public String cysFindDld(Model model,HttpServletRequest request) throws Exception{
		cysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		hygly = servc.find(String.valueOf(cysgly.getDlbh()));
		cysqx = cysqxServc.find(String.valueOf(cysgly.getJsbh()));
		model.addAttribute("cysqx",cysqx);
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
	
	@RequestMapping("hy_yszdld")//承运商管理员给所拥有的帐号预设置代理点 id为帐号的id(用户给管理员设置代理点)
	public String yszdld(Model model,String id,HttpServletRequest request){
		listdld.clear();
		
		request.getSession().setAttribute("temphyid", id);
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
	
	@RequestMapping("hy_hyAddGly")//货运代理点用户添加管理员
	public void hyAddGly(Jbyh jbyh,Hygly hygly,HttpServletRequest request){
		jbyh.setYhmm(md5Encrypt.to32MD5(jbyh.getYhmm()));
		jbyhServc.save(jbyh);
		hygly.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		hygly.setGlylx(2);
		hygly.setLxdh(jbyh.getYhsj());
		hygly.setGlybh(jbyh.getYhbh());
		servc.save(hygly);
	}
	
	@RequestMapping("hy_hyFindAllGly")
	public String hyFindAllGly(Model model,HttpServletRequest request) throws Exception{//货运代理点用户查找所有管理员帐户
		listgly.clear();
		listJbyh.clear();
		listvo.clear();
		listgly = servc.yhFindAllGly(request.getSession().getAttribute("yhbh").toString());
		listJbyh = jbyhServc.getJbyhByHygly(listgly);
		listvo = assembleHygly.getGlyvoList(listJbyh, listgly);
		model.addAttribute("listvo",listvo);
		return "hy_zhgl";
	}
	
	@RequestMapping("hy_hyDeleteGly")//货运代理点用户删除管理员
	public String hyDeleteGly(String id) {
		hygly = servc.getById(id);
		jbyh = jbyhServc.find(id);
		servc.delete(hygly);
		jbyhServc.delete(jbyh);
		return "redirect:hy_hyFindAllGly.action";
	}
	
	@RequestMapping("hy_findAll")
	public String findAll(Model model) {
		listhydld.clear();
		listvo.clear();
		listhydld = hydldServc.findAll("");
		listvo = assembleHydld.getHydldVo(listhydld);
		model.addAttribute("listvo",listvo);
		return "pt_hydld";
	}
	
	@RequestMapping("hy_ptFndHygly")
	public String ptFndHygly(Model model,String id,String mc) throws Exception {
		listgly.clear();
		listJbyh.clear();
		listvo.clear();
		listgly = servc.yhFindAllGly(id);
		listJbyh = jbyhServc.getJbyhByHygly(listgly);
		listvo = assembleHygly.getGlyvoList(listJbyh, listgly);
		model.addAttribute("listvo",listvo);
		model.addAttribute("dldmc",mc);
		return "pt_syzdld";
	}
	
	
	
	
	
}