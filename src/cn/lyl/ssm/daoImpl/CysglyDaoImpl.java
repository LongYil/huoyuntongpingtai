package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.CysglyDao;
import cn.lyl.ssm.po.Cys;
import cn.lyl.ssm.po.Cysgly;

@Component(value="cysglyDao")
@Scope(value="prototype")
public class CysglyDaoImpl extends CommonDaoImpl<Cysgly> implements CysglyDao {

	@Override
	public Cysgly find(String arg) throws Exception {
		return (Cysgly) getEntity.getEntity("Cysgly", "cysbh", arg, Cysgly.class);
	}

	@Override
	public List<Cysgly> findAll(String arg) {
		return (List<Cysgly>) ht.find("from Cysgly where yhbh!=cysbh and yhbh = "+arg+"");
	}

	@Override
	public List<Cysgly> findAllByCysbh(String arg) {
		return (List<Cysgly>) ht.find("from Cysgly where yhbh="+arg+"");
	}

	@Override
	public Cysgly findByGlyid(String arg) throws Exception {
		return (Cysgly) getEntity.getEntity("Cysgly", "cysbh", arg, Cysgly.class);
	}

	@Override
	public List<Cysgly> findByDlbh(String arg) {
		return (List<Cysgly>) ht.find("from Cysgly where dlbh = "+arg+"");
	}

	@Override
	public List<Cysgly> findByHyglyid(String arg) {//根据代理点id查找承运商
		return (List<Cysgly>) ht.find("from Cysgly where dlbh = "+arg+"");
	}

	@Override
	public List<Cys> ptFindAll() {
		return (List<Cys>) ht.find("from Cys");
	}
	
	
	
	
}
