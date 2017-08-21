package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.service.impl.WlxServc;
import cn.lyl.ssm.vo.WlxVo;

/**
 * <p>Title:WlxController</p>
 * <p>Description:物流线控制器 </p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:27:24
 */
@Controller
public class WlxController extends BasicController<WlxServc> {
	private List<Wlx> listwlx = new ArrayList<Wlx>();
	private List<WlxVo> listwlxvo = new ArrayList<WlxVo>();
	@Autowired
	private Cysgly cysgly;
	
	@RequestMapping("/wlx_save")
	public void save(Wlx wlx,HttpServletRequest request){
		wlx.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		servc.save(wlx);
	}
	
	@RequestMapping("/wlx_findAll")
	public String findAll(Model model,HttpServletRequest request){
		listwlx.clear();
		listwlx = servc.findAll(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listwlx", listwlx);
		return "cys_xlgl";
	}
	
	@RequestMapping("wlx_findByCdid")//根据车队编号查询该车队的所有线路
	public String findByCdid(String id,String mc,Model model,HttpServletRequest request){
		listwlx.clear();
		cysgly = (Cysgly)request.getSession().getAttribute("cysgly");
		listwlx = servc.findByCdid(id);
		request.getSession().setAttribute("cdwlxid",id);
		model.addAttribute("listwlx",listwlx);
		model.addAttribute("cdxlmc",mc);
		model.addAttribute("cdxlid",id);
		return "cys_cdxlgl";
	}

	@RequestMapping("wlx_glySave")//承运商用户保存运输线路
	public void glySave(Wlx wlx,HttpServletRequest request){
		cysgly = (Cysgly)request.getSession().getAttribute("cysgly");
		wlx.setCdbh(Integer.parseInt(request.getSession().getAttribute("cdwlxid").toString()));
		wlx.setYhbh(cysgly.getYhbh());
		wlx.setCysbh(cysgly.getCysbh());
		servc.save(wlx);
	}
	@RequestMapping("wlx_glyfindByYhbh")//
	public String glyfindByYhbh(Model model,HttpServletRequest request){
		cysgly = (Cysgly)request.getSession().getAttribute("cysgly");
		listwlxvo.clear();
		listwlxvo = servc.findByCysYhid(cysgly.getYhbh().toString());
		model.addAttribute("listwlxvo",listwlxvo);
		return "cys_cdsyxl";
	}
	

}
