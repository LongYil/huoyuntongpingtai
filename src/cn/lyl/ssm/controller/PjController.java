package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Pj;
import cn.lyl.ssm.service.impl.DdServc;
import cn.lyl.ssm.service.impl.PjServc;

/**
 * <p>Title:PjController</p>
 * <p>Description: 评价控制器</p>
 * @author 李银龙
 *		2017年10月19日
 *		下午10:41:36
 */
@Controller
public class PjController extends BasicController<PjServc> {
	@Autowired
	private Dd dd;
	@Autowired
	private DdServc ddServc;
	@RequestMapping("pj_fqpj")
	public String fqpj(String id,HttpServletRequest request) {		
		request.getSession().setAttribute("pj_id", id);
		return "wtr_txpjd";
	}
	
	
	@RequestMapping("pj_save")
	public void save(Pj pj,HttpServletRequest request) {
		String id = (String) request.getSession().getAttribute("pj_id");
		dd = ddServc.find(id);
		pj.setCys(dd.getCys());
		pj.setFhdld(dd.getFhdld());
		pj.setShdld(dd.getShdld());
		pj.setWtr(dd.getWtrbh());
		servc.save(pj);
	}
	
	
	
	
	
}
