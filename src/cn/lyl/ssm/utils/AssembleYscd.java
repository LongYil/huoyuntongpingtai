package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.vo.YscdVo;

/**
 * <p>Title:AssembleYscd</p>
 * <p>Description:拼装运输车队 </p>
 * @author 李银龙
 *		2017年8月30日
 *		上午11:00:16
 */
@Transactional
@Service(value="AssembleYscd")
public class AssembleYscd {
	private List<Yscd> listcd = new ArrayList<Yscd>();
	private List<YscdVo> listcdvo = new ArrayList<YscdVo>();
	@Autowired
	private CysglyServc cysglyServc;
	private Cysgly cysgly;
	private YscdVo yscdVo;
	
	public List<YscdVo> getAllYscd(List<Yscd> arg) throws Exception{
		
		listcd.clear();
		listcdvo.clear();
		listcd.addAll(arg);

		for(int i=0;i<listcd.size();i++){
			cysgly = new Cysgly();
			yscdVo = new YscdVo();
			cysgly = cysglyServc.findByGlyid(String.valueOf(listcd.get(i).getCysbh()));
			yscdVo.setYscd(listcd.get(i));
			yscdVo.setGsmc(cysgly.getGsmc());
			yscdVo.setLxdh(cysgly.getLxdh());
			listcdvo.add(yscdVo);
		}
		return listcdvo;
	}
	
}
