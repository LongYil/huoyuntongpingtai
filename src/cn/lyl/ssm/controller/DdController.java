package cn.lyl.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.service.impl.DdServc;
import cn.lyl.ssm.service.impl.HyglyServc;
import cn.lyl.ssm.utils.GetRealColumnName;
import cn.lyl.ssm.vo.DdVo;
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
	private List<DdVo> listddvo = new ArrayList<DdVo>();
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
	public String dierbu(Model model,String ysdwid,HttpServletRequest request) throws Exception{
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
		dd.setCdbh(ysdw.getCyscd());
		dd.setFhdld(ysdw.getFhdldbh());
		dd.setFhdldsf(Math.round(ysdw.getDlfhfy()));
		dd.setShdldsf(Math.round(ysdw.getDlshfy()));
		dd.setCyssf(Math.round(ysdw.getYsfy()));
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
		}else if(yhlx.equals("cys")&&id.equals("2")){
			return "cys_ddxx";
		}else if(yhlx.equals("shdld")&&id.equals("4")){
			return "hy_dshqs";
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
	
	@RequestMapping("dd_wtrQrfk")//委托人确认付款
	public void wtrQrfk(Model model,String id,HttpServletRequest request,PrintWriter out) throws Exception{
		listdd.clear();
		String result = servc.wtrQrfk(id, request.getSession().getAttribute("yhbh").toString());
		out.write(result);
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
	public void wtrDelete(String id,PrintWriter out) {
		dd = servc.find(id);
		servc.delete(dd);
		out.write("true");
	}

	@RequestMapping("dd_hydldJd")//货运代理点用户确认接单
	public void hydldJd(String id,PrintWriter out,HttpServletRequest request) throws Exception {
		String result = servc.hydldQrjd(id,request.getSession().getAttribute("yhbh").toString());
		out.write(result);
	}
	
	@RequestMapping("dd_cysjd")//承运商处理订单，货物开始运输，更改订单状态为运输中
	public String cysjd(String[] id) throws Exception {
		servc.cysjd(id);
		return "redirect:dd_findAll.action?yhlx=4&id=2";
	}
	
	@RequestMapping("dd_shdldQs")//收货代理点确认收货
	public void shdldQs(String id,PrintWriter out,HttpServletRequest request) throws Exception {
		String result = servc.shdldQs(id,request.getSession().getAttribute("yhbh").toString());
		out.write(result);
	}

	@RequestMapping("dd_cysFindAllDd")//承运商移动端查询订单  id为订单状态码，yhbh为承运商编号
	public void cysFindAllDd(String id,String yhbh,HttpServletResponse response) throws Exception {
		    listddvo.clear();
		    
		    response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			JSONArray array = new JSONArray();
			listddvo = servc.cysFindAllDd(id,yhbh);
			
		    for(DdVo bean:listddvo){
		         //单个用户JSON对象 
				   JSONObject obj = new JSONObject();
				   try{
					   obj.put("jyzt",bean.getJyzt());
					   obj.put("hwmc", bean.getHwmc());
					   obj.put("shdldmc", bean.getShdldmc());
					   obj.put("shdlddz", bean.getShdlddz());
					   obj.put("spjs", bean.getSpjs());
					   obj.put("zfy", bean.getZfy());
					   obj.put("ysfy", bean.getYsfy());
					   obj.put("qt", bean.getQt());
					   obj.put("id", bean.getId());
				   }catch (Exception e) {
				}
				   array.put(obj); 
			   }
			out.write(array.toString());
			out.flush();
			out.close();
	}
	
	@RequestMapping("dd_cysQrsd")//承运商在App签收
	public void cysQrsd(String id) {
		dd = servc.find(id);
		dd.setDdzt(4);
		dd.setSjsdsj(getDateAndTime.getStandardDateAndTime());
		servc.update(dd);
	}
	
	
	
	
}
