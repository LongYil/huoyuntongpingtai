package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.vo.CysglyVo;

/**
 * <p>Title:AssembleCysgly</p>
 * <p>Description: 拼装承运商管理员</p>
 * @author 李银龙
 *		2017年8月18日
 *		下午5:11:46
 */
@Component(value="assembleCysgly")
@Scope(value="prototype")
public class AssembleCysgly {
	private List<Jbyh> listjbyh = new ArrayList<Jbyh>();
	private List<Cysgly> listgly = new ArrayList<Cysgly>();
	private List<CysglyVo> listglyvo = new ArrayList<CysglyVo>();

	private CysglyVo cv;
	public List<CysglyVo> getAllVo(List<Jbyh> list1,List<Cysgly> list2){
		int size = list1.size();
		for(int i=0;i<size;i++){
			cv = new CysglyVo();
			cv.setId(i);
			cv.setYhbh(list1.get(i).getYhbh());
			cv.setYhm(list1.get(i).getYhm());
			cv.setYhxm(list1.get(i).getYhxm());
			cv.setYhsj(list1.get(i).getYhsj());
			cv.setYhyx(list2.get(i).getYhyx());
			cv.setGsmc(list2.get(i).getGsmc());
			cv.setSzsf(list2.get(i).getSzsf());
			cv.setSzcs(list2.get(i).getSzcs());
			cv.setSzx(list2.get(i).getSzx());
			listglyvo.add(cv);
		}
		return listglyvo;
	}
	
	
}
