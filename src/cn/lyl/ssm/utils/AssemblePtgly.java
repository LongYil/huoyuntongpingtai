package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Ptgly;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.service.impl.PtglyServc;
import cn.lyl.ssm.vo.PtglyVo;

@Transactional
@Service(value="assemblePtgly")
public class AssemblePtgly {
	@Autowired
	private PtglyServc ptglyServc;
	private Jbyh jbyh;
	@Autowired
	private JbyhServc jbyhServc;
	private List<PtglyVo> listvo = new ArrayList<PtglyVo>();
	
	public List<PtglyVo> getPtglyVo(List<Ptgly> list){
		for(int i=0;i<list.size();i++) {
			PtglyVo ptglyVo = new PtglyVo();
			ptglyVo.setPtgly(list.get(i));
			jbyh = jbyhServc.find(String.valueOf(list.get(i).getGlybh()));
			ptglyVo.setJsmc("");
			ptglyVo.setYhm(jbyh.getYhm());
			ptglyVo.setYhxm(jbyh.getYhxm());
			ptglyVo.setYhsj(jbyh.getYhsj());
			listvo.add(ptglyVo);
		}
		return listvo;
	}
		
}
