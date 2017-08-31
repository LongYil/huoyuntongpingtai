package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Clxx;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.service.impl.ClxxServc;
import cn.lyl.ssm.vo.ClxxVo;

/**
 * <p>Title:ClxxController</p>
 * <p>Description: 车辆信息控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:25:52
 */
@Controller
public class ClxxController extends BasicController<ClxxServc> {
	@Autowired
	private Clxx clxx;
	@Autowired
	private Cysgly cysgly;

	private List<Clxx> listclxx = new ArrayList<Clxx>();;
	private List<ClxxVo> listclxxvo = new ArrayList<ClxxVo>();
	
	@RequestMapping("/clxx_save")//个人车主保存车辆信息
	public void save(Clxx clxx,HttpServletRequest request){
		clxx.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		servc.save(clxx);
	}
	
	@RequestMapping("/clxx_gr_find")//个人车主查询车辆信息
	public String find(Model model,HttpServletRequest request){
		clxx = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("clxx",clxx);
		return "cys_grclgl";
	}
	@RequestMapping("/clxx_glyFindById")//根据车队id查询该车队的所有车辆
	public String glyFindById(String id,String mc,Model model,HttpServletRequest request){
		request.getSession().setAttribute("cdclid",id);
		listclxx = servc.findByCdid(id);
		model.addAttribute("cdmc",mc);
		model.addAttribute("cdclid", id);
		model.addAttribute("listclxx",listclxx);
		return "cys_cdclgl";
	}
	@RequestMapping("/clxx_hyFindById")//货运代理点：根据车队id查询该车队的所有车辆
	public String hyFindById(String id,String mc,Model model,HttpServletRequest request){
		String glybh = request.getSession().getAttribute("glybh").toString();
		String zhmc = request.getSession().getAttribute("zhmc").toString();
		listclxx = servc.findByCdid(id);
		model.addAttribute("cdmc",mc);
		model.addAttribute("cdclid", id);
		model.addAttribute("glybh", glybh);
		model.addAttribute("zhmc", zhmc);
		model.addAttribute("listclxx",listclxx);
		return "hy_clxx";
	}

	@RequestMapping("clxx_cd_save")//运输车队用户保存车辆信息
	public void cd_save(Clxx clxx,HttpServletRequest request){
		cysgly = (Cysgly) request.getSession().getAttribute("cysgly");
		clxx.setCdbh(Integer.parseInt(request.getSession().getAttribute("cdclid").toString()));
		clxx.setYhbh(cysgly.getYhbh());
		clxx.setCysbh(cysgly.getCysbh());
		servc.save(clxx);
	}
	@RequestMapping("clxx_yhFindAll")
	public String yhFindAll(Model model,HttpServletRequest request){
		listclxxvo.clear();
		listclxxvo = servc.findByYhbh(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listclxxvo",listclxxvo);
		return "cys_cdsycl";
	}
	
}
