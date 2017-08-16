package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Yhzh;
import cn.lyl.ssm.service.impl.YhzhServc;

@Controller
public class YhzhController extends BasicController<YhzhServc> {
	@Autowired
	private Yhzh yhzh;
	
	@RequestMapping("/yhzh_saveorupdate")
	public void saveOrUpdate(Yhzh yhzh,HttpServletRequest request){
		yhzh.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
		servc.save(yhzh);
	}
	@RequestMapping("yhzh_find")
	public String find(Model model,HttpServletRequest request){
		yhzh = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("yhzh",yhzh);

		return "zhxx";
	}

}
