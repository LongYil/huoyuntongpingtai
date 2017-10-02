package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Cys;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.vo.CysVo;

/**
 * <p>Title:AssembleCys</p>
 * <p>Description: 拼装承运商实体</p>
 * @author 李银龙
 *		2017年10月2日
 *		下午4:35:11
 */
@Transactional
@Service(value="assembleCys")
public class AssembleCys {
	private List<CysVo> listvo = new ArrayList<CysVo>();
	
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Cys cys;
	@Autowired
	private JbyhServc jbyhServc;
	
	private CysVo cysVo;
	
	public List<CysVo> getCysVo(List<Cys> list){
		listvo.clear();
		for(int i=0;i<list.size();i++) {
			cysVo = new CysVo();
			
			jbyh = jbyhServc.find(String.valueOf(list.get(i).getYhbh()));
			cys = list.get(i);
			
			cysVo.setCys(cys);
			cysVo.setLxr(jbyh.getYhxm());
			
			listvo.add(cysVo);
		}
		
		return listvo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
