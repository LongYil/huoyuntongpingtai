package cn.lyl.ssm.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.service.impl.DdServc;
import cn.lyl.ssm.service.impl.HyglyServc;
import cn.lyl.ssm.utils.GetRealColumnName;
import cn.lyl.ssm.vo.Ysdw;

/**
 * <p>Title:DdController</p>
 * <p>Description: 订单控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:26:12
 */
@Controller
public class DdController extends BasicController<DdServc> {
	
	private List<Ysdw> listYsdw = new ArrayList<Ysdw>();
	private List<Hygly> listhygly = new ArrayList<Hygly>();
	private List<Dd> listdd = new ArrayList<Dd>();
	@Autowired
	private Dd dd;
	@Autowired
	private Ysdw ysdw;
	@Autowired
	private HyglyServc hyglyServc;
	@Autowired
	private GetRealColumnName getRealColumnName;
	
	@RequestMapping("dd_diyibu")//第一步
	public String diyibu(Model model,Dd dd,HttpServletRequest request) throws Exception{
		listYsdw.clear();
		listYsdw.addAll(servc.findBestYsdw(dd));
		request.getSession().setAttribute("templistYsdw",listYsdw);
		request.getSession().setAttribute("dd", dd);
		model.addAttribute("listYsdw",listYsdw);
		return "dd_xzly";
	}
	
	@RequestMapping("dd_dierbu")//第二步
	public String dierbu(Model model,String ysdwid,HttpServletRequest request){
		listhygly.clear();	
		request.getSession().setAttribute("ysdwid", ysdwid);
		dd = (Dd) request.getSession().getAttribute("dd");
		listhygly = hyglyServc.findByShdd(dd);
		model.addAttribute("listhygly",listhygly);
		return "dd_shdld";
	}
	
	@RequestMapping("dd_disanbu")//第三步
	public void disanbu(String shid,HttpServletRequest request,PrintWriter out) throws Exception{
		listYsdw = (List<Ysdw>) request.getSession().getAttribute("templistYsdw");
		String ysdwid = request.getSession().getAttribute("ysdwid").toString();
		ysdw = listYsdw.get(Integer.parseInt(ysdwid));
		dd = (Dd) request.getSession().getAttribute("dd");
		dd.setCys(ysdw.getCysbh());
		dd.setFhdld(ysdw.getFhdldbh());
		dd.setShdld(Integer.parseInt(shid));
		dd.setWtrbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		dd.setYjyf(Math.round(ysdw.getYjfy()));
		dd.setDdzt(1);
		String result = servc.saveDd(dd,String.valueOf(ysdw.getYssx()),request.getSession().getAttribute("yhbh").toString());
		out.write(result);
	}

	@RequestMapping("dd_findAll")
	public String findAll(Model model,String yhlx,String id,HttpServletRequest request){
		listdd.clear();
		
		yhlx = getRealColumnName.getColumnName(yhlx);
		listdd = servc.findAllDdxx(yhlx,id,request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listdd",listdd);
		
		if(yhlx.equals("fhdld")&&id.equals("1")) {
			return "hy_ddxx";
		}else {
			return "ddxx";
		}
		
	}
	
	@RequestMapping("dd_wtrFindWfk")//委托人查找未付款订单
	public String wtrFindWfk(Model model,HttpServletRequest request){
		listdd.clear();
		listdd = servc.wtrFindWfk(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listdd",listdd);
		return "wtr_ddxx";
	}
	
	@RequestMapping("dd_findAllByYhlx")
	public String findAllByYhlx(Model model,String yhlx,HttpServletRequest request) {
		listdd.clear();
		yhlx = getRealColumnName.getColumnName(yhlx);
		listdd = servc.findAllByYhlx(yhlx,request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listdd",listdd);
		return "ddxx";
	}
	
	@RequestMapping("dd_findAllShAndFh")//货运代理点查找所有代理收货和代理发货订单
	public String findAllShAndFh(Model model,HttpServletRequest request) {
		listdd.clear();
		listdd = servc.findAllFhAndSh(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listdd",listdd);
		return "ddxx";
	}
	
	@RequestMapping("dd_cysFindAll")//承运商查找所有订单
	public String cysFindAll(Model model,HttpServletRequest request) {
		listdd.clear();
		listdd = servc.cysFindAll(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listdd",listdd);
		return "ddxx";
	}
	
	@RequestMapping("dd_wtrDelete")//委托人删除订单
	public String wtrDelete(String id) {
		dd = servc.find(id);
		servc.delete(dd);
		return "redirect:dd_wtrFindWfk";
	}

	
	@RequestMapping("dd_hydldJd")//货运代理点用户确认接单
	public String hydldJd(String id) {
		dd = servc.find(id);
		dd.setDdzt(2);
		servc.update(dd);
		return "redirect:dd_findAll.action?yhlx=2&id=1";
	}
	
	
}
