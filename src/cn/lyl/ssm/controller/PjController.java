package cn.lyl.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Pj;
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
	
	@RequestMapping("pj_start")
	public void start(String id) {		
		
	}
	
	
	@RequestMapping("pj_save")
	public void save() {
		
	}
	
	
	
	
	
}
