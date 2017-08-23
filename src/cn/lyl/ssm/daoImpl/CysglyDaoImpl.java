package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.CysglyDao;
import cn.lyl.ssm.po.Cysgly;

@Component(value="cysglyDao")
public class CysglyDaoImpl extends CommonDaoImpl<Cysgly> implements CysglyDao {

	@Override
	public void save(Cysgly entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Cysgly entity) {
		ht.update(entity);		
	}

	@Override
	public void delete(Cysgly entity) {
		//
		
	}

	@Override
	public Cysgly find(String arg) {
		return (Cysgly) ht.find("from Cysgly where yhbh = "+Integer.parseInt(arg)+"").get(0);
	}

	@Override
	public List<Cysgly> findAll(String arg) {
		return (List<Cysgly>) ht.find("from Cysgly where yhbh!=cysbh and yhbh = "+arg+"");
	}
	
	
	
}
