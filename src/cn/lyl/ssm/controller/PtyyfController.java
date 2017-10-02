package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptgly;
import cn.lyl.ssm.po.Ptyyf;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtglyServc;
import cn.lyl.ssm.service.impl.PtyyfServc;

/**
 * <p>Title:PtyyfController</p>
 * <p>Description:平台运营方控制器 </p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:27:08
 */
@Controller
public class PtyyfController extends BasicController<PtyyfServc> {
	
	@Autowired
	private PtglyServc ptglyServc;
	@Autowired
	private JbyhServc jbyhServc;
	
	@RequestMapping("/ptyyf_save")
	public String save(Jbyh jbyh,Ptyyf ptyyf,Ptgly ptgly,HttpServletRequest request){
		
		if(jbyh.getYhm()!=""&&jbyh.getYhm()!=null) {
			jbyhServc.save(jbyh);
			ptyyf.setYhbh(jbyh.getYhbh());
			ptgly.setGlybh(jbyh.getYhbh());
			ptgly.setYhbh(jbyh.getYhbh());
			
			ptgly.setGlylx(1);
			servc.save(ptyyf);
			ptglyServc.save(ptgly);

			request.getSession().setAttribute("jbyh", jbyh);
			request.getSession().setAttribute("ptgly", ptgly);
			request.getSession().setAttribute("tempptgly", ptgly);
		}else {
			;
		}
		
		return "pt_index";
	}
}
