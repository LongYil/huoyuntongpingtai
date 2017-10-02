package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptgly;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtglyServc;
import cn.lyl.ssm.utils.AssemblePtgly;
import cn.lyl.ssm.vo.PtglyVo;

@Controller
public class PtglyController extends BasicController<PtglyServc> {
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Ptgly tempptgly;
	@Autowired
	private Ptgly ptgly;
	@Autowired
	private JbyhServc jbyhServc;
	@Autowired
	private AssemblePtgly assemblePtgly;
	
	private List<Ptgly> listgly = new ArrayList<Ptgly>();
	
	private List<PtglyVo> listglyvo = new ArrayList<PtglyVo>();
	
	@RequestMapping("pt_save")
	public void save(Model model,Jbyh jbyh,Ptgly ptgly,HttpServletRequest request) {
		tempptgly = (Ptgly) request.getSession().getAttribute("ptgly");
		jbyhServc.save(jbyh);
		ptgly.setYhbh(tempptgly.getYhbh());
		ptgly.setGlybh(jbyh.getYhbh());
		ptgly.setGlylx(2);
		servc.save(ptgly);
	}
	
	@RequestMapping("pt_findPtglyInfo")
	public String findPtglyInfo(Model model,HttpServletRequest request) {
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		ptgly = (Ptgly) request.getSession().getAttribute("ptgly");
		model.addAttribute("jbyh",jbyh);
		model.addAttribute("ptgly",ptgly);
		return "pt_jbxx";
	}
	
	@RequestMapping("pt_updateGlyInfo")
	public void updateGlyInfo(String[] info,HttpServletRequest request) {
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		ptgly = (Ptgly) request.getSession().getAttribute("ptgly");
		jbyh.setYhxm(info[0]);
		ptgly.setGsmc(info[1]);
		ptgly.setYhyx(info[2]);
		ptgly.setGssf(info[3]);
		ptgly.setGscs(info[4]);
		ptgly.setGsx(info[5]);
		ptgly.setXxdz(info[6]);
		servc.update(ptgly);
	}
	
	@RequestMapping("pt_findAll")
	public String findAll(Model model,HttpServletRequest request) {
		listglyvo.clear();
		listgly.clear();
		ptgly = (Ptgly) request.getSession().getAttribute("ptgly");
		listgly = servc.findAll(String.valueOf(ptgly.getYhbh()));
		listglyvo = assemblePtgly.getPtglyVo(listgly);
		model.addAttribute("listglyvo", listglyvo);
		return "pt_zhgl";
	}
	
	@RequestMapping("pt_deleteGly")
	public String deleteGly(String id) throws Exception {
		ptgly = servc.findById(id);
		servc.delete(ptgly);		
		return "redirect:pt_findAll.action";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
