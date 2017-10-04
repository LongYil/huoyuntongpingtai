package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Wtr;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.vo.WtrVo;

@Transactional
@Service(value="assembleWtr")
public class AssembleWtr {

	private List<WtrVo> listvo = new ArrayList<WtrVo>();
	@Autowired
	private Wtr wtr;
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private JbyhServc jbyhServc;
	
	private WtrVo wtrvo;
	
	public List<WtrVo> getWtrVo(List<Wtr> list){
		for(int i=0;i<list.size();i++) {
			wtr = list.get(i);
			wtrvo = new WtrVo();
			wtrvo.setWtr(wtr);
			jbyh = jbyhServc.find(String.valueOf(list.get(i).getYhbh()));
			wtrvo.setYhxm(jbyh.getYhxm());
			wtrvo.setLxdh(jbyh.getYhsj());
			listvo.add(wtrvo);
		}
		return listvo;
	}
}
