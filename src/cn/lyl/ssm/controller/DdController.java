package cn.lyl.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.service.impl.DdServc;

/**
 * <p>Title:DdController</p>
 * <p>Description: 订单控制器</p>
 * @author 李银龙
 *		2017年8月19日
 *		下午5:26:12
 */
@Controller
public class DdController extends BasicController<DdServc> {
	
	@RequestMapping("dd_save")
	public void save(Dd dd,HttpServletRequest request){
		
		
	}
}
