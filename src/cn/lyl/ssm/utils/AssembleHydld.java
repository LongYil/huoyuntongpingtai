package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Hydld;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.vo.HyglyVo;

@Transactional
@Service(value="assembleHydld")
public class AssembleHydld {

	@Autowired
	private Jbyh jbyh;
	@Autowired
	private JbyhServc jbyhServc;
	
	private List<HyglyVo> listvo = new ArrayList<HyglyVo>();
	private HyglyVo hyglyvo;
	
	public List<HyglyVo> getHydldVo(List<Hydld> list){
		for(int i=0;i<list.size();i++) {
			jbyh = jbyhServc.find(String.valueOf(list.get(i).getYhbh()));
			hyglyvo = new HyglyVo();
			hyglyvo.setHydld(list.get(i));
			hyglyvo.setYhxm(jbyh.getYhxm());
			hyglyvo.setLxdh(jbyh.getYhsj());
			listvo.add(hyglyvo);
		}
		return listvo;
	}
}
