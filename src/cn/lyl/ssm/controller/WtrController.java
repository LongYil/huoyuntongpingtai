package cn.lyl.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Bzj;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.po.Wtr;
import cn.lyl.ssm.service.impl.BzjServc;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtzhServc;
import cn.lyl.ssm.service.impl.WtrServc;
import cn.lyl.ssm.utils.AssembleWtr;
import cn.lyl.ssm.vo.WtrVo;

/**
 * <p>Title:WtrController</p>
 * <p>Description: 委托人控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:27:35
 */
@Controller
public class WtrController extends BasicController<WtrServc> {
	
	@Autowired
	private JbyhServc jbyhServc;
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Wtr wtr;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private PtzhServc ptzhServc;
	@Autowired
	private AssembleWtr assembleWtr;
	
	private List<Wtr> listwtr = new ArrayList<Wtr>();
	private List<WtrVo> listvo = new ArrayList<WtrVo>();

	@RequestMapping("/wtr_save")
	public String save(Model model,Jbyh jbyh,Wtr wtr,HttpServletRequest request){
		jbyh.setYhmm(md5Encrypt.to32MD5(jbyh.getYhmm()));
		jbyhServc.save(jbyh);
		ptzh.setYhbh(jbyh.getYhbh());
		ptzh.setZhye(2000.0f);
		ptzhServc.save(ptzh);
		wtr.setYhbh(jbyh.getYhbh());
		servc.save(wtr);
		request.getSession().setAttribute("jbyh",jbyh);
		request.getSession().setAttribute("yhbh",jbyh.getYhbh());
		model.addAttribute("jbyh",jbyh);
		model.addAttribute("wtr",wtr);
		return "wtr_index";
	}
	
	@RequestMapping("/wtr_findWtrInfo")
	public String findWtrInfo(Model model,HttpServletRequest request){
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		wtr = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("wtr",wtr);
		model.addAttribute("jbyh",jbyh);
		return "wtr_jbxx";
	}
	@RequestMapping("wtr_updateWtrInfo")
	public void updateWtrInfo(String[] info,HttpServletRequest request){
		jbyh = (Jbyh) request.getSession().getAttribute("jbyh");
		wtr = servc.find(request.getSession().getAttribute("yhbh").toString());
		jbyh.setYhxm(info[0]);
		wtr.setGsmc(info[1]);
		wtr.setYhyx(info[2]);
		wtr.setYhsf(info[3]);
		wtr.setYhcs(info[4]);
		wtr.setYhx(info[5]);
		wtr.setXxdz(info[6]);
		jbyhServc.update(jbyh);
		servc.update(wtr);
	}
	
	@RequestMapping("wtr_findAllWtr")
	public String findAllWtr(Model model,String mc) {
		listwtr.clear();
		listvo.clear();
		listwtr = servc.findAll("");
		listvo = assembleWtr.getWtrVo(listwtr);
		model.addAttribute("listvo",listvo);
		model.addAttribute("wtrmc",mc);
		
		return "pt_sywtr";
	}
	
	
	
}
