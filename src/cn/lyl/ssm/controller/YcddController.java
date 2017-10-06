package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Jyjl;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.po.Ycdd;
import cn.lyl.ssm.service.impl.DdServc;
import cn.lyl.ssm.service.impl.JyjlServc;
import cn.lyl.ssm.service.impl.PtzhServc;
import cn.lyl.ssm.service.impl.YcddServc;

@Controller
public class YcddController extends BasicController<YcddServc> {
	@Autowired
	private Ycdd ycdd;
	@Autowired
	private Dd dd;
	@Autowired
	private DdServc ddServc;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private PtzhServc ptzhServc;
	@Autowired
	private JyjlServc jyjlServc;
	
	private Jyjl jyjl;
	
	@RequestMapping("ycdd_fqpc")
	public String fqpc(Model model,String id,HttpServletRequest request) throws Exception {
		request.getSession().setAttribute("ycddid", id);
		ycdd = servc.find(id);
		dd = ddServc.find(id);
		dd.setDdzt(6);
		ddServc.update(dd);
		if(ycdd.getFqsj()!=null&&ycdd.getFqsj()!="") {
			request.getSession().setAttribute("ycdd_ddbh",ycdd.getDdbh());
		}else {
			request.getSession().setAttribute("ycdd_ddbh","");
		}
		model.addAttribute("ycdd",ycdd);
		return "wtr_txpcd";
	}
	
	@RequestMapping("ycdd_save")
	public void save(Ycdd ycdd,HttpServletRequest request) {
		ycdd.setDdbh(Integer.parseInt(request.getSession().getAttribute("ycddid").toString()));
		ycdd.setFqsj(getDateAndTime.getStandardDateAndTime());
		String ddbh = request.getSession().getAttribute("ycdd_ddbh").toString();
		if(ddbh!=null&&ddbh!="") {
			ycdd.setId(Integer.parseInt(ddbh));
		}else {
			;
		}
		servc.save(ycdd);
	}
	
	@RequestMapping("ycdd_fqcl")//发起异常订单处理
	public String fqcl(Model model,String id,HttpServletRequest request) throws Exception {
		request.getSession().setAttribute("fqcl_id",id);
		ycdd = servc.find(id);
		model.addAttribute("ycdd",ycdd);
		return "pt_txpcd";
	}
	
	@RequestMapping("ycdd_clpc")
	public void clpc(String[] info,HttpServletRequest request) throws Exception {//处理异常订单
		String id = request.getSession().getAttribute("fqcl_id").toString();
		if(info[0].equals("")) {
			info[0] = "0";
		}
		if(info[1].equals("")) {
			info[1] = "0";
		}
		if(info[2].equals("")) {
			info[2] = "0";
		}
		
		Float sjje = Float.parseFloat(info[0])+Float.parseFloat(info[1])+Float.parseFloat(info[2]);
		ycdd = servc.find(id);
		dd = ddServc.find(id);
		dd.setDdzt(7);
		ddServc.update(dd);
		ycdd.setSjje(sjje);
		ycdd.setDdzt(2);
		ycdd.setClsj(getDateAndTime.getStandardDateAndTime());
		servc.update(ycdd);
		ptzh = ptzhServc.find(String.valueOf(dd.getWtrbh()));//退还货款到委托人账户
		ptzh.setZhye(ptzh.getZhye()+sjje);	
		ptzhServc.update(ptzh);
		jyjl = new Jyjl();
		jyjl.setYhbh(dd.getWtrbh());//存储委托人交易记录
		jyjl.setJyje(Math.round(sjje));
		jyjl.setJysj(getDateAndTime.getStandardDateAndTime());
		jyjl.setJyzt(2);
		jyjl.setJylx(7);
		jyjlServc.save(jyjl);
		if(info[0].equals("0")) {
			;
		}else {
			ptzh = ptzhServc.find(String.valueOf(dd.getFhdld()));
			ptzh.setZhye(ptzh.getZhye()-Float.parseFloat(info[0]));
			ptzhServc.update(ptzh);
			jyjl = new Jyjl();
			jyjl.setYhbh(dd.getFhdld());
			jyjl.setJyje(Math.round(Float.parseFloat(info[0])));
			jyjl.setJysj(getDateAndTime.getStandardDateAndTime());
			jyjl.setJyzt(2);
			jyjl.setJylx(8);
			jyjlServc.save(jyjl);
		}
		if(info[1].equals("0")) {
			;
		}else {
			ptzh = ptzhServc.find(String.valueOf(dd.getCys()));
			ptzh.setZhye(ptzh.getZhye()-Float.parseFloat(info[1]));
			ptzhServc.update(ptzh);
			jyjl = new Jyjl();
			jyjl.setYhbh(dd.getFhdld());
			jyjl.setJyje(Math.round(Float.parseFloat(info[1])));
			jyjl.setJysj(getDateAndTime.getStandardDateAndTime());
			jyjl.setJyzt(2);
			jyjl.setJylx(8);
			jyjlServc.save(jyjl);
		}
		if(info[2].equals("0")) {
			;
		}else {
			ptzh = ptzhServc.find(String.valueOf(dd.getShdld()));
			ptzh.setZhye(ptzh.getZhye()-Float.parseFloat(info[2]));
			ptzhServc.update(ptzh);
			jyjl = new Jyjl();
			jyjl.setYhbh(dd.getFhdld());
			jyjl.setJyje(Math.round(Float.parseFloat(info[2])));
			jyjl.setJysj(getDateAndTime.getStandardDateAndTime());
			jyjl.setJyzt(2);
			jyjl.setJylx(8);
			jyjlServc.save(jyjl);
		}
		
	}
	
	
}
