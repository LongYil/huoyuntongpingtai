package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		
		request.getSession().setAttribute("listYsdw",listYsdw);
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
	public void disanbu(String shid,HttpServletRequest request){
		listYsdw.clear();
		
		listYsdw = (List<Ysdw>) request.getSession().getAttribute("listYsdw");
		String ysdwid = request.getSession().getAttribute("ysdwid").toString();
		ysdw = listYsdw.get(Integer.parseInt(ysdwid));
		dd = (Dd) request.getSession().getAttribute("dd");
		dd.setCys(ysdw.getCysbh());
		dd.setFhdld(ysdw.getFhdldbh());
		dd.setShdld(Integer.parseInt(shid));
		dd.setWtrbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		dd.setYjyf(Math.round(ysdw.getYjfy()));
		dd.setDdzt(1);
		servc.save(dd);
	}
		
	@RequestMapping("dd_findAll")
	public String findAll(Model model,String yhlx,String id,HttpServletRequest request){
		listdd.clear();
		
		yhlx = getRealColumnName.getColumnName(yhlx);
		listdd = servc.findAllDdxx(yhlx,id,request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("listdd",listdd);
		return "ddxx";
	}
	
	
	
	
	
	
	
	
	
}
