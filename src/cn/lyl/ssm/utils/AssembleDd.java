package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Ycdd;
import cn.lyl.ssm.service.impl.YcddServc;
import cn.lyl.ssm.vo.DdVo;

@Transactional
@Service(value="assembleDd")
public class AssembleDd {
	private DdVo ddvo;
	private Dd dd;
	@Autowired
	private Ycdd ycdd;
	@Autowired
	private YcddServc ycddServc;
	
	private List<DdVo> listvo = new ArrayList<DdVo>();
	
	public List<DdVo> getDdvo(List<Dd> list) throws Exception{
		listvo.clear();
		for(int i=0;i<list.size();i++) {
			dd = list.get(i);
			ycdd = ycddServc.find(String.valueOf(list.get(i).getId()));
			ddvo = new DdVo();
			ddvo.setDd(dd);
			ddvo.setYcdd(ycdd);
			switch(dd.getDdzt()) {
			case 1:
				ddvo.setJyzt("待处理");
				break;
			case 2:
				ddvo.setJyzt("已处理");
				break;
			case 3:
				ddvo.setJyzt("运输中");
				break;
			case 4:
				ddvo.setJyzt("已送达");
				break;
			case 5:
				ddvo.setJyzt("已签收");
				break;
			case 6:
				ddvo.setJyzt("退款中");
				break;
			case 7:
				ddvo.setJyzt("退款成功");
				break;
			case 8:
				ddvo.setJyzt("退款失败");
				break;
			}
			listvo.add(ddvo);
		}
		return listvo;
	}
}
