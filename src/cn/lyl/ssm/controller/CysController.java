package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.lyl.ssm.service.impl.CysServc;
import cn.lyl.ssm.service.impl.JbyhServc;

/**
 * <p>Title:CysController</p>
 * <p>Description:承运商控制器 </p>
 * @author 李银龙
 *		2017年7月21日
 *		上午9:49:01
 */
@Controller
public class CysController  extends BasicController<CysServc> {
	
	@Autowired
	private JbyhServc jbyhServc;
	
	//个人承运商
	public String save(){
		
		return "";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
