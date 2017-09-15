package cn.lyl.ssm.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.YscdServc;
import cn.lyl.ssm.utils.AssembleYscd;
import cn.lyl.ssm.vo.YscdVo;

/**
 * <p>Title:YscdController</p>
 * <p>Description: 运输车队控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:28:07
 */
@Controller
public class YscdController extends BasicController<YscdServc> {
	
	private List<Yscd> listcd = new ArrayList<Yscd>();
	private List<YscdVo> listcdvo = new ArrayList<YscdVo>();
	private List<Cysgly> listgly = new ArrayList<Cysgly>();
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private YscdServc yscdServc;
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private Cysgly tempcysgly;
	@Autowired
	private AssembleYscd assembleYscd;
	@RequestMapping("/yscd_save")
	public void save(Yscd yscd,HttpServletRequest request){//承运商保存运输车队的方法
		tempcysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		
		yscd.setYhbh(tempcysgly.getYhbh());
		yscd.setCysbh(tempcysgly.getYhbh());
		yscd.setFpzt(0);
		servc.save(yscd);
	}
	
	@RequestMapping("/yscd_cysFindAll")//承运商查找所拥有的运输车队
	public String cysFindAll(Model model,HttpServletRequest request){
		listcd.clear();
		
		cysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		listcd = servc.jbyhFindAll(String.valueOf(cysgly.getYhbh()));
		model.addAttribute("listcd",listcd);
		return "cys_cdcdgl";
	}


	@RequestMapping("/yscd_cysFindByGlyid")//查找运输车队管理员的所有车队，id为管理员的管理员编号
	public String cysFindByGlyid(Model model,String id,String mc,HttpServletRequest request){
		listcd.clear();
		
		listcd = servc.cysFindByGlyid(id);
		request.getSession().setAttribute("glybh",id);
		request.getSession().setAttribute("zhmc", mc);
		model.addAttribute("listcd",listcd);
		model.addAttribute("glyid",id);
		model.addAttribute("zhmc",mc);
		return "cys_cdzhcd";
	}
	
	@RequestMapping("/yscd_hyFindByGlyid")//查找运输车队管理员的所有车队，id为管理员的管理员编号
	public String hyFindByGlyid(Model model,String id,String mc,HttpServletRequest request){
		listcd.clear();
		
		listcd = servc.cysFindByGlyid(id);
		request.getSession().setAttribute("glybh",id);
		request.getSession().setAttribute("zhmc", mc);
		model.addAttribute("listcd",listcd);
		model.addAttribute("glyid",id);
		model.addAttribute("zhmc",mc);
		return "hy_cdgl";
	}
	
	
	
	@RequestMapping("yscd_jbyhFindAllCd")//承运商用户查找所有没有分配管理员的车队
	public String jbyhFindAllCd(Model model,HttpServletRequest request){
		tempcysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		listcd.clear();
		
		listcd = servc.cysFindAll(String.valueOf(tempcysgly.getYhbh()));
		model.addAttribute("listcd",listcd);
		return "cys_cdzhtjcd";
	}
	@RequestMapping("yscd_jbyhAddCdToGly")//给承运商管理员添加车队，cdbh数组为选中的车队编号
	public void jbyhAddCdToGly(String[] cdbh,HttpServletRequest request) throws Exception{
		String glybh = request.getSession().getAttribute("glybh").toString();
		servc.jbyhAddCdToGly(cdbh, glybh);
	}
	
	@RequestMapping("yscd_hyFindAllYscd")//货运代理点用户查找所有车队
	public String hyFindAllYscd(Model model,HttpServletRequest request) throws Exception{
		listcd.clear();
		listcdvo.clear();
		
		listcd = servc.hyFindAllYscd(request.getSession().getAttribute("yhbh").toString());
		listcdvo = assembleYscd.getAllYscd(listcd);
		model.addAttribute("listcdvo",listcdvo);
		return "hy_sycd";
	}
	
	
	@RequestMapping("yscd_hyFindYscdByGlyid")//货运代理点用户查看指定管理员所有车队
	public String hyFindYscdByGlyid(Model model,String id,String mc1,String mc2) throws Exception {
		listgly.clear();
		listcdvo.clear();
		listgly = cysglyServc.findByHyglyid(id);
		listcdvo = yscdServc.findYscdByCysgly(listgly);
		model.addAttribute("listcdvo",listcdvo);
		model.addAttribute("mc1",mc1);
		model.addAttribute("mc2",mc2);
		return "hy_zhcd";
	}
	
	@RequestMapping("yscd_cysSccd")
	public void cysSccd(String id,HttpServletRequest request,PrintWriter out) throws Exception {//承运商删除指定帐号的运输车队
		tempcysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		String result = servc.cysSccd(id,String.valueOf(tempcysgly.getYhbh()));
		out.write(result);
	}
	
	@RequestMapping("yscd_cysyhSccd")//承运商用户删除所有车队
	public void cysyhSccd(String id,PrintWriter out) throws Exception {
		String result = servc.cysyhSccd(id);
		out.write(result);
	}
	
}
