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
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.WlxServc;
import cn.lyl.ssm.utils.AssembleWlx;
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
	private List<Cysgly> listcysgly = new ArrayList<Cysgly>();
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private AssembleWlx assembleWlx;
	@Autowired
	private Wlx wlx;
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
	
	@RequestMapping("wlx_findByCdid")//承运商：根据车队编号查询该车队的所有线路
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
	
	@RequestMapping("wlx_HyFindByCdid")//承运商：根据车队编号查询该车队的所有线路
	public String HyFindByCdid(String id,String mc,Model model,HttpServletRequest request){
		listwlx.clear();
		
		cysgly = (Cysgly)request.getSession().getAttribute("cysgly");
		listwlx = servc.findByCdid(id);
		String glybh = request.getSession().getAttribute("glybh").toString();
		String zhmc = request.getSession().getAttribute("zhmc").toString();
		
		model.addAttribute("glybh",glybh);
		model.addAttribute("zhmc",zhmc);
		model.addAttribute("listwlx",listwlx);
		model.addAttribute("cdxlmc",mc);
		return "hy_xlgl";
	}
	
	@RequestMapping("wlx_HyFindByCysid")//货运代理点：根据承运商编号查找所有运输线路
	public String HyFindByCysid(String id,String mc,Model model,HttpServletRequest request) throws Exception{
		listwlx.clear();
		listwlxvo.clear();
		
		listwlx = servc.findByCysid(id);
		String hy_id = request.getSession().getAttribute("hy_id").toString();
		String hy_mc1 = request.getSession().getAttribute("hy_mc1").toString();
		String hy_mc2 = request.getSession().getAttribute("hy_mc2").toString();
		listwlxvo = assembleWlx.getWlxVo(listwlx);
		model.addAttribute("listwlxvo",listwlxvo);
		
		model.addAttribute("hy_id",hy_id);
		model.addAttribute("hy_mc1",hy_mc1);
		model.addAttribute("hy_mc2",hy_mc2);
		
		model.addAttribute("mc",mc);
		return "hy_zhcysxl";
	}

	@RequestMapping("wlx_glySave")//承运商用户保存运输线路
	public void glySave(Wlx wlx,HttpServletRequest request){
		cysgly = (Cysgly)request.getSession().getAttribute("cysgly");
		wlx.setCdbh(Integer.parseInt(request.getSession().getAttribute("cdwlxid").toString()));
		wlx.setYhbh(cysgly.getYhbh());
		wlx.setCysbh(cysgly.getCysbh());
		servc.save(wlx);
	}
	@RequestMapping("wlx_glyfindByYhbh")
	public String glyfindByYhbh(Model model,HttpServletRequest request){
		listwlxvo.clear();
		
		cysgly = (Cysgly)request.getSession().getAttribute("cysgly");
		listwlxvo = servc.findByCysYhid(cysgly.getYhbh().toString());
		model.addAttribute("listwlxvo",listwlxvo);
		return "cys_cdsyxl";
	}
	
	@RequestMapping("wlx_dldFindByYhbh")//货运代理点:查找所拥有的运输线路
	public String dldFindByYhbh(Model model,HttpServletRequest request) throws Exception{
		listwlx.clear();
		listwlxvo.clear();
		
		listwlx = servc.dldFindByYhbh(request.getSession().getAttribute("yhbh").toString());
		listwlxvo = assembleWlx.getWlxVo(listwlx);
		model.addAttribute("listwlxvo",listwlxvo);
		return "hy_syxl";
	}
	
	@RequestMapping("wlx_hyFindByGlyid")//货运代理点用户查找管理员的所有物流线
	public String hyFindByGlyid(String id,String mc1,String mc2,Model model) {
		listcysgly.clear();
		listwlxvo.clear();
		
		listcysgly = cysglyServc.findByHyglyid(id);
		listwlxvo = servc.findByGlyid(listcysgly);
		model.addAttribute("listwlxvo",listwlxvo);
		model.addAttribute("mc1",mc1);
		model.addAttribute("mc2",mc2);
		return "hy_zhsyxl";
	}
	
	@RequestMapping("wlx_cysFindAll")
	public String cysFindAll(Model model,HttpServletRequest request) {
		listwlxvo.clear();
		
		cysgly = (Cysgly)request.getSession().getAttribute("cysgly");
		listwlxvo = servc.findByCysglyid(cysgly.getCysbh().toString());
		
		model.addAttribute("listwlxvo",listwlxvo);
		return "cys_cdsyxl";
	}
	
	@RequestMapping("wlx_cysyhScxl")
	public void cysyhScxl(String id,PrintWriter out) {
		wlx = servc.find(id);
		String result = servc.cysyhDelete(wlx);
		out.print(result);
	}
	
}
