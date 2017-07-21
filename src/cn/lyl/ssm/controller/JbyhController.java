package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtyyfServc;

/**
 * <p>Title:JbyhController</p>
 * <p>Description: 基本用户控制器</p>
 * @author 李银龙
 *		2017年7月21日
 *		上午9:27:10
 */
@Controller
@RequestMapping("/jbyh")
public class JbyhController extends BasicController<JbyhServc> {
	
	@RequestMapping("/testssh")
	public String testssh() throws Exception{
		Jbyh jbyh = new Jbyh();
		jbyh.setYhbh(4);
		jbyh.setYhmm("李银龙");
		servc.save(jbyh);
		return "success";
	}
	
	
	
	
}
