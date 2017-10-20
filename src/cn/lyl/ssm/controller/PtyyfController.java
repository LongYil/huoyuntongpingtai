package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptgly;
import cn.lyl.ssm.po.Ptjs;
import cn.lyl.ssm.po.Ptyyf;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.po.Yhzh;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtglyServc;
import cn.lyl.ssm.service.impl.PtjsServc;
import cn.lyl.ssm.service.impl.PtyyfServc;
import cn.lyl.ssm.service.impl.PtzhServc;
import cn.lyl.ssm.service.impl.YhzhServc;

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
	@Autowired
	private Yhzh yhzh;
	@Autowired
	private YhzhServc yhzhServc;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private PtzhServc ptzhServc;
	@Autowired
	private Ptjs ptjs;
	@Autowired
	private PtjsServc ptjsServc;
	
	@RequestMapping("ptyyf_save")
	public String save(Jbyh jbyh,Ptyyf ptyyf,Ptgly ptgly,HttpServletRequest request){
		
		if(jbyh.getYhm()!=""&&jbyh.getYhm()!=null) {
			jbyh.setYhmm(md5Encrypt.to32MD5(jbyh.getYhmm()));
			jbyhServc.save(jbyh);
			ptyyf.setYhbh(jbyh.getYhbh());
			ptgly.setGlybh(jbyh.getYhbh());
			ptgly.setYhbh(jbyh.getYhbh());
			
			ptzh.setZhye(0.0f);
			ptzh.setYhbh(1);
			ptzhServc.save(ptzh);
			
			yhzh.setYhbh(jbyh.getYhbh());
			yhzhServc.save(yhzh);
			
			ptgly.setGlylx(1);
			
			servc.save(ptyyf);
			ptglyServc.save(ptgly);
			
			ptjs.setCys("inline-block");
			ptjs.setCzwlb("inline-block");
			ptjs.setHydld("inline-block");
			ptjs.setJdbzj("inline-block");
			ptjs.setJsgl("inline-block");
			ptjs.setSsdd("inline-block");
			ptjs.setTxwlb("inline-block");
			ptjs.setWtr("inline-block");
			ptjs.setZhgl("inline-block");
			ptjs.setZhugl("inline-block");
			ptjs.setJsmc("超级管理员");
			
			ptjsServc.save(ptjs);
			
			request.getSession().setAttribute("jbyh", jbyh);
			request.getSession().setAttribute("yhbh", jbyh.getYhbh());
			request.getSession().setAttribute("ptgly", ptgly);
			request.getSession().setAttribute("tempptgly", ptgly);
		}else {
			;
		}
		return "pt_index";
	}
}
