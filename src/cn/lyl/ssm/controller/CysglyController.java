package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lyl.ssm.po.Cys;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.service.impl.CysServc;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.JbyhServc;

/**
 * <p>Title:CysglyController</p>
 * <p>Description: 承运商管理员控制器</p>
 * @author 李银龙
 *		2017年8月10日
 *		下午8:31:23
 */
@Controller
public class CysglyController extends BasicController<CysglyServc> {
	@Autowired
	private JbyhServc jbyhServc;
	@Autowired
	private CysServc cysServc;
	
	//个人承运商的保存方法：自己是自己的管理员，不能再添加管理员
	@RequestMapping("/cysgly_save1")
	public String save(Jbyh jbyh,Cys cys,Cysgly cysgly){
		jbyhServc.save(jbyh);
		cys.setLxdh(jbyh.getYhsj());
		cysgly.setLxdh(jbyh.getYhsj());
		cys.setHylx(String.valueOf(jbyh.getYhlx()));
		cys.setYhbh(jbyh.getYhbh());
		cysgly.setYhbh(jbyh.getYhbh());
		
		cysServc.save(cys);
		servc.save(cysgly);
		return "success";
	}
	
	
	
}
