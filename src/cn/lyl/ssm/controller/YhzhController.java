package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Yhzh;
import cn.lyl.ssm.service.impl.YhzhServc;

/**
 * <p>Title:YhzhController</p>
 * <p>Description: 银行账户控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:27:49
 */
@Controller
public class YhzhController extends BasicController<YhzhServc> {
	@Autowired
	private Yhzh yhzh;
	
	@RequestMapping("/yhzh_saveorupdate")
	public void saveOrUpdate(Yhzh yhzh,HttpServletRequest request) throws Exception{
		
		this.yhzh = servc.find(request.getSession().getAttribute("yhbh").toString());
		if(this.yhzh.getCkrxm()!=""&&this.yhzh.getCkrxm()!=null){
			this.yhzh.setCkrxm(yhzh.getCkrxm());
			this.yhzh.setYhzh(yhzh.getYhzh());
			this.yhzh.setYhlx(yhzh.getYhlx());
		}else{
			yhzh.setYhbh(Integer.parseInt(request.getSession().getAttribute("yhbh").toString()));
			this.yhzh = yhzh;
		}
		servc.save(this.yhzh);
	}
	@RequestMapping("yhzh_find")
	public String find(Model model,HttpServletRequest request) throws Exception{
		yhzh = servc.find(request.getSession().getAttribute("yhbh").toString());
		model.addAttribute("yhzh",yhzh);
		return "zhxx";
	}

}
