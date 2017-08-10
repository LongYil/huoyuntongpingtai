package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.HyglyDao;
import cn.lyl.ssm.po.Hygly;

@Component(value="hyglyDaoImpl")
public class HyglyDaoImpl extends CommonDaoImpl<Hygly> implements HyglyDao {

	@Override
	public void save(Hygly entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Hygly entity) {
		//
		
	}

	@Override
	public void delete(Hygly entity) {
		//
		
	}

	@Override
	public Hygly find(String arg) {
		//
		return null;
	}

}
