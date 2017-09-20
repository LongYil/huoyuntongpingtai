package cn.lyl.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Bzj;
import cn.lyl.ssm.po.Cys;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Cysjs;
import cn.lyl.ssm.po.Cysqx;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.service.impl.BzjServc;
import cn.lyl.ssm.service.impl.CysServc;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.CysjsServc;
import cn.lyl.ssm.service.impl.CysqxServc;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtzhServc;
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
public class CysglyController extends BasicController<CysglyServc> {
	@Autowired
	private JbyhServc jbyhServc;
	@Autowired
	private CysServc cysServc;
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private PtzhServc ptzhServc;
	@Autowired
	private BzjServc bzjServc;
	@Autowired
	private Bzj bzj;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private Cysgly tempcysgly;
	@Autowired
	private AssembleCysgly assembleCysgly;
	@Autowired
	private Cysjs cysjs;
	@Autowired
	private CysjsServc cysjsServc;
	@Autowired
	private Cysqx cysqx;
	@Autowired
	private CysqxServc cysqxServc;
	
	private List<Cysgly> listgly = new ArrayList<Cysgly>();
	private List<Jbyh> listjbyh = new ArrayList<Jbyh>();
	private List<CysglyVo> listvo = new ArrayList<CysglyVo>();

	//承运商的保存方法
	@RequestMapping("/cysgly_save")
	public String save(Model model,Jbyh jbyh,Cys cys,Cysgly cysgly,HttpServletRequest request){
		int type;
		Cysgly tempjbyh = (Cysgly) request.getSession().getAttribute("cysgly");
		
		if(tempjbyh!=null) {
			if(tempjbyh.getHylx()==1) {
				return "cys_grindex";
			}else {
				return "cys_cdindex";
			}
		}else {
			type = jbyh.getYhlx();
			jbyhServc.save(jbyh);
			cys.setLxdh(jbyh.getYhsj());
			cysgly.setLxdh(jbyh.getYhsj());
			cysgly.setDlbh(0);
			cys.setYhbh(jbyh.getYhbh());
			cysgly.setYhbh(jbyh.getYhbh());
			if(type==3){//如果用户是个人承运商
				cys.setHylx(1);
				cysgly.setHylx(1);
			}else{//如果用户是运输车队承运商  默认赋予具有超级管理员的角色
				cys.setHylx(2);
				cysgly.setHylx(2);
				cysgly.setCysbh(jbyh.getYhbh());
				
				cysjs.setYhbh(jbyh.getYhbh());
				cysjs.setJsmc("超级管理员");
				cysjsServc.save(cysjs);
				
				cysqx.setJsbh(cysjs.getId());
				cysqx.setCdgl("inline-block");
				cysqx.setJsgl("inline-block");
				cysqx.setSycl("inline-block");
				cysqx.setSyxl("inline-block");
				cysqx.setSzbdld("inline-block");
				cysqx.setSzdld("inline-block");
				cysqx.setSzsydld("inline-block");
				cysqx.setWdcl("inline-block");
				cysqx.setWdxl("inline-block");
				cysqx.setXtrz("inline-block");
				cysqx.setZhgl("inline-block");

				cysqxServc.save(cysqx);
				cysgly.setJsbh(cysjs.getId());
			}
			
			cysServc.save(cys);
			servc.save(cysgly);
			ptzh.setYhbh(jbyh.getYhbh());
			ptzh.setZhye(2000.0f);
			bzj.setYhbh(jbyh.getYhbh());
			bzj.setBzjje(0);
			bzj.setKsqje(0);
			bzj.setYsqje(0);
			bzjServc.save(bzj);
			ptzhServc.save(ptzh);

			request.getSession().setAttribute("yhbh", jbyh.getYhbh());
			request.getSession().setAttribute("jbyh", jbyh);
			request.getSession().setAttribute("cysgly", cysgly);
			model.addAttribute("cysqx",cysqx);
		}
		
		if(type==3){
			return "cys_grindex";
		}else{
			return "cys_cdindex";
		}
		
	}
	@RequestMapping("/cys_updategly")
	public String updategly(String[] info,HttpServletRequest request) throws Exception{
		jbyh = jbyhServc.find(request.getSession().getAttribute("yhbh").toString());
		cysgly = servc.find(request.getSession().getAttribute("yhbh").toString());
		jbyh.setYhxm(info[0]);
		cysgly.setGsmc(info[1]);
		cysgly.setYhyx(info[2]);
		cysgly.setSzsf(info[3]);
		cysgly.setSzcs(info[4]);
		cysgly.setSzx(info[5]);
		cysgly.setXxdz(info[6]);
		
		jbyhServc.update(jbyh);
		servc.update(cysgly);
		return "redirect:cys_findCysInfo.action";
	}
	//查询承运商信息
	@RequestMapping("/cys_findCysInfo")
	public String findCysInfo(Model model,String yhbh,HttpServletRequest request) throws Exception{
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
		tempcysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		jbyhServc.save(jbyh);
		cysgly.setCysbh(jbyh.getYhbh());
		cysgly.setDlbh(0);
		cysgly.setLxdh(jbyh.getYhsj());
		cysgly.setHylx(3);//会员类型为3，表示该管理员是承运商分管理员
		cysgly.setYhbh(tempcysgly.getYhbh());
		servc.save(cysgly);
	}
	//查询所有管理员
	@RequestMapping("/cys_findAllGly")
	public String findAllGly(Model model,HttpServletRequest request) throws Exception{
		tempcysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		
		listgly.clear();
		listjbyh.clear();
		listvo.clear();
		listgly = servc.findAll(String.valueOf(tempcysgly.getYhbh()));
		listjbyh = jbyhServc.findAllGly(listgly);
		listvo = assembleCysgly.getAllVo(listjbyh, listgly);
		model.addAttribute("listvo", listvo);
		return "cys_cdzhgl";
	}
	
