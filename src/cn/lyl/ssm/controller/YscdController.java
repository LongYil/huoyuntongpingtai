package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.service.impl.YscdServc;

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
	@Autowired
	private Cysgly cysgly;
	
	@RequestMapping("/yscd_save")
	public void save(Yscd yscd,HttpServletRequest request){
		yscd.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		yscd.setFpzt(0);
		servc.save(yscd);
	}
	
	@RequestMapping("/yscd_cysFindAll")
	public String cysFindAll(Model model,HttpServletRequest request){
		cysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		listcd = servc.cysFindAll(String.valueOf(cysgly.getCysbh()));
		model.addAttribute("listcd",listcd);
		return "cys_cdcdgl";
	}


	@RequestMapping("/yscd_cysFindByGlyid")
	public String cysFindByGlyid(Model model,String id,HttpServletRequest request){
		
		listcd.clear();
		listcd = servc.cysFindByGlyid(id);
		
		model.addAttribute("listcd",listcd);
		model.addAttribute("glyid",id);
		return "cys_cdzhcd";
	}
	
	@RequestMapping("yscd_jbyhFindAllCd")
	public String jbyhFindAllCd(Model model,HttpServletRequest request){
		listcd.clear();
		listcd = servc.cysFindAll(request.getSession().getAttribute("yhbh").toString());

		model.addAttribute("listcd",listcd);
		return "cys_cdzhtjcd";
	}
	@RequestMapping("yscd_jbyhAddCdToGly")
	public void jbyhAddCdToGly(String[] cdbh,HttpServletRequest request){
		
		
		System.out.println(cdbh);
	}
	
	
}
