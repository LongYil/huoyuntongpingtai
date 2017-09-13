package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cysjs;
import cn.lyl.ssm.po.Cysqx;
import cn.lyl.ssm.service.impl.CysjsServc;
import cn.lyl.ssm.service.impl.CysqxServc;

@Controller
public class CysqxController extends BasicController<CysqxServc> {
	
	@Autowired
	private Cysjs cysjs;
	@Autowired
	private CysjsServc cysjsServc;
	@Autowired
	private Cysqx cysqx;
	
	@RequestMapping("cysqx_bcjs")
	public void bcjs(Cysqx cysqx,Cysjs cysjs,HttpServletRequest request) {
		cysjs.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		cysjsServc.save(cysjs);
		cysqx.setJsbh(cysjs.getId());
		servc.save(cysqx);
	}
	
	
	
	
	
}
