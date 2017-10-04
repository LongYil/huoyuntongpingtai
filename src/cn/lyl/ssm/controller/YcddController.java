package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Ycdd;
import cn.lyl.ssm.service.impl.YcddServc;

@Controller
public class YcddController extends BasicController<YcddServc> {
	
	@Autowired
	private Ycdd ycdd;
	
	
	@RequestMapping("ycdd_fqpc")
	public String fqpc(Model model,String id,HttpServletRequest request) throws Exception {
		request.getSession().setAttribute("ycdd_id", id);
		ycdd = servc.find(id);
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
		ycdd.setDdbh(Integer.parseInt(request.getSession().getAttribute("ycdd_id").toString()));
		ycdd.setFqsj(getDateAndTime.getStandardDateAndTime());
		String ddbh = request.getSession().getAttribute("ycdd_ddbh").toString();
		
		if(ddbh!=null&&ddbh!="") {
			ycdd.setId(Integer.parseInt(ddbh));
		}else {
			;
		}
		
		servc.save(ycdd);	
	}
	
	
	
}
