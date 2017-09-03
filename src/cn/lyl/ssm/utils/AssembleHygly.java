package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.vo.HyglyVo;

/**
 * <p>Title:AssembleHygly</p>
 * <p>Description:拼装货运代理点管理员 </p>
 * @author 李银龙
 *		2017年9月1日
 *		下午9:20:01
 */
@Transactional
@Service(value="assembleHygly")
public class AssembleHygly {
	private List<Jbyh> listjbyh = new ArrayList<Jbyh>();
	private List<HyglyVo> listvo = new ArrayList<HyglyVo>();
	private List<Hygly> listgly = new ArrayList<Hygly>();
	private HyglyVo glyvo;
	private Hygly gly;
	private Jbyh jbyh;
	public List<HyglyVo> getGlyvoList(List<Jbyh> list1,List<Hygly> list2){
		for(int i=0;i<list1.size();i++) {
			glyvo = new HyglyVo();
			gly = new Hygly();
			jbyh = new Jbyh();
			gly = list2.get(i);
			jbyh = list1.get(i);
			glyvo.setHygly(gly);
			glyvo.setYhm(jbyh.getYhm());
			glyvo.setYhxm(jbyh.getYhxm());
			listvo.add(glyvo);
		}
		return listvo;	
	}
	
}