	//设置承运商的货运代理点
	@RequestMapping("cys_szCysDld")
	public void szCysDld(String id,HttpServletRequest request){
		cysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		cysgly.setDlbh(Integer.parseInt(id));
		servc.update(cysgly);
	}
	//设置承运商所有管理员的货运代理点
	@RequestMapping("cys_szsyCysDld")
	public void szsyCysDld(String id,HttpServletRequest request){
		cysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		servc.szsyCysGly(id,String.valueOf(cysgly.getYhbh()));
	}
	
	@RequestMapping("cys_deleteGly")//删除承运商管理员
	public String deleteGly(String id) throws Exception{
		cysgly = servc.findByGlyid(id);
		jbyh = jbyhServc.find(id);
		servc.delete(cysgly);
		jbyhServc.delete(jbyh);
		return "redirect:cys_findAllGly.action";
	}
	
	@RequestMapping("cys_hyglyFindAllCys")//货运代理点用户查找所有承运商
	public String hyglyFindAllCys(Model model,HttpServletRequest request) throws Exception{
		listgly.clear();
		
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		listgly = servc.hyglyFindAllCys(String.valueOf(jbyh.getYhbh()));
		model.addAttribute("listgly",listgly);
		return "hy_sycys";
	}
	
	@RequestMapping("hy_hyglyFindAllCysByglyid")//货运代理点用户根据管理员id查找该管理员的所有承运商
	public String hyglyFindAllCysByglyid(Model model,String id,String mc1,String mc2,HttpServletRequest request) throws Exception {
		listgly.clear();
		listjbyh.clear();
		listvo.clear();
		
		request.getSession().setAttribute("hy_id",id);
		request.getSession().setAttribute("hy_mc1",mc1);
		request.getSession().setAttribute("hy_mc2",mc2);
		
		listgly = servc.findByHyglyid(id);
		listjbyh = jbyhServc.findAllGly(listgly);
		listvo = assembleCysgly.getAllVo(listjbyh, listgly);
		model.addAttribute("listvo", listvo);
		
		model.addAttribute("mc1", mc1);
		model.addAttribute("mc2", mc2);
		return "hy_zhcys";
	}
	
	@RequestMapping("yscd_cdLogin")//运输车队用户  移动端登录验证
	public void cdLogin(String tel,String pwd,HttpServletResponse response) throws Exception {
			jbyh.setYhsj(tel);
			jbyh.setYhmm(pwd);
			
		    response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			JSONObject job = new JSONObject();
			
			int result = jbyhServc.appLogin(jbyh);
			
			if(result==0) {
				job.put("result",false);
			}else {
				int[] info = jbyhServc.login(jbyh);
				jbyh = jbyhServc.find(String.valueOf(info[1]));
				cysgly = cysglyServc.find(String.valueOf(info[1]));
				job.put("result",true);
				job.put("yhbh", cysgly.getYhbh());
				job.put("cysbh",cysgly.getCysbh());
				job.put("yhm",jbyh.getYhm());
				job.put("yhmc",jbyh.getYhxm());
				job.put("yhmm", jbyh.getYhmm());
				job.put("yhsj",jbyh.getYhsj());
				job.put("dlbh",cysgly.getDlbh());
				job.put("gsmc", cysgly.getGsmc());
				job.put("szdz",cysgly.getSzsf()+cysgly.getSzcs()+cysgly.getSzx());
			}

			out.write(job.toString());
			out.flush();
			out.close();
	}
	
}






